package com.ryanbraz.calculator.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ryanbraz.calculator.ui.theme.Orange500

@Composable
fun CalculateButton(onCalculate: () -> Unit) {
    Button(
        onClick = { onCalculate() },
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Orange500
        ),
        shape = RoundedCornerShape(5.dp)
    ) {
        Text(
            text = "Calcular",
            fontSize = 18.sp
        )
    }
}

@Preview
@Composable
fun CalculateButtonPreview() {
    Surface {
        CalculateButton(onCalculate = {})
    }
}
