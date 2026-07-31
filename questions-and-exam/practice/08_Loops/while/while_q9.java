//* Q9. Use a while loop to find all perfect numbers between 1 and 500. (A perfect number equals the sum
// of its proper divisors. e.g. 6 = 1+2+3)

public class while_q9 {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 500) {

            int sum = 0;
            int divisor = 1;

            while (divisor < num) {

                if (num % divisor == 0) {
                    sum = sum + divisor;
                }

                divisor++;
            }

            if (sum == num) {
                System.out.println(num);
            }

            num++;
        }
    }
}
