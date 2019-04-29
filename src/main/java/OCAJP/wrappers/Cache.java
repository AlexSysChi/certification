package OCAJP.wrappers;

public class Cache {
    public static void main(String[] args) {

        Integer a = new Integer(127); // new object created
        Integer b = new Integer(127); // another new object with the same value created
        Integer c = 127; // new object created
        Integer d = 127; // object is referred to previous one due to cache [-128, 127]
       /*
       public static Integer valueOf ( int i){
            if (i >= IntegerCache.low && i <= IntegerCache.high)
                return IntegerCache.cache[i + (-IntegerCache.low)];
            return new Integer(i);
        }
        */
        Integer e = new Integer(200); // new object created
        Integer f = new Integer(200); // another new object with the same value created
        Integer g = 200; // new object created
        Integer h = 200; // another new object with the same value created, cache doesn't work here

        System.out.println((a == b) + " " + (c == d) + " " + (e == f) + " " + (g == h));

    }
}
