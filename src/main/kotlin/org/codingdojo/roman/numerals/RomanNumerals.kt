package org.codingdojo.roman.numerals

class RomanNumerals {

    fun convert(number: Int): String {
        val result = StringBuilder()
        var remains = number

        enumValues<RomanNumeral>()
            .sortedByDescending { it.number }
            .forEach {
                while (remains >= it.number) {
                    result.append(it.name)
                    remains -= it.number
                }
            }

        return result.toString()
    }

    enum class RomanNumeral(val number: Int) {
        I(1),
        IV(4),
        V(5),
        X(10)
    }

}
