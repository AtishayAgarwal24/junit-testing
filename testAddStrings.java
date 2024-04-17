package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddStringsTest {

    @Test
    void test() {
        jUnitFunctions obj = new jUnitFunctions();
        String result = obj.addStrings("Hello", "World");
        assertEquals("HelloWorld", result);
    }
}
