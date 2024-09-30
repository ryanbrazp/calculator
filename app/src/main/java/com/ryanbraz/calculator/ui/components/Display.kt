package com.ryanbraz.calculator.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ryanbraz.calculator.ui.theme.Grey700
import com.ryanbraz.calculator.ui.theme.Grey900
import com.ryanbraz.calculator.ui.theme.White

@Composable
fun Display(operation: String, result: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Grey900)
    ) {
        Text(
            text = operation,
            fontSize = 18.sp,
            textAlign = TextAlign.Right,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 8.dp),
            color = Grey700
        )
        Text(
            text = result,
            fontSize = 36.sp,
            textAlign = TextAlign.Right,
            fontWeight = FontWeight(600),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 16.dp),
            color = White
        )
    }
}

@Preview
@Composable
fun DisplayPreview() {
    Display("55+27", "82")
}