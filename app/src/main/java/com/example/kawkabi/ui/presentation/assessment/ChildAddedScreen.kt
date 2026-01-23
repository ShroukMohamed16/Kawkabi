package com.example.kawkabi.ui.presentation.assessment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kawkabi.R
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.button.PrimaryButton
import com.example.kawkabi.design_system.components.text.Text
import com.example.kawkabi.design_system.theme.KawkabiTheme


@Composable
fun ChildAddedScreen() {
    ChildAddedContent(
        modifier = Modifier
            .background(color = Theme.color.natural50)
            .padding(vertical = 32.dp, horizontal = 16.dp)
    )
}

@Composable
fun ChildAddedContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.child_added_succesfuly),
            contentDescription = "Child Added Successfully",
            modifier = Modifier
                .fillMaxWidth(0.75f)
                .aspectRatio(1f)

        )

        Spacer(Modifier.height(32.dp))

        Image(
            painter = painterResource(R.drawable.ic_check),
            contentDescription = null,
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)

        )
        Spacer(Modifier.height(24.dp))

        Text(
            text = stringResource(R.string.your_account_has_been_created),
            style = Theme.textStyle.headerSmall.medium,
            color = Theme.color.primary500,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.you_will_be_directed_to_the_home_page),
            style = Theme.textStyle.subtitle.regular,
            textAlign = TextAlign.Center,
            color = Theme.color.hintColor
        )

        Spacer(Modifier.weight(1f))

        PrimaryButton(
            text = stringResource(R.string.let_s_start),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            onClick = {}
        )
    }
}

@Preview
@Composable
fun ChildAddedScreenPreview() {
    KawkabiTheme {
        ChildAddedScreen()
    }
}