import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateSimpleUtilTest {

    @org.junit.jupiter.api.Test
    void isWeekDay() throws ParseException {
        assertEquals(false, DateSimpleUtil.isWeekDay("2023/05/14"));
        assertThrows(ParseException.class, () -> DateSimpleUtil.isWeekDay("2023-03-01"));

    }

    @org.junit.jupiter.api.Test
    void isSaturdayOrSunday() throws ParseException {
        assertEquals(true, DateSimpleUtil.isSaturdayOrSunday("2023/05/14"));
    }

    @org.junit.jupiter.api.Test
    void validateAndParseDate() throws ParseException {
        String inputDate = "2023-05-07";
        assertThrows(ParseException.class, () -> DateSimpleUtil.validateAndParseDate(inputDate));
        String inputDate2 = "2023/05/07";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, 5 - 1, 7, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        assertEquals(calendar.getTime(), DateSimpleUtil.validateAndParseDate(inputDate2));
    }

    @org.junit.jupiter.api.Test
    void countWorkingDays() throws ParseException {
        assertEquals(2, DateSimpleUtil.countWorkingDays("2023/05/11", "2023/05/12"));
    }

    @org.junit.jupiter.api.Test
    void getDaysStrBetween() throws ParseException {
        String[] actual1 = DateSimpleUtil.getDaysStrBetween("2023/05/11", "2023/05/21");
        String[] expected1 = {
                "2023/05/11",
                "2023/05/12",
                "2023/05/13",
                "2023/05/14",
                "2023/05/15",
                "2023/05/16",
                "2023/05/17",
                "2023/05/18",
                "2023/05/19",
                "2023/05/20",
                "2023/05/21"
        };
        assertArrayEquals(expected1, actual1);

        String[] actual2 = DateSimpleUtil.getDaysStrBetween("2022/12/27", "2023/01/04");
        String[] expected2 = {
                "2022/12/27",
                "2022/12/28",
                "2022/12/29",
                "2022/12/30",
                "2022/12/31",
                "2023/01/01",
                "2023/01/02",
                "2023/01/03",
                "2023/01/04"
        };
        assertArrayEquals(expected2, actual2);
    }

    @org.junit.jupiter.api.Test
    void countDaysBetween() throws ParseException {
        Date date1_1 = DateSimpleUtil.validateAndParseDate("2023/03/04");
        Date date1_2 = DateSimpleUtil.validateAndParseDate("2023/03/06");
        assertEquals(2, DateSimpleUtil.countDaysBetween(date1_1, date1_2));
        Date date2_1 = DateSimpleUtil.validateAndParseDate("2023/03/30");
        Date date2_2 = DateSimpleUtil.validateAndParseDate("2023/04/01");
        assertEquals(2, DateSimpleUtil.countDaysBetween(date2_1, date2_2));
        Date date3_1 = DateSimpleUtil.validateAndParseDate("2023/03/30");
        Date date3_2 = DateSimpleUtil.validateAndParseDate("2023/04/04");
        assertEquals(5, DateSimpleUtil.countDaysBetween(date3_1, date3_2));
        Date date4_1 = DateSimpleUtil.validateAndParseDate("2023/03/30");
        Date date4_2 = DateSimpleUtil.validateAndParseDate("2023/04/30");
        assertEquals(31, DateSimpleUtil.countDaysBetween(date4_1, date4_2));
    }
}