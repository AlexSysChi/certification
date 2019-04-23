package OCAJP.date;

import java.time.LocalDate;

public class ImutabilityExposing {
    public static void main(String[] args) {
        LocalDate lc = LocalDate.of(2015, 1, 31).now(); // actually it is equals to LocalDate.now()
        lc.plusYears(3);
        System.out.println(lc);
    }
}
