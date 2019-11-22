package ru.ssau.tk.mggrndn.ooppractice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringsTest {
    String string="abcdefg";
    String string1="абвгдежз";
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
}