import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Find_which_year_is_a_leap_year_by_boolean {

    @ParameterizedTest
    @ValueSource(ints={2000,2024})
    public void Test_leapyears_if_years_is_dividable_with_4_but_not_100_and_dividable_with_400(int years){
        LeapYear Test = new LeapYear();
        boolean checkLeapYear = Test.isLeapYear(years);
        assertTrue(checkLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints={1700,1800,1900,2100})
    public void Test_not_leapyears_if_years_is_not_dividable_with_4_but_dividable_with_100_and_not_400(int years){
        LeapYear Test = new LeapYear();
        boolean checkNotLeapYear = Test.isLeapYear(years);
        assertFalse(checkNotLeapYear);
    }

}
