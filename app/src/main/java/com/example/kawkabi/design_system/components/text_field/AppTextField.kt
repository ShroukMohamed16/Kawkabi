package com.example.kawkabi.design_system.components.text_field

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.text.Text
import com.example.kawkabi.design_system.theme.KawkabiTheme

@Composable
fun AppTextField(
    value: String,
    hint: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    trailingIcon: Painter? = null,
    title: String? = null,
    singleLine: Boolean = true,
    minLines: Int = 1,
    maxLines: Int = Int.MAX_VALUE,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    errorMessage: String? = null,
    shape: Shape = RoundedCornerShape(8.dp),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    focusRequester: FocusRequester = FocusRequester(),
    onFocusChanged: (Boolean) -> Unit = {},
    onTrailingIconClick: (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    maxCharacters: Int = Int.MAX_VALUE,
) {
    Column(modifier) {
        title?.let {
            Text(
                text = title,
                style = Theme.textStyle.title.medium,
                modifier = Modifier.padding(bottom = 4.dp),
                color = Theme.color.primary500,
                fontSize = 18.sp,
                letterSpacing = 0.sp,
                lineHeight = 22.sp
            )
        }

        BasicTextField(
            value = value,
            onValueChange = {
                if (it.length <= maxCharacters)
                    onValueChanged(it)
            },
            enabled = enabled,
            readOnly = readOnly,
            minLines = minLines,
            maxLines = if (singleLine) 1 else maxLines,
            textStyle = Theme.textStyle.body.regular.copy(
                color = Color.Black
            ),
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,

            cursorBrush = SolidColor(Theme.color.primary500),
            decorationBox = { innerTextField ->
                TextFieldContent(
                    innerTextField = innerTextField,
                    text = value,
                    singleLine = singleLine,
                    hint = hint,
                    trailingIcon = trailingIcon,
                    onTrailingIconClick = onTrailingIconClick,
                )
            },
            visualTransformation = visualTransformation,
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape)
                .background(color = Color.White)
                .border(color = Theme.color.primary500, shape = shape, width = 1.dp)
                .focusRequester(focusRequester)
                .onFocusChanged {
                    onFocusChanged(it.isFocused)
                }
        )

        errorMessage?.let {
            Text(
                text = errorMessage,
                style = Theme.textStyle.subtitle.regular,
                modifier = Modifier.padding(
                    start = 12.dp,
                    top = 2.dp
                ),
                color = Theme.color.danger600
            )
        }
    }
}

@Composable
private fun TextFieldContent(
    innerTextField: @Composable () -> Unit,
    text: String,
    hint: String,
    trailingIcon: Painter?,
    singleLine: Boolean,
    onTrailingIconClick: (() -> Unit)? = null,
) {

    Row(
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        InnerTextFieldWithHint(
            innerTextField = innerTextField,
            text = text,
            hint = hint,
            singleLine = singleLine,
            modifier = Modifier.weight(1f)
        )

        trailingIcon?.let {
            Image(
                painter = trailingIcon,
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .clickable(
                        enabled = onTrailingIconClick != null,
                        indication = null,
                        interactionSource = remember {
                            MutableInteractionSource()
                        }
                    ) {
                        onTrailingIconClick?.invoke()
                    }
            )
        }
    }

}

@Composable
private fun InnerTextFieldWithHint(
    innerTextField: @Composable (() -> Unit),
    text: String,
    hint: String,
    singleLine: Boolean,
    modifier: Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = if (singleLine) Alignment.CenterStart else Alignment.TopStart
    ) {
        innerTextField()
        if (text.isEmpty()) {
            Text(
                text = hint,
                style = Theme.textStyle.subtitle.regular,
                color = Theme.color.hintColor
            )
        }
    }
}


@Preview
@Composable
private fun PreviewTextField() {
    KawkabiTheme {
        val (value, onValueChanged) = remember {
            mutableStateOf("")
        }
       AppTextField(
            value = value,
            hint = "hint",
            onValueChanged = onValueChanged,
            modifier = Modifier.fillMaxWidth().height(50.dp),
            onTrailingIconClick = {},
        )
    }
}