package ru.ssau.tk.mggrndn.ooppractice.string;

public class Strings {

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

}
