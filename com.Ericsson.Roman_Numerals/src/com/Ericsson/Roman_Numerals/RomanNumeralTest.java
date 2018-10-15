package com.Ericsson.Roman_Numerals;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralTest {
    @Test
    public void convertOneReturnsI() {
        final RomanNumerals objUnderTest = new RomanNumerals();
        assertEquals("I", objUnderTest.converter(1));
    }

    @Test
    public void convertZeroReturnsN() {
        final RomanNumerals objUnderTest = new RomanNumerals();
        assertEquals("N", objUnderTest.converter(0));
    }

    @Test
    public void convertAlphabetsThrowsException() {
        final RomanNumerals objUnderTest = new RomanNumerals();
        assertEquals("MDLXXXIV", objUnderTest.converter(1584));
    }

    @Test
    public void InvalidNumberScenario() {
        final RomanNumerals objUnderTest = new RomanNumerals();
        assertEquals("Invalid input", objUnderTest.converter(-2));
    }
}
