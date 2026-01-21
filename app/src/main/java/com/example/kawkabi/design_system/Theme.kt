package com.example.kawkabi.design_system

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.example.kawkabi.design_system.color.KawkabiColors
import com.example.kawkabi.design_system.color.localKawkabiColors
import com.example.kawkabi.design_system.text_style.KawkabiTextStyle
import com.example.kawkabi.design_system.text_style.localDefaultTextStyle

object Theme {
    val color : KawkabiColors
        @Composable @ReadOnlyComposable get() = localKawkabiColors.current

    val textStyle: KawkabiTextStyle
        @Composable @ReadOnlyComposable get() = localDefaultTextStyle.current

}