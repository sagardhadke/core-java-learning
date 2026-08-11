//* Q8 — Factorial
//* Take a number n from the user and print its factorial.
//* (Example: 5! = 5×4×3×2×1 = 120)

import java.util.Scanner;

public class logic_q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        int finalOut = 1;

        System.out.print("Enter the number: ");
        num = scanner.nextInt();

        for(int i = num; i >= 1; i -- ){
            finalOut *= i;
//            System.out.println(finalOut);
        }

        System.out.println("The final number is " + finalOut);
    }
}
