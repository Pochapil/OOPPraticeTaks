package ru.ssau.tk.mggrndn.ooppractice.string;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedList;

public class Strings {

    static public void main(String[] args) {
        int i = 0;
        System.out.println("Символ\t№" + ++i);
        System.out.println("Символ\b№" + ++i);
        System.out.println("Символ\n№" + ++i);
        System.out.println("Символ\r№" + ++i);
        System.out.println("Символ\'№" + ++i);
        System.out.println("Символ\"№" + ++i);
        System.out.println("Символ\\№" + ++i);
        System.out.println(java.nio.charset.Charset.defaultCharset());
    }

    static public void charsAtLine(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    static public void printBytes(String string) {
        var bytes = string.getBytes();
        for (byte byt : bytes) {
            System.out.println(byt);
        }
    }

    static public void compareStrings() {
        String string = "Hyper";
        String string1 = new String(string);
        System.out.println(string == string1);
        System.out.println(string.equals(string1));
    }

    static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean isEqualsCase(String first, String second) {
        return first != null && second != null && !(first.equals(second)) && first.equalsIgnoreCase(second);
    }

    static int firstContainIndex(String first, String second) {
        if (first.contains(second)) {
            return first.indexOf(second);
        } else if (second.contains(first)) {
            return second.indexOf(first);
        } else {
            return -1;
        }
    }

    static int firstContainIndexInSecondHalf(String first, String second) {
        if (first.contains(second)) {
            return first.indexOf(second, first.length() / 2);
        } else if (second.contains(first)) {
            return second.indexOf(first, second.length() / 2);
        } else {
            return -1;
        }
    }

    static int lastContainIndexInFirstHalf(String first, String second) {
        if (first.contains(second)) {
            return first.lastIndexOf(second, first.length() / 2);
        } else if (second.contains(first)) {
            return second.lastIndexOf(first, second.length() / 2);
        } else {
            return -1;
        }
    }

    static int stringsStartsEndsWith(String[] strings, String prefix, String suffix) {
        int k = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith(prefix) && strings[i].endsWith(suffix)) {
                k++;
            }
        }
        return k;
    }

    static int stringsStartsEndsWithIgnoreSpace(String[] strings, String prefix, String suffix) {
        int k = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].trim().startsWith(prefix) && strings[i].trim().endsWith(suffix)) {
                k++;
            }
        }
        return k;
    }

    static String replacedString(String source, String replaced, String replacement) {
        for (int i = 0; i < 100; i++)
            if (source.contains(replaced)) {
                source = source.replaceAll(replaced, replacement);
            } else {
                break;
            }
        return source;
    }

    static String getSubString(String source, int from, int to) {
        if (to <= from) {
            return "";
        } else if (from < 0) {
            from = 0;
        }
        if (to > source.length()) {
            to = source.length();
        }
        return source.substring(from, to);
    }

    static String[] getSingleWords(String source) {
        String[] words = source.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                if (Character.isLetter(words[i].charAt(0))) {
                    words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                }
            }
        }
        return words;
    }

    static String buildString(String[] subStrings) {
        return String.join(", ", subStrings);
    }

    static String buildStringEveryEvenCharToIndex(String source) {
        if (source == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder(source);
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 0) {
                builder.replace(i, i + 1, Integer.toString(i));
            }
        }
        return builder.toString();
    }

    static String buildSequenceInts(int to) {
        if (to <= 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(0);
        for (int i = 1; i < to; i++) {
            builder.append(" ").append(i);
        }
        return builder.toString();
    }

    static String buildStringWithNewCode(String source) {
        byte[] byteString = source.getBytes(Charset.defaultCharset());
        return new String(byteString, StandardCharsets.UTF_16);
    }

    static void describeObject(Object object) {
        System.out.println("Описание объекта: " + object);
    }

}
