package com.example.myandroid.ui.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myandroid.ui.composables.components.Carousel_1_Uncontained

@Preview
@Composable
fun HomeScreen() {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    var myPermColor = Color(0xFF00FF00)
    Card(
        colors = CardDefaults.cardColors( // Set card color to blue
                containerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f),
//            containerColor = Color(0xFFDED7D7).copy(alpha = 0.1f),
        ),
//            border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.size(500.dp , 300.dp)
            .padding(16.dp) // Add padding for better spacing
    ) {
        Carousel_1_Uncontained()
    }
}