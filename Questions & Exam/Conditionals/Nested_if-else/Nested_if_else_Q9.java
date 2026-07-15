// Q9. Declare int num = 0. Using deeply nested if-else
// (3 levels), classify num as: positive-large (> 100),
// positive-small (1-100), zero, negative-small
// (-100 to -1), negative-large (< -100).

public class Nested_if_else_Q9 {
    public static void main(String[] args) {
        int num = 0;

        if (num > 0) {
            if (num > 100) {
                System.out.println("Positive Large");
            } else {
                System.out.println("Positive Small");
            }

        } else {
            if (num == 0) {
                System.out.println("Zero");
            } else {

                if (num < -100) {
                    System.out.println("Negative Large");
                } else {
                    System.out.println("Negative Small");
                }

            }

        }
    }
}
