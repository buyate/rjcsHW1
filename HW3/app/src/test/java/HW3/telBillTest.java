package HW3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class telBillTest {
    @ParameterizedTest
    @CsvSource({
            "0,1,30,2,31,输入时间错误",
            "0,1,30,1,40,0.5",
            "0,1,33,1,53,1.0",
            "1,1,30,3,31,输入时间错误",
            "1,1,50,3,11,1.1",
            "1,1,55,3,3,0.4",
            "2,2,50,2,31,输入时间错误",
            "2,2,15,2,40,1.5",
            "2,2,55,2,5,0.5",
    })
    void testWithCsvSource(int day, int hour1, int min1, int hour2, int min2,String expected) {
        telBill telBill = new telBill();
        assertEquals(expected, telBill.classify(day, hour1, min1, hour2, min2));
    }
}
