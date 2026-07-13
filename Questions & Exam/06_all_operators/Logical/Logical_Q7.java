// int x = 0; boolean r = (x != 0) && (10 / x > 1); Print r. What would happen if you replaced && with &
// here? (Answer in a comment — do NOT actually run the & version as it will crash.)

public class Logical_Q7 {
    public static void main(String[] args) {
        int x = 0;
        boolean r = (x != 0) && (10 / x > 1);

        System.out.println(r); // false

        // Since x is 0, 10 / x causes an ArithmeticException: / by zero.

        r = (x != 0) & (10 / x > 1); // Error Here

        System.out.println(r);
    }
}
