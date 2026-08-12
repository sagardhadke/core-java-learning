//* Q10 — Reverse a Number
//* Take any number from the user and print it in reverse.
//* (Example: 1234 → 4321)

import java.util.Scanner;

public class logic_q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        int result = 0;
        while (num > 0){
            result = result * 10 + num % 10;
            num /= 10;
        }
        System.out.println(result);
    }

    /*

    * num = 123
    * result = 4 * 10 + 3
    * result = 43
*
*
    * 1. Get last digit       → num % 10
    * 2. Add digit to result  → result * 10 + digit
    * 3. Remove last digit    → num / 10
    * */
}
