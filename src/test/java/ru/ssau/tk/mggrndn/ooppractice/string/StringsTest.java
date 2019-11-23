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
        assertEquals(Strings.firstContainIndexInSecondHalf("abcdabcabc", "ab"), 7, 0.0001);
    }

    @Test
    public void testLastContainIndexInFirstHalf() {
        assertEquals(Strings.lastContainIndexInFirstHalf("abcdabc", "abc"), 0, 0.0001);
        assertEquals(Strings.lastContainIndexInFirstHalf("abcddabc", "abc"), 0, 0.0001);
        assertEquals(Strings.lastContainIndexInFirstHalf("abcabdbabcabc", "ab"), 3, 0.0001);
        assertEquals(Strings.lastContainIndexInFirstHalf("cabccabccccccc", "ab"), 5, 0.0001);
    }

    @Test
    public void testStringsStartsEndsWith() {
        assertEquals(Strings.stringsStartsEndsWith(new String[]{"abcde", "abbde", "abbde", "abfde"}, "ab", "de"), 4, 0.001);
        assertEquals(Strings.stringsStartsEndsWith(new String[]{"abcde", "abbde", "abbe", "abfe"}, "ab", "de"), 2, 0.001);
    }


    @Test
    public void testStringsStartsEndsWithIgnoreSpace() {
        assertEquals(Strings.stringsStartsEndsWithIgnoreSpace(new String[]{"  abcde  ", "  abbde", "  abbde", "  abfde  "}, "ab", "de"), 4, 0.001);
    }

    @Test
    public void testReplacedString() {
        assertEquals(Strings.replacedString("abcbc", "bc", "aa"), "aaaaa");
        assertEquals(Strings.replacedString("ороророро", "оро", "ро"), "роррро");
    }

    @Test
    public void testGetSubstring() {
        assertEquals(Strings.getSubString("abc", 0, 2), "ab");
        assertEquals(Strings.getSubString("abcde", 2, 4), "cd");
        assertEquals(Strings.getSubString("abc", -1, 100), "abc");
        assertEquals(Strings.getSubString("abc", 3, 2), "");
    }

    @Test
    public void testGetSingleWords() {
        assertEquals(Strings.getSingleWords("abc de fg h  i")[1], "De");
        assertEquals(Strings.getSingleWords("abc de fg h  i")[2], "Fg");
        assertEquals(Strings.getSingleWords("abc de fg h  i")[4], "");
        assertEquals(Strings.getSingleWords("abc de fg h 1 i")[4], "1");
    }
}