//* Q10. Use a while loop to compute 2 raised to the power of 10 without using Math.pow. Print the result.

public class while_q10 {
    public static void main(String[] args) {
        int base = 2;
        int power = 10;
        int result = 1;
        int count = 0;

        while (count < power) {

            result = result * base;

            count++;
        }

        System.out.println(result);
    }
}
