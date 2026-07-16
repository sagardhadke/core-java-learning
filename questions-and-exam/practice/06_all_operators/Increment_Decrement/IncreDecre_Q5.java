// int j = 7; j++; ++j; int k = j++; — Predict and print both j and k after these lines.

public class IncreDecre_Q5 {
    public static void main(String[] args) {
        int j = 7;
        j++; // 7
        ++j; // 9
        System.out.println(j); // 9
        int k = j++; //9 because j value is 9 so assign the value before the ++ that's why it's 9
        System.out.println(k);// 9

    }
}
