//* Q4 — Odd Numbers
//* Print all odd numbers between 1 and 50 using a while loop.

public class logic_q4 {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 50){
            if(num % 2 != 0){
                System.out.println(num);
            }
            num++;
        }
    }
}
