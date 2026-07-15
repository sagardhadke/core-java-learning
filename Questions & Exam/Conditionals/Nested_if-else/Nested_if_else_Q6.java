// Q6. Declare int num = -4. Using nested if-else classify as: positive-even, positive-odd, negative-even,
// negative-odd, or zero.

public class Nested_if_else_Q6 {
    public static void main(String[] args) {
        int num = -4;

        if (num > 0) {

            if (num % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }

        } else {

            if (num < 0) {

                if (num % 2 == 0) {
                    System.out.println("Negative Even");
                } else {
                    System.out.println("Negative Odd");
                }

            } else {
                System.out.println("Zero");
            }

        }
    }
}
