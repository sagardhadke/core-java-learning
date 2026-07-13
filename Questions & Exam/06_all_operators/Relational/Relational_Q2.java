// Declare int a = 5, b = 10. Store the result of (a > b) in a boolean variable and print it. Then store (a
// != b) and print it.

public class Relational_Q2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        boolean result = (a>b);

        System.out.println(result); // false

        result = (a!=b);
        System.out.println(result); // true
    }
}
