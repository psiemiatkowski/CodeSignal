package com.code.signal.adjacentElementsProduct;

import java.util.stream.IntStream;

public class Product {

    public int adjacentElementsProduct(int[] inputArray) {
        return IntStream.range(1, inputArray.length).map(i -> inputArray[i - 1] * inputArray[i]).max().getAsInt();
    }
}
