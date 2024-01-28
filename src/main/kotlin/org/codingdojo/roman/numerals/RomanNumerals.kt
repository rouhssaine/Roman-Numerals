package org.codingdojo.roman.numerals

class RomanNumerals {
    fun convert(number: Int): String {
        val result = StringBuilder()
        var remains = number
        while (remains >= 10) {
            result.append("X")
            remains -= 10
        }
        while (remains >= 5) {
            result.append("V")
            remains -= 5
        }
        while (remains >= 1) {
            result.append("I")
            remains -= 1
        }
        return result.toString()
    }

}
