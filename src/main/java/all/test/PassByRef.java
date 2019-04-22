package all.test;

import java.time.LocalDate;
import java.time.Period;

public class PassByRef {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = d1;
        System.out.println("d1: " + d1 + ", d2:" + d2);
        System.out.println("changing d1...");
        Period p = Period.ofDays(1);
        d1 = d1.plus(p);
        System.out.println("d1: " + d1 + ", d2:" + d2);

    }


}
