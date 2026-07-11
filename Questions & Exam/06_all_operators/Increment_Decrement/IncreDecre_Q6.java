// int j = 10; int l = ++j; — Predict and print j and l

public class IncreDecre_Q6 {
    public static void main(String[] args) {
        int j = 10;
        System.out.println(j); // 10
        int l = ++j;

        System.out.println(j); // now because of the ++ j become an 11
        System.out.println(l); // in l also set the 11 because pre-increment value increase first before the assign
    }
}
