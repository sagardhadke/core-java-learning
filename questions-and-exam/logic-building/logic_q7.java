//* Q7 — Sum of Even Numbers
//* Take a number n from the user. Calculate the sum of all even numbers from 1 to n.

import java.util.Scanner;

public class logic_q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter the number: ");
        num = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i<= num; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
