package com.code.signal.allLongestStrings;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LongestStringsFinder {

    String[] allLongestStrings(String[] inputArray) {
        String[] outputArray = Arrays.stream(inputArray).filter(i -> i.length() == IntStream.range(0, inputArray.length)
                .map(j -> inputArray[j].length())
                .max()
                .getAsInt())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(outputArray));
        return outputArray;
    }
}
