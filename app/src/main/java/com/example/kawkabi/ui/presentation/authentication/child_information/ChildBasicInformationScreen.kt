package com.example.kawkabi.ui.presentation.authentication.child_information

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import com.example.kawkabi.design_system.components.text_field.AppTextField
import com.example.kawkabi.ui.presentation.authentication.child_information.components.GenderType

@Composable
fun ChildBasicInformationScreen() {
    ChildBasicInformationContent()
}

@Composable
fun ChildBasicInformationContent() {
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            AppTextField(
                value = "",
                hint = stringResource(R.string.enter_your_first_name),
                title = stringResource(R.string.first_name),
                onValueChanged = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)

            )
        }

        item {
            AppTextField(
                value = "",
                hint = stringResource(R.string.enter_your_last_name),
                title = stringResource(R.string.last_name),
                onValueChanged = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, bottom = 16.dp)
            )
        }

        item {
            GenderSection()
        }
        item {
            PrimaryButton(
                text = stringResource(R.string.continue_),
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp, horizontal = 16.dp)
            )

        }

    }
}

@Composable
private fun GenderSection() {
    Text(
        text = stringResource(R.string.gender),
        style = Theme.textStyle.title.medium,
        color = Theme.color.primary600,
        modifier = Modifier.padding(bottom = 4.dp)
    )
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        GenderType(
            avatar = painterResource(R.drawable.boy_avatar),
            genderType = stringResource(R.string.boy),
            isSelected = true,
            modifier = Modifier.weight(1f),
            onClick = {}
        )

        GenderType(
            avatar = painterResource(R.drawable.girl_avatar),
            genderType = stringResource(R.string.girl),
            isSelected = false,
            modifier = Modifier.weight(1f),
            onClick = {}
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewChildBasicInformationScreen() {
    ChildBasicInformationScreen()
}