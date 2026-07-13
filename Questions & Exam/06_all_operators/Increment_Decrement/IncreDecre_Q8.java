//  int x = 3; int y = ++x * x++; — Predict y. Then verify. This is a classic interview trap

public class IncreDecre_Q8 {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * x++; // y = 4 * 4 = 16

        System.out.println(y); // 16
    }
}
