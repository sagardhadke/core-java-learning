// int a = 5, b = 10, c = 15; boolean d = (a < b) & (b < c); Print d. Then change & to && and print
// again. Are the results the same? Write a comment on what's different internally.

public class Logical_Q5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        boolean d = (a < b) & (b < c); // '&' evaluates both conditions.

        System.out.println(d); // true

        d = (a < b) && (b < c); // '&&' short-circuits; if the first condition is false, the second is not evaluated.

        System.out.println(d); // true
    }
}
