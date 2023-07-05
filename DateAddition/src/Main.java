import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");


        Date date = dateFormat.parse(args[0]);

        int daysToAdd = 0;
        daysToAdd = Integer.parseInt(args[1]);


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, daysToAdd);

        String result = dateFormat.format(calendar.getTime());
        System.out.println(result);
    }
}