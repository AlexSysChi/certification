package OCAJP.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

public class DateTimeTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        Period period = Period.ofDays(1);

        System.out.println(date.plus(period));
        //System.out.println(time.plus(period));  //java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Days
        System.out.println(dateTime.plus(period));

        System.out.println("---------------------");

        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        DateTimeFormatter shortDate =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        DateTimeFormatter shortTime =
                DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        DateTimeFormatter own12Format =
                DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm");
        DateTimeFormatter own24Format =
                DateTimeFormatter.ofPattern("dd MMMM yyy HH:mm");

        System.out.println(dateTime.format(shortDateTime));
        System.out.println(dateTime.format(shortDate));
        System.out.println(dateTime.format(shortTime));
        System.out.println(dateTime.format(own12Format));
        System.out.println(dateTime.format(own24Format));

        System.out.println("---------------------");
        DateTimeFormatter parsingFormat = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate parsedDate = LocalDate.parse("01 02 2018", parsingFormat);
        System.out.println(parsedDate.format(DateTimeFormatter.ISO_LOCAL_DATE));


        LocalTime localTime = LocalTime.of(2, 2, 15);
        System.out.println(localTime.getLong(ChronoField.valueOf("MINUTE_OF_DAY")));

        //System.out.println(dateTime.format(shortDateTime));
        //System.out.println(shortDateTime.format(dateTime));

        //System.out.println(shortDateTime.format(date));
        //System.out.println(date.format(shortDateTime));




    }




}
