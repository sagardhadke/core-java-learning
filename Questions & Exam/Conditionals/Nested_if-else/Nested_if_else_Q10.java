// Q10. Declare int x = 15. Without using &&,
// replicate the condition (x > 10 && x < 20) using only nested if
// to print 'In range' or 'Out of range

public class Nested_if_else_Q10 {
    public static void main(String[] args) {
        int x = 15;

        if (x > 10) {
            if (x < 20) {
                System.out.println("In range");
            } else {
                System.out.println("Out of range");
            }
        } else {
            System.out.println("Out of range");
        }

    }
}
