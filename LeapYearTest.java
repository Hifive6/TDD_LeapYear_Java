import org.junit.Test;

import org.junit.Assert;

public class LeapYearTest {
    
    

    @Test
    public final void isYearDivisibleBy4(){
        LeapYear leap = new LeapYear();
        Assert.assertEquals(true, leap.isDivisibleBy4(1996));
    }

    @Test
    public final void isYearDivisibleBy100(){
        LeapYear leap = new LeapYear();
        Assert.assertEquals(true, leap.isDivisibleBy100(1700));
    }

    @Test
    public final void isYearDivisibleBy400(){
        LeapYear leap = new LeapYear();
        Assert.assertEquals(true, leap.isDivisibleBy400(2000));
    }

    @Test
    public final void isYearGivenALeapYear(){
        LeapYear leap = new LeapYear();
        Assert.assertEquals(true, leap.isYearALeapYear(1996));
        Assert.assertEquals(false, leap.isYearALeapYear(1900));
        Assert.assertEquals(true, leap.isYearALeapYear(2000));
    }
}