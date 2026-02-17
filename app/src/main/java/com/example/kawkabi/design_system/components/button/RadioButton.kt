package com.example.kawkabi.design_system.components.button

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.text.Text
import com.example.kawkabi.design_system.theme.KawkabiTheme


@Composable
fun RadioButton(
    isSelected: Boolean,
    onClick: (() -> Unit)?,
    label: String? = null,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(16.dp),
    isEnabled: Boolean = true
) {

    val animatedUnselectedContentColor by animateColorAsState(
        targetValue = if (isSelected || !isEnabled) Theme.color.primary600 else Theme.color.primary200
    )

    val clickableModifier = onClick?.let {
        Modifier.clickable(
            enabled = isEnabled,
            indication = null,
            interactionSource = remember { MutableInteractionSource() },
            role = Role.RadioButton
        ) {
            onClick()
        }
    } ?: Modifier

    Row(
        modifier = modifier
           ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(18.dp)
                .border(
                    width = 2.dp,
                    color = Theme.color.primary600,
                    shape = shape
                )
                .padding(4.dp)
                .background(animatedUnselectedContentColor, shape)
                .clip(shape)
                .then(clickableModifier),
        )

        label?.let { text ->
            Text(
                text = text,
                color = Theme.color.primary600,
                style = Theme.textStyle.headerSmall.medium
            )
        }

    }
}

@Preview
@Composable
private fun RadioButtonPreview() {
    KawkabiTheme {
        var selected by remember { mutableStateOf(true) }

        val animatedUnselectedContentColor by animateColorAsState(
            targetValue = if (selected) Theme.color.primary600 else Theme.color.primary200
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Theme.color.primary200,RoundedCornerShape(16.dp))
                .border(1.dp ,animatedUnselectedContentColor, RoundedCornerShape(16.dp))
                .padding(16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            RadioButton(
                isSelected = selected,
                label = "Label",
                isEnabled = true,
                onClick = {
                    selected = !selected
                }
            )
        }
    }
}