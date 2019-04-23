package OCAJP.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/mm/dd");
        LocalDateTime ldt =
                LocalDateTime.of(
                        2018,
                        10,
                        10,
                        11,
                        22
                );
        System.out.println(dtf.format(ldt));
        System.out.println(ldt.format(dtf));

    }
}
