package com.example.kawkabi.design_system.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.kawkabi.design_system.color.lightThemeScheme
import com.example.kawkabi.design_system.color.localKawkabiColors
import com.example.kawkabi.design_system.text_style.defaultTextStyle
import com.example.kawkabi.design_system.text_style.localDefaultTextStyle

@Composable
fun KawkabiTheme(
    isDark:Boolean = false,
    content:@Composable () -> Unit
){
    val colorScheme = lightThemeScheme

    CompositionLocalProvider(
        localKawkabiColors provides colorScheme ,
        localDefaultTextStyle provides defaultTextStyle
    ) {
        content()
    }
}