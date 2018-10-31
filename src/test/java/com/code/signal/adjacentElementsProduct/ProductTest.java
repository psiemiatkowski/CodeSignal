package com.code.signal.adjacentElementsProduct;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    @Test
    public void shouldReturnMaxValueAdjacentElements() {
        //Given
        Product product = new Product();
        int[] inputArray1 = {3, 6, -2, -5, 7, 3};
        int[] inputArray2 = {1, 0, 1, 0, 1000};
        int[] inputArray3 = {9, 5, 10, 2, 24, -1, -48};
        int[] inputArray4 = {4, 1, 2, 3, 1, 5};
        int[] inputArray5 = {-1, -2};
        //When
        int largestProduct1 = product.adjacentElementsProduct(inputArray1);
        int largestProduct2 = product.adjacentElementsProduct(inputArray2);
        int largestProduct3 = product.adjacentElementsProduct(inputArray3);
        int largestProduct4 = product.adjacentElementsProduct(inputArray4);
        int largestProduct5 = product.adjacentElementsProduct(inputArray5);
        //Then
        Assert.assertEquals(21, largestProduct1);
        Assert.assertEquals(0, largestProduct2);
        Assert.assertEquals(50, largestProduct3);
        Assert.assertEquals(6, largestProduct4);
        Assert.assertEquals(2, largestProduct5);
    }
}