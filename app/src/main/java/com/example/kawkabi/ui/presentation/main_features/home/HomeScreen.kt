package com.example.kawkabi.ui.presentation.main_features.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
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
import com.example.kawkabi.ui.presentation.main_features.components.TopBar

@Preview
@Composable
fun HomeScreen() {
    HomeContent()
}

enum class Planet(
    val titleRes: Int,
    val imageRes: Int
) {
    FOCUS(
        titleRes = R.string.focus_planet,
        imageRes = R.drawable.focus_planet
    ),
    MOVEMENT(
        titleRes = R.string.movement_planet,
        imageRes = R.drawable.movement_planet
    ),
    PLANNING(
        titleRes = R.string.planning_planet,
        imageRes = R.drawable.planning_planet
    )
}

@Composable
fun HomeContent() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Theme.color.natural50)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            TopBar(modifier = Modifier.padding(bottom = 24.dp))
            { }
        }

        items(Planet.entries.toTypedArray()) { planet ->
            PlanetItem(planet) {
            }
        }
    }


}

@Composable
fun PlanetItem(
    planet: Planet,
    onClickPlanet: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Theme.color.primary200.copy(.32f),
                RoundedCornerShape(24.dp)
            )
            .clickable {
                onClickPlanet()
            }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Image(
            painter = painterResource(planet.imageRes),
            contentDescription = "planet image",
            modifier = Modifier
                .width(150.dp)
                .aspectRatio(1f)
        )
        Text(
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
            text = stringResource(planet.titleRes),
            style = Theme.textStyle.headerMedium.bold,
            color = Theme.color.primary600
        )
    }
}