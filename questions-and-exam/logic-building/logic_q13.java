//* Q13 — Power of a Number
//* Take a base b and exponent e from the user. Calculate b to the power e using only a while loop — do not use Math.pow().
//* (Example: b=3, e=4 → 3×3×3×3 = 81)

import java.util.Scanner;

public class logic_q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 1;

        System.out.print("Enter base: ");
        int b = input.nextInt();

        System.out.print("Enter exponent: ");
        int e = input.nextInt();

        int count = 0;

        while (count < e) {
            result = result * b;
            count++;
        }

        System.out.println("Result = " + result);

    }
}
