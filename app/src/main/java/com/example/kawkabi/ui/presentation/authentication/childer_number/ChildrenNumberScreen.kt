package com.example.kawkabi.ui.presentation.authentication.childer_number

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kawkabi.R
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.button.PrimaryButton
import com.example.kawkabi.design_system.components.button.RadioButton
import com.example.kawkabi.design_system.components.text.Text
import com.example.kawkabi.design_system.theme.KawkabiTheme
import com.example.kawkabi.ui.presentation.authentication.components.AuthBackground


@Composable
fun ChildrenNumberScreen() {
    ChildrenNumberContent()
}

@Composable
fun ChildrenNumberContent() {
    AuthBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 32.dp, horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.how_many_children_will_use_kawkabi),
                style = Theme.textStyle.headerMedium.medium,
                color = Theme.color.natural700,
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.you_can_always_add_or_switch_children_later_from_your_parent_profile),
                style = Theme.textStyle.title.regular,
                color = Theme.color.natural700.copy(alpha = 0.5f),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp, bottom = 24.dp)
            )
            Numbers(
                modifier = Modifier.weight(1f),
                selectedNumber = 2,
                onClickNumber = {}
            )
            PrimaryButton(
                text = stringResource(R.string.next),
                onClick = {},
                modifier = Modifier.fillMaxWidth(.8f)
            )

        }
    }

}

private const val MAX_CHILDREN = 4

@Composable
fun Numbers(
    selectedNumber: Int,
    modifier: Modifier = Modifier,
    onClickNumber: (Int) -> Unit
) {
    val numbers = remember { (1..MAX_CHILDREN).toList() }

    LazyColumn(modifier) {
        items(numbers) { number ->
            ChildrenNumberItem(
                isSelected = selectedNumber == (number),
                number = number,
            ) { number ->
                onClickNumber(number)
            }

        }
    }
}

@Composable
fun ChildrenNumberItem(
    isSelected: Boolean,
    number: Int,
    onClickNumber: (Int) -> Unit
) {
    val shape = remember { RoundedCornerShape(16.dp) }

    val borderColor by animateColorAsState(
        targetValue = if (isSelected)
            Theme.color.primary600
        else Theme.color.primary200.copy(alpha = 0.32f)
    )

    Box(
        modifier = Modifier
            .semantics {
                contentDescription = "$number children"
                stateDescription = if (isSelected) "Selected" else "Not selected"
            }
            .fillMaxWidth()
            .padding(8.dp)
            .background(Theme.color.primary200.copy(alpha = 0.32f), shape)
            .border(1.dp, borderColor, shape)
            .padding(16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        RadioButton(
            isSelected = isSelected,
            label = " $number",
            onClick = {
                onClickNumber(number)
            }
        )
    }
}

@Preview
@Composable
fun ChildrenNumberScreenPreview() {
    KawkabiTheme {
        ChildrenNumberScreen()
    }
}