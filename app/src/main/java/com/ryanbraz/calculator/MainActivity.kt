package com.ryanbraz.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ryanbraz.calculator.ui.screens.Calculator.CalculatorScreen
import com.ryanbraz.calculator.ui.theme.CalculatorTheme
import com.ryanbraz.calculator.ui.theme.Grey900

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorTheme {
                Scaffold(

                ) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        App()
                    }

                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Grey900)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        CalculatorScreen()
    }
}

@Preview
@Composable
fun PreviewCalculatorScreen() {
    App()
}