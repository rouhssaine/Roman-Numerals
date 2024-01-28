package org.codingdojo.roman.numerals

class RomanNumerals {
    fun convert(number: Int): String {
        if(number == 10) return "X"
        val result = StringBuilder()
        for (i in 1 .. number) {
            result.append("I")
        }
        return result.toString()
    }

}
