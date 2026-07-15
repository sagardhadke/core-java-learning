// Q8. Declare int a = 3, b = 5, c = 1.
// Find the MIDDLE value (not max, not min)
// using nested if-else only. Print it.

public class Nested_if_else_Q8 {

    public static void main(String[] args) {

        int a = 3, b = 5, c = 1;
        int middle;

        if (a > b) {
            // a is bigger than b, so middle is either b or a
            if (a > c) {
                // a is the largest (a > b and a > c)
                // middle is the larger of b and c
                if (b > c) {
                    middle = b;
                } else {
                    middle = c;
                }
            } else {
                // c > a > b, so a is the middle
                middle = a;
            }
        } else {
            // b >= a, so b is bigger than a
            if (b > c) {
                // b is the largest (b >= a and b > c)
                // middle is the larger of a and c
                if (a > c) {
                    middle = a;
                } else {
                    middle = c;
                }
            } else {
                // c >= b >= a, so b is the middle
                middle = b;
            }
        }

        System.out.println("Middle value is: " + middle);

    }

}
