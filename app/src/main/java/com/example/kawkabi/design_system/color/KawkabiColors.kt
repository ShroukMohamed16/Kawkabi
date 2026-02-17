package com.example.kawkabi.design_system.color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class KawkabiColors(
     val natural700: Color,
     val natural50: Color,
     val primary500: Color,
     val primary600: Color,
     val primary200: Color,
     val danger600: Color,
     val success600: Color,
     val hintColor:Color,
)

val localKawkabiColors = staticCompositionLocalOf { lightThemeScheme }