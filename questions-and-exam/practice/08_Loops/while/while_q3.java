//* Q3. Use a while loop to find the sum of digits of the number 1234. Print the sum.

public class while_q3 {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
