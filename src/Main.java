import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime nowFlight = LocalTime.parse("11:15").minusHours(6);
        System.out.println("What is the duration of the flight? Duration of flight is:  " + dateTimeFormatter.format(nowFlight));

//        Task 2 What day of the week was it released?
        DayOfWeek dayOfWeek = LocalDate.parse("1977-05-25").getDayOfWeek();
        System.out.println("What day of the week was it released? Day of release is:  " + dayOfWeek);

//        How many times was it played in the first 2 years?
        LocalDate start = LocalDate.parse("1977-05-25");
        LocalDate end = LocalDate.parse("1979-05-25");
        LocalDate.parse("1977-05-25").plus(2, ChronoUnit.YEARS);






    }
}
