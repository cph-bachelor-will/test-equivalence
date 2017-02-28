/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.boundaries.and.equivalence;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author williambech
 */
public class deductibleTest {

    @Test
    public void deductibleDoctorsOffice() {
        int result = deductible.calculateReimbursementPercentage(true , "d");
        int expected = 50;
        assertEquals(expected, result);
    }

    @Test
    public void deductibleHospital() {
        int result = deductible.calculateReimbursementPercentage(true, "h");
        int expected = 80;
        assertEquals(expected, result);
    }

    @Test
    public void notDeductibleDoctorsOffice() {
        int result = deductible.calculateReimbursementPercentage(false, "d");
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void notDeductibleHospital() {
        int result = deductible.calculateReimbursementPercentage(false, "h");
        int expected = 0;
        assertEquals(expected, result);
    }
}
