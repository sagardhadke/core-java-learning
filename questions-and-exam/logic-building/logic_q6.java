//* Q6 — Sum of Natural Numbers
//* Take a number n from the user. Calculate and print the sum of first n natural numbers.
//* (Example: n=5 → 1+2+3+4+5 = 15)

import java.util.Scanner;

public class logic_q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int finalOut = 0;

        System.out.print("Enter the Number: ");
        num = scanner.nextInt();

        for(int i = 1; i <= num; i ++){
//            System.out.println(i + " X " + num);
            finalOut += i;
        }
        System.out.println("The final number is " + finalOut);
    }
}
