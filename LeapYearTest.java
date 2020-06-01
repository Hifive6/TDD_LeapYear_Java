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
        Assert.assertEquals(true, leap.isDivisibleBy100(2000));
    }
}