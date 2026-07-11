// int a = 5, b = 10; int c = a + 2; c += 2; c -= 2; c *= 3; c /= 5; c %= 5; — What does c print? Walk
// through it step by step in comments.

public class ArithM_Q10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = a + 2;

        c += 2; // 9
        c -= 2; // 7
        c *= 3; // 21
        c /= 5; // 4
        c %= 5; //4
        System.out.println(c); // 4
    }


}
