// int a = 5; int b = a++ + ++a; — Predict b without running. Then verify. Write a detailed comment
// explaining what happened.

public class IncreDecre_Q7 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a; //  b = 5 + 7 => 12

        System.out.println(b); // 12
    }
}
