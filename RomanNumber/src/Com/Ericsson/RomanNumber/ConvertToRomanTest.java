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

}
