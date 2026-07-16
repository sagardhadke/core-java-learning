// int a = 5, b = 10; int c = a + 2; c += 2; c -= 2; c *= 3; c /= 5; c %= 5; — What does c print? Walk
// through it step by step in comments.

public class ArithM_Q10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10; // Declared but not used

        int c = a + 2;   // c = 5 + 2 = 7

        c += 2;          // c = 7 + 2 = 9
        c -= 2;          // c = 9 - 2 = 7
        c *= 3;          // c = 7 * 3 = 21
        c /= 5;          // c = 21 / 5 = 4 (integer division, remainder discarded)
        c %= 5;          // c = 4 % 5 = 4 (4 divided by 5 leaves remainder 4)

        System.out.println(c); // Prints 4
    }


}
