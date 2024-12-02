package com.example.myandroid.ui.composables

import android.annotation.SuppressLint
import android.widget.Space
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
import androidx.navigation.compose.rememberNavController
import com.example.myandroid.theme.MyAndroidTheme

@Composable
fun SearchUser() {
    var name by remember { mutableStateOf("") }
    var profesion by remember { mutableStateOf("") }
    var codigo by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }

    var myPermColor = Color(0xFF00FF00)
    Card(
        colors = CardDefaults.cardColors( // Set card color to blue
                containerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f),
//            containerColor = Color(0xFF38761D).copy(alpha = 0.1f),
//            containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
        ),
//            border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.size(500.dp , 600.dp)
            .padding(16.dp) // Add padding for better spacing
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxHeight()
                .width(300.dp)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Administar personas")
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                OutlinedTextField(
                    modifier = Modifier
                        .width(150.dp),
                    value = codigo,
                    onValueChange = { codigo = it },
                    label = { Text("Codigo")
                    }
                )
                    ExtendedFloatingActionButton(
                        modifier = Modifier,
                        containerColor = MaterialTheme.colorScheme.tertiary,
                    onClick = {
                        // Aquí puedes hacer algo con los datos, por ejemplo, mostrar un mensaje
                        println("Nombre: $name, Correo: $codigo")
                    }) {
                    Text("OK")
                }
            }
            OutlinedTextField(

                value = name,
                onValueChange = { name = it },
                label = { Text("Nombre")
                }
            )
            OutlinedTextField(
                value = profesion,
                onValueChange = { profesion = it },
                label = { Text("Profesion") },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
            OutlinedTextField(

                value = edad,
                onValueChange = { edad = it },
                label = { Text("Edad")
                }
            )
            OutlinedTextField(

                value = telefono,
                onValueChange = { telefono = it },
                label = { Text("Telefono")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Spacer(modifier = Modifier.height(16.dp))
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .size(300.dp, 200.dp),
//            ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    FilledTonalButton(
//                    modifier = Modifier
//                        .align(Alignment.CenterHorizontally),
                        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary),
                        onClick = {
                            // Aquí puedes hacer algo con los datos, por ejemplo, mostrar un mensaje
                            println("Nombre: $name, Correo: $codigo")
                        }) {
                        Text("Guardar")
                    }

                    FilledTonalButton(
//                    modifier = Modifier
//                        .align(Alignment.CenterHorizontally),
                        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary),
                        onClick = {
                            // Aquí puedes hacer algo con los datos, por ejemplo, mostrar un mensaje
                            println("Nombre: $name, Correo: $codigo")
                        }) {
                        Text("Modificar")
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    FilledTonalButton(
                        modifier = Modifier,
                        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary),
                        onClick = {
                            // Aquí puedes hacer algo con los datos, por ejemplo, mostrar un mensaje
                            println("Nombre: $name, Correo: $codigo")
                        }) {
                        Text("Eliminar")
                    }
                }
//            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAndroidTheme {
        SearchUser()
    }
}