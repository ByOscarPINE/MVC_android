package com.example.myandroid

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.myandroid.theme.MyAndroidTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Card
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.outlined.Star
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myandroid.ui.composables.HomeScreen
import com.example.myandroid.ui.composables.NavigatorBarr
import com.example.myandroid.ui.composables.RegisterUser
import com.example.myandroid.ui.composables.SearchUser

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContent {
            MyAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface( // Add Surface with desired background color (e.g., white)
//        modifier = Modifier.fillMaxSize(),
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)

                ) {
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = {
                            NavigatorBarr(navController = navController)
                        }
                    ) {
                        NavHost(navController = navController, startDestination = "screen_0") {
                            composable("screen_0") {
                                // Content of Screen A (Greeting)
                                HomeScreen()
                            }
                            composable("screen_1") {
                                // Content of Screen B (RegisterUser)
                                RegisterUser()
                            }
                            composable("screen_2") {
                                // Content of Screen B (RegisterUser)
                                SearchUser()
                            }
                        }
                    }
                }

            }
        }
    }
}





@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAndroidTheme {
        val navController = rememberNavController()
        Surface( // Add Surface with desired background color (e.g., white)
//        modifier = Modifier.fillMaxSize(),
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)

        ) {
            val navController = rememberNavController()
            Scaffold(
                bottomBar = {
                    NavigatorBarr(navController = navController)
                }
            ) {
                NavHost(navController = navController, startDestination = "screen_0") {
                    composable("screen_0") {
                        // Content of Screen A (Greeting)
                        RegisterUser()
                    }
                    composable("screen_1") {
                        // Content of Screen B (RegisterUser)
                        SearchUser()
                    }
                }
            }
        }
    }
}