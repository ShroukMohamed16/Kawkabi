package com.example.kawkabi.ui.presentation.authentication.select_child

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kawkabi.R
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.button.PrimaryButton
import com.example.kawkabi.design_system.components.text.Text

@Composable
fun SelectChildScreen() {
    SelectChildContent()
}

@Composable
fun SelectChildContent() {
    Background {
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .align(Alignment.Center)
                .padding(horizontal = 24.dp, vertical = 64.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.you_want_to_start_with),
                color = Theme.color.primary600,
                style = Theme.textStyle.headerMedium.bold,
                modifier = Modifier.padding(bottom = 32.dp)
            )

            ChildrenList()

            Spacer(Modifier.weight(1f))

            PrimaryButton(
                text = stringResource(R.string.confirm),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                onClick = {}
            )
        }
    }

}

@Composable
private fun ChildrenList(
    modifier: Modifier = Modifier,

    ) {
    Column(
        modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Child(
            Gender.Boy,
            "Adam",
            modifier = Modifier.padding(bottom = 12.dp)
        ) {}
        Child(
            Gender.Girl,
            "Lora",
            modifier = Modifier.padding(bottom = 12.dp)
        ) {}
    }
}

@Composable
private fun Background(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.star),
            modifier = Modifier.align(Alignment.TopStart),
            contentDescription = null
        )
        Image(
            painter = painterResource(R.drawable.ic_planet),
            modifier = Modifier.align(Alignment.TopEnd),
            contentDescription = null
        )
        Image(
            painter = painterResource(R.drawable.star),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(bottom = 50.dp),
            contentDescription = null
        )
        Image(
            painter = painterResource(R.drawable.ic_planet),
            modifier = Modifier.align(Alignment.BottomStart),
            contentDescription = null
        )
        content()
    }
}

@Composable
private fun Child(
    gender: Gender,
    name: String,
    modifier: Modifier = Modifier,
    onClickChild: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = Theme.color.primary200.copy(0.32f),
                shape = RoundedCornerShape(16.dp)
            )
            .clickable {
                onClickChild()
            }
            .padding(vertical = 16.dp, horizontal = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Image(
            painter = painterResource(gender.avatar),
            contentDescription = "Avatar",
            modifier = Modifier
                .width(110.dp)
                .aspectRatio(1f)
        )

        Text(
            text = name,
            color = Theme.color.primary600,
            style = Theme.textStyle.headerLarge.medium
        )
    }
}

enum class Gender(
    @DrawableRes val avatar: Int
) {
    Girl(R.drawable.img_girl),
    Boy(R.drawable.img_boy)
}

@Preview(showBackground = true)
@Composable
fun SelectChildPreview() {
    SelectChildScreen()
}