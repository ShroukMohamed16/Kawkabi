package com.example.kawkabi.ui.presentation.authentication.child_information.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.text.Text

@Composable
fun GenderType(
    avatar: Painter,
    genderType: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onClick:() -> Unit
) {
    val borderColor by animateColorAsState(if (isSelected) Theme.color.primary600 else Color.Transparent)
    Column(
        modifier
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Color.White)
            .border(width = 1.dp, color = borderColor)
            .clickable{ onClick() }
            .padding(vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = avatar,
            contentDescription = "Avatar",
            modifier = Modifier
                .width(92.dp)
                .aspectRatio(1f)
        )

        Text(
            text = genderType,
            style = Theme.textStyle.subtitle.medium,
            color = Theme.color.primary600
        )

    }

}