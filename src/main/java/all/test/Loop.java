package all.test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Loop {
    public static final void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("xxxx");
        names.add("yyyy");
        names.add("zzzz");
//        for (String name : names) {
//            System.out.print(name +  ", ");
//        }

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (i > 0) {    // simple don't print comma before first print, and won't managed to print after last one
                System.out.print(", ");
            }
            System.out.print(name);
//            if (i < (names.size() - 1)) {
//                System.out.print(", ");
//            }
        }
    }
}
