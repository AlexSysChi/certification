package all;

import java.util.ArrayList;
import java.util.List;

public class _7 {
    public static void main(String[] args) {
        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();

        list.add(array[0]); // 0: 6
        list.add(array[2]); // 1: 8
        list.set(1, array[1]); // 1: 9
        list.remove(0);

        System.out.println(list);

    }
}
