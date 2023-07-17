package com.example.test

class Math {

    fun add(a: String, b: String): String {
        var result = ""
        try {
            result = (a.removeComma().toDouble() + b.removeComma().toDouble()).toInt().toString()
        } catch (ex: java.lang.NumberFormatException) {
            result = "Нужно только числа"
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = ""
        if (a.isInteger() && b.isInteger() && b != "0") {
            if (((a.toDouble() / b.toDouble()) % 1).toString() == "0.0" || ((a.toDouble() / b.toDouble()) % 1).toString() == "-0.0") {
                result = (a.toInt() / b.toInt()).toString()
            } else {
                result = (a.toDouble() / b.toDouble()).toString()
            }
        } else if (b == "0") {
            result = "на ноль делить нельзя"
        }
        return result
    }

    private fun String.removeComma(): String = this.replace(",", " ")
    fun String.isInteger() = this.toIntOrNull()?.let { true } ?: false
}