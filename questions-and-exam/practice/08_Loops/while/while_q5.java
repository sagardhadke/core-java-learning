//* Q5. Use a while loop to print all numbers from 1 to 50 that are divisible by both 3 and 7.

public class while_q5 {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 50){
            if(num % 3 == 0 && num % 7 == 0){
                System.out.println(num);
            }
            num++;
        }
    }
}
