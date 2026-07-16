//* int a = 7; a += 3; a -= 2; a *= 4; a /= 6; a %= 3; — Trace through each compound assignment step by step and predict the final printed value without running it first.

public class ArithM_Q7 {
    public static void main(String[] args) {
        int a = 7;
        a += 3; //10
        a -= 2; // 8
        a *= 4; // 32
        a /= 6; // 5
        a %= 3; // 0

        System.out.println(a); // 2
    }
}
