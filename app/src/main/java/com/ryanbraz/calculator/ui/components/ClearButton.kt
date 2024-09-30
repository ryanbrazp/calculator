package com.ryanbraz.calculator.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ClearButton(onClear: () -> Unit) {
    Button(
        onClick = { onClear() },
        modifier = Modifier,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
        shape = RoundedCornerShape(5.dp)
    ) {
        Text(text = "C", color = Color.White)
    }
}
