package OCAJP.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethodExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("b");

        while (!strings.isEmpty()) {

            System.out.println(strings.remove(0));
            System.out.println(strings.remove(""));

        }
    }


}
