package com.code.signal.checkPalindrome;

public class PalindromeChecker {

    boolean checkPalindrome(String inputString) {
        String reverse = new StringBuilder(inputString).reverse().toString();
        return reverse.equals(inputString);
    }
}
