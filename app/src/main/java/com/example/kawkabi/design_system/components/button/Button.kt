package com.example.kawkabi.design_system.components.button

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.text.Text
import com.example.kawkabi.design_system.theme.KawkabiTheme


@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    contentPadding: PaddingValues = PaddingValues(16.dp),
    isEnabled: Boolean = true,
    containerColor: Color = Color.Transparent,
    disabledContainerColor: Color = Color.Transparent,
    contentColor: Color = Color.Transparent,
    disabledContentColor: Color = Color.Transparent,
    borderStroke: BorderStroke? = null,
    content: @Composable RowScope.(contentColor: Color) -> Unit
) {
    val buttonBackgroundColor by animateColorAsState(
        if (isEnabled) containerColor else disabledContainerColor
    )

    val buttonContentColor by animateColorAsState(
        if (isEnabled) contentColor else disabledContentColor
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
            .clip(shape)
            .then(
                if (isEnabled) Modifier.clickable(
                    onClick = onClick,
                    interactionSource = remember { MutableInteractionSource() },
                    indication = ripple(),
                )
                else Modifier
            )
            .background(color = buttonBackgroundColor)
            .then(
                if (borderStroke != null) Modifier.border(border = borderStroke, shape = shape)
                else Modifier
            )
            .padding(contentPadding)
            .animateContentSize(
                animationSpec = spring(stiffness = Spring.StiffnessMedium),
                alignment = Alignment.Center
            )
    ) {

        content(buttonContentColor)
    }
}

@Preview(showBackground = true)
@Composable
private fun ButtonPreview() {
    KawkabiTheme {
        Button(
            onClick = {},
            containerColor = Color.White
        ) {
            Text(
                text = "Button",
                style = Theme.textStyle.title.bold,
                color = Theme.color.primary500,
            )
        }
    }
}