/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.boundaries.and.equivalence;

import java.time.DateTimeException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author williambech
 */
public class dayCalcTest {

    @Test
    public void monthEquivalenceTests() {
        assertEquals("leap year", 29, dayCalc.getNumDaysinMonth(2, 2000));
        assertEquals("31 days in a month", 31, dayCalc.getNumDaysinMonth(1, 2017));
        assertEquals("30 days in a month", 30, dayCalc.getNumDaysinMonth(4, 2017));
        assertEquals("Non leap year", 28, dayCalc.getNumDaysinMonth(2, 1999));
    }
   
    @Test(expected = DateTimeException.class)
    public void monthInequivalenceTests() {
        dayCalc.getNumDaysinMonth(0, 1999);
        dayCalc.getNumDaysinMonth(-1, -1);
        dayCalc.getNumDaysinMonth(13, 2000);
    }
    
}
