package OCAJP.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FewMethodExample {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(
                LocalDate.of(2015, 3, 3),
                LocalTime.of(11, 22)
        );
        System.out.println(ldt);

        ldt = ldt.withDayOfMonth(12);
        System.out.println(ldt);

        System.out.println(
                ldt.getMonth() + ":" +
                ldt.getDayOfMonth() + ":" +
                ldt.getHour()
        );

        System.out.println(
                ldt.getMonthValue() + //":" +
                ldt.getDayOfMonth() + //":" +
                ldt.getHour()
        );

        System.out.println(
                LocalDate.ofYearDay(2015, 365)
        );

    }
}
