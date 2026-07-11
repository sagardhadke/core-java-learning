// Declare int a = 5, b = 2. Print a*b + b*b - a/b. Then add parentheses to change the order: a*(b+b) - (a/b). Print both and compare.

public class ArithM_Q8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println(a * b + b * b - a / b); // 12
        System.out.println(a * (b + b) - (a / b)); // 18
    }
}
