package OCAJP.loops;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForeachAndForRelationship {

    public static void main(String[] args) {

        //  for arrays
        String[] names = {"Alex", "Bob", "Nick"};
        System.out.println("foreach");
        for (String name : names) {
            System.out.print(name + ", ");  //  prints comma after each name
        }
        System.out.println("\nfor");
        for (int i = 0; i < names.length; i++) {
            if (i > 0) {
                System.out.print(", "); //  prints only required commas
            }
            String name = names[i];
            System.out.print(name);
        }

        // for iterable objects
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        for(int value : values) {
            System.out.print(value + ", ");
        }
        for(Iterator<Integer> i = values.iterator(); i.hasNext(); /*increment not needed here*/ ) {
            int value = i.next();
            System.out.print(value + ", ");
        }
        //or
        Iterator<Integer> i = values.iterator();
        while (i.hasNext()) {
            int value = i.next();
            System.out.print(value + ", ");
        }



    }
}
