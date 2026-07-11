/* Q6. Declare int a = 15, b = 4. Predict and print: a/b, a%b, (a/b)*b + (a%b). Does the last expression always reconstruct the original a? Write your conclusion as a comment. */

public class ArithM_Q6 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        System.out.println(a / b); // 3
        System.out.println(a % b); // 3
        System.out.println((a / b) * b + (a % b)); // 15
    }

    // Yes, The last expression gives back the original value of a.
}
