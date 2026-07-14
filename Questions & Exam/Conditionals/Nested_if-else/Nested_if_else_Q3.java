// Q3. Declare int a = 10, b = 20, c = 15. Find the largest of the three using nested if-else only (not a
// ladder).

public class Nested_if_else_Q3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a > b) {

            if (a > c) {

                System.out.println(a + " A is Greater");
            } else {
                System.out.println(c + " C is Greater");
            }

        } else {
            if (b > c) {
                System.out.println(b + " B is Greater");
            } else {
                System.out.println(c + " C is Greater");
            }
        }
    }
}
