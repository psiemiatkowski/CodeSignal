package com.code.signal.checkPalindrome;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckerTest {

    @Test
    public void isPalindrome() {
        //Given
        PalindromeChecker checker = new PalindromeChecker();
        String inputString1 = "wannabe";
        String inputString2 = "abacaba";
        String inputString3 = "zzzazzazz";
        String inputString4 = "hlbeeykoqqqqokyeeblh";
        String inputString5 = "a";
        // When
        boolean check1 = checker.checkPalindrome(inputString1);
        boolean check2 = checker.checkPalindrome(inputString2);
        boolean check3 = checker.checkPalindrome(inputString3);
        boolean check4 = checker.checkPalindrome(inputString4);
        boolean check5 = checker.checkPalindrome(inputString5);
        //Then
        Assert.assertFalse(check1);
        Assert.assertTrue(check2);
        Assert.assertFalse(check3);
        Assert.assertTrue(check4);
        Assert.assertTrue(check5);
    }
}