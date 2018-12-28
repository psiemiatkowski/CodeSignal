package com.code.signal.allLongestStrings;

import org.junit.Assert;
import org.junit.Test;

public class LongestStringsFinderTest {

    @Test
    public void shouldFindLongestStrings()  {
        //Given
        LongestStringsFinder finder = new LongestStringsFinder();
        String[] inputArray1 = {"aba", "aa", "ad", "vcd", "aba"};
        String[] inputArray2 = {"aa"};
        String[] inputArray3 = {"eeee", "abcd"};
        String[] inputArray4 = {"a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa"};
        //When
        String[] longestStrings1 = finder.allLongestStrings(inputArray1);
        String[] longestStrings2 = finder.allLongestStrings(inputArray2);
        String[] longestStrings3 = finder.allLongestStrings(inputArray3);
        String[] longestStrings4 = finder.allLongestStrings(inputArray4);
        //Then
        Assert.assertArrayEquals(new String[]{"aba", "vcd", "aba"}, longestStrings1);
        Assert.assertArrayEquals(new String[]{"aa"}, longestStrings2);
        Assert.assertArrayEquals(new String[]{"eeee", "abcd"}, longestStrings3);
        Assert.assertArrayEquals(new String[]{"zzzzzz", "abcdef", "aaaaaa"}, longestStrings4);


    }
}