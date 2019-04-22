package all.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        Period period = Period.ofDays(1);

        //System.out.println(date.plus(period));
        //System.out.println(dateTime.plus(period));
        //System.out.println(time.plus(period));  //java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Days

        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortDate =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shorTime =
                DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter ownFormat = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm");

        //System.out.println(dateTime.format(ownFormat));

        DateTimeFormatter parsingFormat = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate parsedDate = LocalDate.parse("01 02 2018", parsingFormat);
        System.out.println(parsedDate.format(DateTimeFormatter.ISO_LOCAL_DATE));


        //System.out.println(dateTime.format(shortDateTime));
        //System.out.println(shortDateTime.format(dateTime));

        //System.out.println(shortDateTime.format(date));
        //System.out.println(date.format(shortDateTime));




    }




}
