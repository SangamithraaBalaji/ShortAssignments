package Com.Ericsson.RomanNumber;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class ConvertToRomanTest {

    @Test
    void convertOneReturnsI() {
        final ConvertToRoman objUnderTest = new ConvertToRoman();
        assertEquals("I", objUnderTest.converter(1));
    }

}
