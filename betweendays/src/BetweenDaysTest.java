import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BetweenDaysTest {


    BetweenDaysTest() throws ParseException {
        Date date1_1 = AddDate.validateAndParseDate("2023/03/04");
        Date date1_2 = AddDate.validateAndParseDate("2023/03/06");
        assertEquals(2, GetDate.getDaysBetweenDates(date1_1, date1_2));
        Date date2_1 = AddDate.validateAndParseDate("2023/03/30");
        Date date2_2 = AddDate.validateAndParseDate("2023/04/01");
        assertEquals(2, GetDate.getDaysBetweenDates(date2_1, date2_2));
        Date date3_1 = AddDate.validateAndParseDate("2023/03/30");
        Date date3_2 = AddDate.validateAndParseDate("2023/04/04");
        assertEquals(5, GetDate.getDaysBetweenDates(date3_1, date3_2));
        Date date4_1 = AddDate.validateAndParseDate("2023/03/30");
        Date date4_2 = AddDate.validateAndParseDate("2023/04/30");
        assertEquals(31, GetDate.getDaysBetweenDates(date4_1, date4_2));
    }
}