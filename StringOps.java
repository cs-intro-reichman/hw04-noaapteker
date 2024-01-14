import java.lang.reflect.Array;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' ) {
                int asciiuppercase = (int) string.charAt(i);
                asciiuppercase = (int) string.charAt(i) - 32;
                char uppercase = (char) asciiuppercase;
                newString = newString + uppercase;
            } else if ((int)string.charAt(i) == 'A' || (int)string.charAt(i) == 'E' || (int)string.charAt(i) == 'I' || (int)string.charAt(i) == 'O' || (int)string.charAt(i) == 'U') {
                newString = newString + string.charAt(i);
            } else if ((int)string.charAt(i) >= 65 && (int)string.charAt(i) <= 90 ) {
                int asciilowercase = (int)string.charAt(i);
                asciilowercase = (int)string.charAt(i) + 32;
                char lowercase = (char) asciilowercase;
                newString = newString + lowercase;
            } else {
                newString = newString + string.charAt(i);
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        String newString = "";
        int firstWord = 0;
        while (string.charAt(firstWord) == ' ') {
            firstWord++;
        }
        while (firstWord < string.length() && (int) string.charAt(firstWord) != 32) {
            if ((int) string.charAt(firstWord) >= 65 && (int) string.charAt(firstWord) <= 90) {
                int asciilowerCaseFirsrWord = (int) string.charAt(firstWord) + 32;
                char lowerCaseFirsrWorld = (char) asciilowerCaseFirsrWord;
                newString = newString + lowerCaseFirsrWorld;
            } else {
                newString = newString + string.charAt(firstWord);
            }
            firstWord++;
        }
        boolean newWord = false;
        for (int i = firstWord; i < string.length(); i++) {
            if ((int) string.charAt(i) == 32) {
                newWord = true;
            } else {
                if (newWord) {
                    if ((int) string.charAt(i) >= 97 && (int) string.charAt(i) <= 122) {
                        int asciiuppercaseFirstLetter = (int) string.charAt(i) - 32;
                        char uppercaseFirstLetter = (char) asciiuppercaseFirstLetter;
                        newString = newString + uppercaseFirstLetter;
                    } else {
                        newString = newString + string.charAt(i);
                    }
                    newWord = false;
                } else {
                    if ((int) string.charAt(i) >= 65 && (int)string.charAt(i) <= 90) {
                        int asciilowerCaseOtherLetters = (int) string.charAt(i) + 32;
                        char lowerCaseOtherLetters = (char) asciilowerCaseOtherLetters;
                        newString = newString + lowerCaseOtherLetters;
                    } else {
                        newString = newString + string.charAt(i);
                    }
                }
            }
        }
        return newString;
    }
    public static int[] allIndexOf (String string, char chr) {
        int len = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                len = len + 1;
            }
        }
        int [] arr = new int [len];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr [j] = i;
                j++;
            }
        }
        return arr;
    }
}
