package com.example.myandroid.ui.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigatorBarr(navController: NavController) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Home","Registrar", "Buscar")
    val selectedIcons = listOf(Icons.Filled.Home, Icons.Filled.Home, Icons.Filled.Favorite)
    val unselectedIcons =
        listOf(Icons.Outlined.Home, Icons.Outlined.Home, Icons.Outlined.FavoriteBorder)
    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        if (selectedItem == index) selectedIcons[index] else unselectedIcons[index],
                        contentDescription = item
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index; navController.navigate("screen_$index") }
            )
        }
    }
}
