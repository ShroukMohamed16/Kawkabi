package com.example.kawkabi.design_system.text_style

import androidx.compose.ui.text.TextStyle

data class KawkabiTextStyle(
    val headerLarge: SizedTextStyle,
    val headerMedium: SizedTextStyle,
    val headerSmall: SizedTextStyle,
    val title: SizedTextStyle,
    val subtitle: SizedTextStyle,
    val body: SizedTextStyle,
    val caption: SizedTextStyle,
)

data class SizedTextStyle(
    val bold: TextStyle,
    val medium: TextStyle,
    val regular: TextStyle
)