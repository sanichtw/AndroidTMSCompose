package com.example.androidtmscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}


@Preview
@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(all = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var email by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            text = "Authorization",
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            color = Color.Black
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            value = email,
            onValueChange = {
                email = it
            },
            label = { Text("E-mail") }
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            value = password,
            onValueChange = {
                password = it
            },
            label = { Text("Password") },

        )

        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .height(48.dp)
            ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "Login",
                textAlign = TextAlign.Center,
                color = Color.Black
            )
        }
    }
}