//* Q5 — Multiplication Table
//* Take a number n from the user and print its multiplication table from n×1 to n×10.

import java.util.Scanner;

public class logic_q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter an Number: ");

        num = scanner.nextInt();

        for(int i = 1; i<= 10; i++){
            System.out.println(num + " X " + i + " = " +  (num * i));
        }

    }
}
