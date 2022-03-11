import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
class  Result{
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return LocalDate.of(year, month, day).getDayOfWeek().toString();

    }
}

public class TimeDate {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1990, 8, 5);
        String s = LocalDate.of(1990, 12, 05).getDayOfWeek().toString();
        System.out.println(s);
    }
}
