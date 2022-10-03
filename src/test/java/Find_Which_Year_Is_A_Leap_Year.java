import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Find_Which_Year_Is_A_Leap_Year {

    @Test
    public void Year_2000_Is_A_Leap_Year(){
        LeapYear Test = new LeapYear();
        boolean checkLeapYear = Test.isLeapYear(2000);
        assertEquals(true, checkLeapYear);
    }

    @Test
    public void Year_2024_Is_A_Leap_Year(){
        LeapYear Test = new LeapYear();
        boolean checkLeapYear = Test.isLeapYear(2024);
        assertEquals(true, checkLeapYear);
    }

    @Test
    public void Year_1700_Is_Not_A_Leap_Year(){
        LeapYear Test = new LeapYear();
        boolean checkNotLeapYear = Test.isLeapYear(1700);
        assertEquals(false, checkNotLeapYear);
    }

    @Test
    public void Year_1800_Is_Not_A_Leap_Year(){
        LeapYear Test = new LeapYear();
        boolean checkNotLeapYear = Test.isLeapYear(1800);
        assertEquals(false, checkNotLeapYear);
    }

    @Test
    public void Year_1900_Is_Not_A_Leap_Year(){
        LeapYear Test = new LeapYear();
        boolean checkNotLeapYear = Test.isLeapYear(1900);
        assertEquals(false, checkNotLeapYear);
    }

    @Test
    public void Year_2100_Is_Not_A_Leap_Year(){
        LeapYear Test = new LeapYear();
        boolean checkNotLeapYear = Test.isLeapYear(2100);
        assertEquals(false, checkNotLeapYear);
    }

    @Test
    public void Year_2200_Is_Not_A_Leap_Year(){
        LeapYear Test = new LeapYear();
        boolean checkNotLeapYear = Test.isLeapYear(2200);
        assertEquals(false, checkNotLeapYear);
    }

}
