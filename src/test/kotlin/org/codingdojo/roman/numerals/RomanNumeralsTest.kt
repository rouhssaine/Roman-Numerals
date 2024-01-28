package org.codingdojo.roman.numerals

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class RomanNumeralsTest {

    @Test
    fun `should convert 1 to I`() {
        RomanNumerals().convert(1) `should be equal to` "I";
    }

}

