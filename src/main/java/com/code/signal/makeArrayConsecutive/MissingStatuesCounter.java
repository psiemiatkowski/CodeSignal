package com.code.signal.makeArrayConsecutive;

import java.util.Arrays;

public class MissingStatuesCounter {

    int makeArrayConsecutive(int[] statues) {
        int max = Arrays.stream(statues).max().getAsInt();
        int min = Arrays.stream(statues).min().getAsInt();
        return max - min - statues.length + 1;
    }
}
