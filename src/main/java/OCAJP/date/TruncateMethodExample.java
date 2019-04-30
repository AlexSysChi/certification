package OCAJP.date;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TruncateMethodExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(22, 11);
        localTime = localTime.truncatedTo(ChronoUnit.HALF_DAYS);
        // method truncates current value to specified unit,
        // all values less specified unit is set to zero
        System.out.println(localTime);

    }

}
