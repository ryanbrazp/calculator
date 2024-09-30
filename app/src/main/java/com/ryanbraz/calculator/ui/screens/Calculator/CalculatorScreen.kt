package com.ryanbraz.calculator.ui.screens.Calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ryanbraz.calculator.ui.components.CalculateButton
import com.ryanbraz.calculator.ui.components.ClearButton
import com.ryanbraz.calculator.ui.components.Display
import com.ryanbraz.calculator.ui.components.InputFields
import com.ryanbraz.calculator.ui.theme.Grey900
import com.ryanbraz.calculator.utils.calculate

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculatorScreen() {
    var result by remember { mutableStateOf("0") }
    var operation by remember { mutableStateOf("") }
    var firstValue by remember { mutableStateOf("") }
    var secondValue by remember { mutableStateOf("") }
    var operator by remember { mutableStateOf("+") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Grey900)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Display(operation, result)

        InputFields(
            firstValue = firstValue,
            secondValue = secondValue,
            operator = operator,
            onValuesChanged = { newFirstValue, newSecondValue, newOperator ->
                firstValue = newFirstValue
                secondValue = newSecondValue
                operator = newOperator
            }
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ClearButton {
                firstValue = ""
                secondValue = ""
                operator = "+"
                result = "0"
                operation = ""
            }

            CalculateButton {
                if (firstValue.isNotEmpty() && secondValue.isNotEmpty()) {
                    result = calculate(firstValue, secondValue, operator)
                    operation = "$firstValue $operator $secondValue"
                }
            }
        }
    }
}
