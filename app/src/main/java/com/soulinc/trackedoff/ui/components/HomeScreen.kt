package com.soulinc.trackedoff.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.soulinc.trackedoff.R

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {

    }
}

@Composable
fun BottomNavigationBar(
    showHomeScreen: () -> Unit,
    createNewEvent: () -> Unit,
    showStatsScreen: () -> Unit
) {
    BottomNavigation() {
        BottomNavigationItem(selected = true,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = "home_icon"
                )
            },
            onClick = {
                showHomeScreen()
            })
        BottomNavigationItem(selected = false,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_new_event),
                    contentDescription = "create_event"
                )
            },
            onClick = {
                createNewEvent()
            })
        BottomNavigationItem(selected = false,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_stats),
                    contentDescription = "stats"
                )
            },
            onClick = {
                showStatsScreen
            })
    }
}