package com.example.kawkabi.design_system.text_style

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val defaultTextStyle = KawkabiTextStyle(
    headerLarge = SizedTextStyle(
        bold = TextStyle(
            fontSize = 30.sp,
            lineHeight = 38.sp,
            fontWeight = FontWeight.Bold
        ),
        medium =  TextStyle(
            fontSize = 30.sp,
            lineHeight = 38.sp,
            fontWeight = FontWeight.Medium
        ),
        regular =  TextStyle(
            fontSize = 30.sp,
            lineHeight = 38.sp,
            fontWeight = FontWeight.Normal
        ),
    ),
    headerMedium = SizedTextStyle(
        bold = TextStyle(
            fontSize = 30.sp,
            lineHeight = 38.sp,
            fontWeight = FontWeight.Bold
        ),
        medium =  TextStyle(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Medium

        ),
        regular =  TextStyle(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Normal
        ),
    ),
    headerSmall = SizedTextStyle(
        bold = TextStyle(
            fontSize = 20.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 20.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Medium

        ),
        regular =  TextStyle(
            fontSize = 20.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Normal

        ),
    ),
    title = SizedTextStyle(
        bold = TextStyle(
            fontSize = 18.sp,
            lineHeight = 26.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 18.sp,
            lineHeight = 26.sp,
            fontWeight = FontWeight.Medium

        ),
        regular =  TextStyle(
            fontSize = 18.sp,
            lineHeight = 26.sp,
            fontWeight = FontWeight.Normal

        ),
    ),
    subtitle = SizedTextStyle(
        bold = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Medium

        ),
        regular =  TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal

        ),
    ),
    body = SizedTextStyle(
        bold = TextStyle(
            fontSize = 14.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 14.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.Medium

        ),
        regular =  TextStyle(
            fontSize = 14.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.Normal

        ),
    ),
    caption = SizedTextStyle(
        bold = TextStyle(
            fontSize = 12.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 12.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.Medium

        ),
        regular =  TextStyle(
            fontSize = 12.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.Normal

        ),
    )
)

val localDefaultTextStyle = staticCompositionLocalOf { defaultTextStyle }