package com.ryanbraz.calculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ryanbraz.calculator.ui.theme.Orange500
import com.ryanbraz.calculator.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputFields(
    firstValue: String,
    secondValue: String,
    operator: String,
    onValuesChanged: (String, String, String) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Column(
            modifier = Modifier.weight(1.7f)
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(color = White, fontSize = 18.sp),
                value = firstValue,
                onValueChange = {
                    onValuesChanged(it, secondValue, operator)
                },
                placeholder = {
                    Text(text = "Primeiro valor")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            Spacer(modifier = Modifier.size(8.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(color = White, fontSize = 18.sp),
                value = secondValue,
                onValueChange = {
                    onValuesChanged(firstValue, it, operator)
                },
                placeholder = {
                    Text(text = "Segundo valor")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().height(56.dp)
            ) {
                Button(
                    onClick = {
                        onValuesChanged(firstValue, secondValue, "+")
                    },
                    modifier = Modifier.width(56.dp).height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Orange500),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(text = "+")
                }

                Spacer(modifier = Modifier.size(8.dp))

                Button(
                    onClick = {
                        onValuesChanged(firstValue, secondValue, "-")
                    },
                    modifier = Modifier.width(56.dp).height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Orange500),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(text = "-")
                }
            }

            Spacer(modifier = Modifier.size(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth().height(56.dp)
            ) {
                Button(
                    onClick = {
                        onValuesChanged(firstValue, secondValue, "*")
                    },
                    modifier = Modifier.width(56.dp).height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Orange500),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(text = "x")
                }

                Spacer(modifier = Modifier.size(8.dp))

                Button(
                    onClick = {
                        onValuesChanged(firstValue, secondValue, "/")
                    },
                    modifier = Modifier.width(56.dp).height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Orange500),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(text = "÷")
                }
            }
        }
    }
}
