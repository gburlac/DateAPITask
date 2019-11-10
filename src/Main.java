import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime nowFlight = LocalTime.parse("11:15").minusHours(6);
        System.out.println("Local time now: "+ dateTimeFormatter.format(nowFlight));

    }
}
