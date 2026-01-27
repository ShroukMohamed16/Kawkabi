package com.example.kawkabi.ui.presentation.authentication.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kawkabi.R
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.theme.KawkabiTheme

@Composable
fun AuthBackground(
    content:@Composable BoxScope.()->Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier
        .fillMaxSize()
        .background(color = Theme.color.natural50)) {
        Star(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 20.dp, start = 24.dp)
        )
        Star(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 60.dp, end = 28.dp)
        )
        Star(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(bottom = 140.dp, end = 28.dp)
        )

        Star(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(bottom = 60.dp, start = 28.dp)
        )

        content()

    }
}

@Composable
private fun Star(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.ic_star),
        contentDescription = null,
        modifier = modifier
    )
}

@Preview
@Composable
fun AuthBackgroundPreview() {
    KawkabiTheme {
        AuthBackground({})
    }
}