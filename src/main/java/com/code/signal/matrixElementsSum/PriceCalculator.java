package com.code.signal.matrixElementsSum;

import java.util.stream.IntStream;

public class PriceCalculator {

    int matrixElementsSum(int[][] matrix) {
        int result = IntStream.range(0, matrix.length)
                .map(i -> IntStream.range(0, matrix[i].length).map(j -> IntStream.range(0, i)
                        .allMatch(k -> matrix[k][j] > 0) ? matrix[i][j] : 0).sum()).sum();
        return result;
    }
}
