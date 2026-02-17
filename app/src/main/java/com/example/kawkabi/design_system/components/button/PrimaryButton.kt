package com.example.kawkabi.design_system.components.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.text.Text
import com.example.kawkabi.design_system.theme.KawkabiTheme

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    containerColor: Color = Theme.color.primary500,
    disabledContainerColor: Color = Theme.color.primary200,
    contentColor: Color = Color.White,
    disabledContentColor: Color = Color.White,
    contentPadding: PaddingValues = PaddingValues(
        horizontal = 16.dp,
        vertical = 10.dp
    ),
    shape: Shape = RoundedCornerShape(12.dp),

    ) {
    Button(
        onClick = { onClick() },
        modifier = modifier,
        isEnabled = isEnabled,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContentColor = disabledContentColor,
        disabledContainerColor = disabledContainerColor,
        contentPadding = contentPadding,
    ) {
        Text(
            text = text,
            style = Theme.textStyle.headerSmall.bold,
            color = contentColor
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun PrimaryButtonPreview() {
    KawkabiTheme {
        PrimaryButton(
            text = "Button",
            onClick = {},
            isEnabled = true,
            modifier = Modifier
        )
    }
}
