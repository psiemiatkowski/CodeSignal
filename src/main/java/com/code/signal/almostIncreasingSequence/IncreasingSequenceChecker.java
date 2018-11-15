package com.code.signal.almostIncreasingSequence;

import java.util.stream.IntStream;

public class IncreasingSequenceChecker {

    boolean almostIncreasingSequence(int[] sequence) {
        long counter = IntStream.range(0, sequence.length - 1).filter(i -> sequence[i] >= sequence[i + 1]).count() +
                IntStream.range(0, sequence.length - 2).filter(i -> sequence[i] >= sequence[i + 2]).count();
        return counter < 3;
    }
}
