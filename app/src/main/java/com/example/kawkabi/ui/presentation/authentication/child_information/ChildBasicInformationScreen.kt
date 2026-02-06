package com.example.kawkabi.ui.presentation.authentication.child_information

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kawkabi.R
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.text.Text
import com.example.kawkabi.design_system.components.text_field.AppTextField

@Composable
fun ChildBasicInformationScreen() {
    ChildBasicInformationContent()
}

@Composable
fun ChildBasicInformationContent() {
    LazyColumn(Modifier.fillMaxSize()){
        item {
            AppTextField(
                value = "",
                hint = stringResource(R.string.enter_your_first_name),
                title = stringResource(R.string.first_name),
                onValueChanged = {},
                modifier = Modifier.padding(top = 16.dp)

            )
        }

        item {
            AppTextField(
                value = "",
                hint = stringResource(R.string.enter_your_last_name),
                title = stringResource(R.string.last_name),
                onValueChanged = {},
                modifier = Modifier.padding(top = 12.dp, bottom = 16.dp)
            )
        }

        item {
            Text(
                text = stringResource(R.string.gender),
                style = Theme.textStyle.title.medium,
                color = Theme.color.primary600
            )
            Row(Modifier.fillMaxWidth()){
                GenderType(
                    avatar = painterResource(R.drawable)
                )
            }
        }

    }
}

@Composable
fun GenderType(
    avatar: Painter,
    genderType: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
){
    val borderColor by animateColorAsState(if (isSelected) Theme.color.primary600 else Color.Transparent)
    Column (modifier
        .background(Color.White, shape = RoundedCornerShape(16.dp))
        .border(1.dp, borderColor)
        .padding(vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
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

@Preview(showBackground = true)
@Composable
fun PreviewChildBasicInformationScreen() {
    ChildBasicInformationScreen()
}