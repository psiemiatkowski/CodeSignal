package com.code.signal.matrixElementsSum;

import org.junit.Assert;
import org.junit.Test;

public class PriceCalculatorTest {

    @Test
    public void shouldCalculatePrice() {
        //Given
        PriceCalculator calculator = new PriceCalculator();
        int[][] building1 = new int[][]{
                {0, 1, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}
        };
        int[][] building2 = new int[][]{
                {1, 1, 1, 0},
                {0, 5, 0, 1},
                {2, 1, 3, 10}
        };
        int[][] building3 = new int[][]{
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        int[][] building4 = new int[][]{
                {0}
        };
        //When
        int result1 = calculator.matrixElementsSum(building1);
        int result2 = calculator.matrixElementsSum(building2);
        int result3 = calculator.matrixElementsSum(building3);
        int result4 = calculator.matrixElementsSum(building4);
        //Then
        Assert.assertEquals(9, result1);
        Assert.assertEquals(9, result2);
        Assert.assertEquals(18, result3);
        Assert.assertEquals(0, result4);
    }
}