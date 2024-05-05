import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = getYear(date);
        System.out.println("Year: " + year);

        Month month = getMonth(date);
        System.out.println("Month: " + month);

        int day = getDayOfMonth(date);
        System.out.println("Day: " + day);

        DayOfWeek dayOfWeek = getDataDayOfWeek(date);
        System.out.println("Week of day: " + dayOfWeek);
    }

    private static DayOfWeek getDataDayOfWeek(OffsetDateTime data) {
        return data.getDayOfWeek();
    }

    private static int getDayOfMonth(OffsetDateTime data) {
        return data.getDayOfMonth();
    }

    private static Month getMonth(OffsetDateTime data) {
        return data.getMonth();
    }

    private static int getYear(OffsetDateTime data) {
        return data.getYear();
    }
}
