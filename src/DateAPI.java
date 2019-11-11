import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class DateAPI {

public static int getDayOfWeek(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(1977,Calendar.MAY,25);
        DayOfWeek dayOfWeek = LocalDate.parse("1977-05-25").getDayOfWeek();
        return calendar.get(Calendar.DAY_OF_WEEK);

    }
}
