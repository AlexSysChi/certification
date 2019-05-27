package OCAJP.collections;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("coke");
        stringList.add("pepsi");
        stringList.add("miranda");

        System.out.println("Total Array List::" + stringList);

        String[] ws1 = new String[stringList.size()];
        String[] ws2 = stringList.toArray(ws1);

        System.out.println("ws1==ws2:" + (ws1==ws2));
        System.out.println("ws1:" + Arrays.toString(ws1));
        System.out.println("ws2:" + Arrays.toString(ws2));

        ws1 = new String[1];
        ws1[0] = "Test Data";
        ws2 = stringList.toArray(ws1);

        System.out.println("ws1==ws2:" + (ws1==ws2));
        System.out.println("ws1:" + Arrays.toString(ws1));
        System.out.println("ws2:" + Arrays.toString(ws2));




    }
}
