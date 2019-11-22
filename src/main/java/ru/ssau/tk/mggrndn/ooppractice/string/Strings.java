package ru.ssau.tk.mggrndn.ooppractice.string;

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
            for (int i = 0; i < first.length(); i++) {
                for (int j = 0; j < second.length(); j++) {
                    if (first.charAt(i + j) != second.charAt(j)) {
                        break;
                    }
                    if (j == second.length() - 1) {
                        return i;
                    }
                }
            }
        } else if (second.contains(first)) {
            for (int i = 0; i < second.length(); i++) {
                for (int j = 0; j < first.length(); j++) {
                    if (second.charAt(i + j) != first.charAt(j)) {
                        break;
                    }
                    if (j == first.length() - 1) {
                        return i;
                    }
                }
            }
        } else {
            return -1;
        }
        return -1;
    }


}
