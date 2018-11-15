package com.code.signal.almostIncreasingSequence;

import org.junit.Assert;
import org.junit.Test;

public class IncreasingSequenceCheckerTest {

    @Test
    public void shouldCheckIncreasingSequence() {
        //Given
        IncreasingSequenceChecker checker = new IncreasingSequenceChecker();
        int[] sequence1 = {1, 3, 2, 1};
        int[] sequence2 = {1, 3, 2};
        int[] sequence3 = {1, 2, 1, 2};
        int[] sequence4 = {1, 4, 10, 4, 2};
        int[] sequence5 = {10, 1, 2, 3, 4, 5};
        int[] sequence6 = {1, 1, 1, 2, 3};
        int[] sequence7 = {0, -2, 5, 6};
        //When
        boolean result1 = checker.almostIncreasingSequence(sequence1);
        boolean result2 = checker.almostIncreasingSequence(sequence2);
        boolean result3 = checker.almostIncreasingSequence(sequence3);
        boolean result4 = checker.almostIncreasingSequence(sequence4);
        boolean result5 = checker.almostIncreasingSequence(sequence5);
        boolean result6 = checker.almostIncreasingSequence(sequence6);
        boolean result7 = checker.almostIncreasingSequence(sequence7);
        //Then
        Assert.assertFalse(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
        Assert.assertFalse(result4);
        Assert.assertTrue(result5);
        Assert.assertFalse(result6);
        Assert.assertTrue(result7);
    }
}
