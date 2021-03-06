package Com.Ericsson.RomanNumber;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class ConvertToRomanTest {

    @Test
    void convertOneReturnsI() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("I", objUnderTest.converter(1));
    }

    @Test
    void convertFiveReturnsV() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("V", objUnderTest.converter(5));
    }

    @Test
    void convertTenReturnsX() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("X", objUnderTest.converter(10));
    }

    @Test
    void convertFiftyReturnsL() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("L", objUnderTest.converter(50));
    }

    @Test
    void convertHundredReturnsC() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("C", objUnderTest.converter(100));
    }

    @Test
    void convertFiveHundredReturnsD() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("D", objUnderTest.converter(500));
    }

    @Test
    void convertThousandReturnsM() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("M", objUnderTest.converter(1000));
    }

    @Test
    void convertZeroReturnsInvalidInput() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("Invalid Input. Enter number greater than 0", objUnderTest.converter(0));
    }

    @Test
    void convertTwoReturnsII() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("II", objUnderTest.converter(2));
    }

    @Test
    void convertNegativeReturnsInvalidInput() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("Invalid Input. Enter number greater than 0", objUnderTest.converter(-1));
    }

    @Test
    void convertFourReturnsIV() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("IV", objUnderTest.converter(4));
    }

    @Test
    void convertNinenteenReturnsXIX() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("XIX", objUnderTest.converter(19));
    }

}
