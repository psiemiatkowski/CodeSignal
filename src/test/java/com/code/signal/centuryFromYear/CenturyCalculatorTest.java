package com.code.signal.centuryFromYear;

import org.junit.Assert;
import org.junit.Test;

public class CenturyCalculatorTest {

    @Test
    public void shouldCalculateCenturyFromYear() {
        //Given
        CenturyCalculator calculator = new CenturyCalculator();
        int year1 = 1901;
        int year2 = 1700;
        int year3 = 1899;
        int year4 = 200;
        int year5 = 8;
        //When
        int century1 = calculator.centuryFromYear(year1);
        int century2 = calculator.centuryFromYear(year2);
        int century3 = calculator.centuryFromYear(year3);
        int century4 = calculator.centuryFromYear(year4);
        int century5 = calculator.centuryFromYear(year5);
        //Then
        Assert.assertEquals(20, century1);
        Assert.assertEquals(17, century2);
        Assert.assertEquals(19, century3);
        Assert.assertEquals(2, century4);
        Assert.assertEquals(1, century5);
    }
}