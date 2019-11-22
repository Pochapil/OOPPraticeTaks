package ru.ssau.tk.mggrndn.ooppractice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringsTest {
    String string = "abcdefg";
    String string1 = "абвгдежз";

    @Test
    public void testCharsAtLine() {
        Strings.charsAtLine(string);
    }

    @Test
    public void testPrintBytes() {
        Strings.printBytes(string);
        System.out.println();
        Strings.printBytes(string1);
    }

    @Test
    public void testCompareStrings() {
        Strings.compareStrings();
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(Strings.isPalindrome("aba"));
        assertTrue(Strings.isPalindrome("abba"));
        assertFalse(Strings.isPalindrome("abca"));
    }

    @Test
    public void testIsEqualsCase() {
        assertTrue(Strings.isEqualsCase("abc", "ABC"));
        assertFalse(Strings.isEqualsCase(null, "ABC"));
        assertFalse(Strings.isEqualsCase("abc", "abc"));
    }

    @Test
    public void testFirstContainIndex() {
        assertEquals(Strings.firstContainIndex("abcdeabcde", "de"), 3, 0.0001);
        assertEquals(Strings.firstContainIndex("abc", "bc"), 1, 0.0001);
        assertEquals(Strings.firstContainIndex("abc", "de"), -1, 0.0001);
        assertEquals(Strings.firstContainIndex("abcdeabcdEf", "abcdE"), 5, 0.0001);
    }

    @Test
    public void testFirstContainIndexInSecondHalf() {
        assertEquals(Strings.firstContainIndexInSecondHalf("abcdabc", "abc"), 4, 0.0001);
        assertEquals(Strings.firstContainIndexInSecondHalf("abcddabc", "abc"), 5, 0.0001);
        assertEquals(Strings.firstContainIndexInSecondHalf("abcdabcabc", "abc"), 7, 0.0001);
    }
}