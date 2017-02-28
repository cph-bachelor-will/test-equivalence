package testing.boundaries.and.equivalence;

import java.time.YearMonth;
/**
 *
 * @author williambech
 */
public class dayCalc {
     public static int getNumDaysinMonth(int month, int year) {
        YearMonth ym = YearMonth.of(year, month);
        int daysInMonth = ym.lengthOfMonth();

        return daysInMonth;
    }
}
