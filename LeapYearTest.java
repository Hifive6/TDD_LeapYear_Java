import org.junit.Test;

import org.junit.Assert;

public class LeapYearTest {

    @Test
    public final void isYearDivisibleBy4(){
        Assert.assertEquals(true, LeapYear.isDivisibleBy4(1996));
    }

    @Test
    public final void isYearDivisibleBy100(){
        Assert.assertEquals(true, LeapYear.isDivisibleBy100(1700));
    }

    @Test
    public final void isYearDivisibleBy400(){
        Assert.assertEquals(true, LeapYear.isDivisibleBy400(2000));
    }

    @Test
    public final void isYearGivenALeapYear(){
        Assert.assertEquals(true, LeapYear.isYearALeapYear(2012));
        Assert.assertEquals(false, LeapYear.isYearALeapYear(1300));
        Assert.assertEquals(true, LeapYear.isYearALeapYear(2000));
    }
}