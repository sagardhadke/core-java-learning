// int p = 10; int q = p-- - --p; — Without running, predict q and the final value of p. Then verify.

public class IncreDecre_Q10 {
    public static void main(String[] args) {
        int p = 10;
        int q = p-- - --p; // q = 10 -  8 = 2

        System.out.println(p); // 8
        System.out.println(q); // 2


    }
}
