package com.code.signal.shapeArea;

import org.junit.Assert;
import org.junit.Test;

public class AreaFinderTest {

    @Test
    public void shouldCalculateShapeArea() {
        //Given
        AreaFinder finder = new AreaFinder();
        int shapeArea1 = 1;
        int shapeArea2 = 2;
        int shapeArea4 = 4;
        int shapeArea6 = 6;
        int shapeArea7 = 7;
        //When
        int area1 = finder.shapeArea(shapeArea1);
        int area2 = finder.shapeArea(shapeArea2);
        int area4 = finder.shapeArea(shapeArea4);
        int area6 = finder.shapeArea(shapeArea6);
        int area7 = finder.shapeArea(shapeArea7);
        //Then
        Assert.assertEquals(1, area1);
        Assert.assertEquals(5, area2);
        Assert.assertEquals(25, area4);
        Assert.assertEquals(61, area6);
        Assert.assertEquals(85, area7);
    }

}