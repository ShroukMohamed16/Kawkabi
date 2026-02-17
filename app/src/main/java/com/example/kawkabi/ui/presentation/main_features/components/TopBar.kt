package com.example.kawkabi.ui.presentation.main_features.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.kawkabi.R
import com.example.kawkabi.design_system.Theme

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    onClickNotification: () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton({
            onClickNotification()
        }) {
            Icon(
                painter = painterResource(R.drawable.ic_notification),
                contentDescription = "Notification Icon",
                tint = Color.Unspecified
            )
        }
        Text(
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
            text = stringResource(R.string.app_name),
            style = Theme.textStyle.headerLarge.bold,
            color = Theme.color.primary600
        )
        IconButton({

        }) {
            Icon(
                painter = painterResource(R.drawable.boy_avatar),
                contentDescription = "account avatar",
                tint = Color.Unspecified
            )
        }
    }
}