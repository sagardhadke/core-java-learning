// int a = 5, b = 10, c = 3; boolean r = (a < b) && (b > c) && (a != c); Print r. Trace each part in comments.

public class Logical_Q9 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 3;
        boolean r = (a < b) && (b > c) && (a != c);
        // (a < b)  -> (5 < 10)  -> true
        // (b > c)  -> (10 > 3)  -> true
        // (a != c) -> (5 != 3)  -> true
        // true && true && true -> true
        System.out.println(r); // true
    }
}

