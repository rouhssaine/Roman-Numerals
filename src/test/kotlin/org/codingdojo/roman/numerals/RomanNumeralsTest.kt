package org.codingdojo.roman.numerals

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RomanNumeralsTest {

    @ParameterizedTest(name = "should convert {0} to {1}")
    @CsvSource(
        value = [
            "1 ➔ I",
            "2 ➔ II"
        ], delimiter = '➔'
    )
    fun should_convert(number: Int, romanNumber: String) {
        RomanNumerals().convert(number) `should be equal to` romanNumber;
    }

}

