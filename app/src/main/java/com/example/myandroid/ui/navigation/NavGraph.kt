package com.example.myandroid.ui.navigation

import android.widget.Button
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myandroid.ui.composables.RegisterUser


@Composable
fun MyScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screen_a") {
        composable("screen_a") {
            // Contenido de la pantalla A
            Button(onClick = {
                navController.navigate("screen_b")
            }) {
                Text("Ir a la pantalla B")
            }
        }
        composable("screen_b") {
            // Contenido de la pantalla B
            Button(onClick = {
                navController.popBackStack()
            }) {
                RegisterUser()
                Text("Volver")
            }
        }
    }
}