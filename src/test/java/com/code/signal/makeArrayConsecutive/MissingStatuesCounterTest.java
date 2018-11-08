package com.code.signal.makeArrayConsecutive;

import org.junit.Assert;
import org.junit.Test;

public class MissingStatuesCounterTest {

    @Test
    public void shouldFindMissingStatuesNumber() {
        //Given
        MissingStatuesCounter counter = new MissingStatuesCounter();
        int[] statuesCollection1 = {6, 2, 3, 8};
        int[] statuesCollection2 = {0, 3};
        int[] statuesCollection3 = {5, 4, 6};
        int[] statuesCollection4 = {6, 3};
        int[] statuesCollection5 = {1};
        //When
        int result1 = counter.makeArrayConsecutive(statuesCollection1);
        int result2 = counter.makeArrayConsecutive(statuesCollection2);
        int result3 = counter.makeArrayConsecutive(statuesCollection3);
        int result4 = counter.makeArrayConsecutive(statuesCollection4);
        int result5 = counter.makeArrayConsecutive(statuesCollection5);
        //Then
        Assert.assertEquals(3, result1);
        Assert.assertEquals(2, result2);
        Assert.assertEquals(0, result3);
        Assert.assertEquals(2, result4);
        Assert.assertEquals(0, result5);
    }

}