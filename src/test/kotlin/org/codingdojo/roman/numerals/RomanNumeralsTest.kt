package org.codingdojo.roman.numerals

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RomanNumeralsTest {

    @ParameterizedTest(name = "should convert {0} to {1}")
    @CsvSource(
        delimiter = '➔',
        value = [
            "1 ➔ I",
            "2 ➔ II",
            "3 ➔ III",
            "4 ➔ IV",
            "5 ➔ V",
            "9 ➔ IX",
            "10 ➔ X",
            "20 ➔ XX",
            "21 ➔ XXI",
            "30 ➔ XXX",
            "40 ➔ XL",
            "50 ➔ L",
            "90 ➔ XC",
            "100 ➔ C",
            "400 ➔ CD",
            "500 ➔ D",
            "900 ➔ CM",
            "1000 ➔ M"
        ]
    )
    fun should_convert(number: Int, romanNumber: String) {
        RomanNumerals().convert(number) `should be equal to` romanNumber;
    }

}

