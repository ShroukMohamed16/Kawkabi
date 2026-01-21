package com.example.kawkabi.design_system.text_style

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val defaultTextStyle = KawkabiTextStyle(
    headerLarge = SizedTextStyle(
        large = TextStyle(
            fontSize = 30.sp,
            lineHeight = 38.sp,
            fontWeight = FontWeight.Bold
        ),
        medium =  TextStyle(
            fontSize = 30.sp,
            lineHeight = 38.sp,
            fontWeight = FontWeight.Medium
        ),
        small =  TextStyle(
            fontSize = 30.sp,
            lineHeight = 38.sp,
            fontWeight = FontWeight.Normal
        ),
    ),
    headerMedium = SizedTextStyle(
        large = TextStyle(
            fontSize = 30.sp,
            lineHeight = 38.sp,
            fontWeight = FontWeight.Bold
        ),
        medium =  TextStyle(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Medium

        ),
        small =  TextStyle(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Normal
        ),
    ),
    headerSmall = SizedTextStyle(
        large = TextStyle(
            fontSize = 20.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 20.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Medium

        ),
        small =  TextStyle(
            fontSize = 20.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Normal

        ),
    ),
    title = SizedTextStyle(
        large = TextStyle(
            fontSize = 18.sp,
            lineHeight = 26.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 18.sp,
            lineHeight = 26.sp,
            fontWeight = FontWeight.Medium

        ),
        small =  TextStyle(
            fontSize = 18.sp,
            lineHeight = 26.sp,
            fontWeight = FontWeight.Normal

        ),
    ),
    subtitle = SizedTextStyle(
        large = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Medium

        ),
        small =  TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal

        ),
    ),
    body = SizedTextStyle(
        large = TextStyle(
            fontSize = 14.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 14.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.Medium

        ),
        small =  TextStyle(
            fontSize = 14.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.Normal

        ),
    ),
    caption = SizedTextStyle(
        large = TextStyle(
            fontSize = 12.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.Bold

        ),
        medium =  TextStyle(
            fontSize = 12.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.Medium

        ),
        small =  TextStyle(
            fontSize = 12.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.Normal

        ),
    )
)

val localDefaultTextStyle = staticCompositionLocalOf { defaultTextStyle }