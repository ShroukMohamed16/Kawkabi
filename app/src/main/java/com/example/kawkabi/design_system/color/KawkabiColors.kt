package com.example.kawkabi.design_system.color

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class KawkabiColors(
    private val natural700: Color,
    private val natural50: Color,
    private val primary500: Color,
    private val primary600: Color,
    private val primary200: Color,
    private val danger600: Color,
    private val success600: Color
)

val localKawkabiColors = staticCompositionLocalOf { lightThemeScheme }