package all;

public class FeedingSchedule_11 {
    public static void main(String[] args) {
        int x = 5, j = 0;
        OUTER:
        for (int i = 0; i < 3; )
            INNER:do {
                i++;    // i =1| 2|3
                x++;    // x = 6| 7| 8
                if (x > 10) break INNER;
                x += 4; // x = 10| 11 |12
                j++;    // j = 1|2|3
            } while (j <= 2);
        System.out.println(x);
    }
}