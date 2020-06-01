import org.junit.Test;

import org.junit.Assert;

public class LeapYearTest {
    

    @Test
    public final void isYearDivisibleBy4(){
        LeapYear leap = new LeapYear();
        Assert.assertEquals(true, leap.isDivisibleBy4(1996));
    }
}