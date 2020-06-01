import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;

public class LeapYearTest {
    

    @Test
    public final void isYearDivisibleBy4(){
        LeapYear leap = new LeapYear();
        assertEquals(499, leap.divisibleBy4(1996));
    }
}