//* Q9 — Count Digits
//* Take any number from the user. Count how many digits it has.
//* (Example: 4567 → 4 digits)

import java.util.Scanner;

public class logic_q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter number: ");
        num = scanner.nextInt();

        int count = 0;

        for (int i = num; i != 0; i /= 10) {
            count++;
        }

//        while (num > 0) {
//            num /= 10;
//            count++;
//        }

        System.out.println("Count " + count);
    }
}
