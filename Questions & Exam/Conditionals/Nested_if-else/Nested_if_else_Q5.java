// Q5. Declare int x = 7. Using nested if:
// if x > 0 and x > 5, print 'Greater than 5'.
// If only x > 0, print 'Between 1 and 5'.
// If x is not positive, print 'Not positive'.

public class Nested_if_else_Q5 {
    public static void main(String[] args) {
        int x = 7;
        if (x > 0) {
            if (x > 5) {
                System.out.println("Greater than 5");
            } else {
                System.out.println("Between 1 and 5");
            }
        } else {
            System.out.println("Not positive");
        }
    }
}
