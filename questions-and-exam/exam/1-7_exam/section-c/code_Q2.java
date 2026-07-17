//* Declare int x = 10. Apply these compound operators in order and print x after
// each step with a label: x += 5 x *= 2 x -= 8 x /= 3 x %= 4

public class code_Q2 {
    public static void main(String[] args) {
        int x = 10;

        x += 5;
        System.out.println("x += 5" + " = " + x );
        x *= 2;
        System.out.println("x *= 2" + " = " + x );
        x -= 8;
        System.out.println("x -= 8" + " = " + x );
        x /= 3;
        System.out.println("x /= 3" + " = " + x );
        x %= 4;
        System.out.println("x %= 4" + " = " + x );

        System.out.println(x);

    }
}
