// int a = 5, b = 10; boolean r = (a > 0) || (b++ > 5); Print r and then print b. Was b incremented?

public class Logical_Q8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        boolean r = (a > 0) || (b++ > 5);
        // (a > 0) is true, so || short-circuits and (b++ > 5) is not evaluated.
        // Therefore, b is NOT incremented and remains 10.

        System.out.println(r);

        System.out.println(b);

    }
}
