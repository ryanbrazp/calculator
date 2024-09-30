package com.ryanbraz.calculator.utils

fun calculate(firstValue: String, secondValue: String, operator: String): String {
    val num1 = firstValue.toDoubleOrNull() ?: 0.0
    val num2 = secondValue.toDoubleOrNull() ?: 0.0

    return when (operator) {
        "+" -> (num1 + num2).toString()
        "-" -> (num1 - num2).toString()
        "*" -> (num1 * num2).toString()
        "/" -> if (num2 != 0.0) (num1 / num2).toString() else "Error"
        else -> "Error"
    }
}