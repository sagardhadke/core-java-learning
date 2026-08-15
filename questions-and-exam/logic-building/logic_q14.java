//* Q4 — Digit Sum
//* Take any number from the user and print the sum of its digits.
//* (Example: 4832 → 4+8+3+2 = 17)

import java.util.Scanner;

public class logic_q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 0;
        int num = 0;

        System.out.print("Enter number: ");
        num = input.nextInt();

        while (num > 0) {
            result = result + num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + result);

    }
}
