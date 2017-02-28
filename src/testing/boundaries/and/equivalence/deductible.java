/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.boundaries.and.equivalence;

/**
 *
 * @author williambech
 */
public class deductible {
    public static int calculateReimbursementPercentage(boolean deductible, String typeOfVisit) {
        int reimburse = 0;
        if (deductible) {
            switch (typeOfVisit.toLowerCase()) {
                case "d":
                    reimburse = 50;
                    break;
                case "h":
                    reimburse = 80;
                    break;
                default:
                    // type unknown
                    break;
            }
        }
        return reimburse;
    }
}
