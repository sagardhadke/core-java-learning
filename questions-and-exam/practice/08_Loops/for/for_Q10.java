//* Q10. Use a for loop to reverse the digits of the number 12345 without using String. Print the reversed number

public class for_Q10 {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;

        for (; num > 0; ) {
            int digit = num % 10;      // Get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;            // Remove last digit
        }

        System.out.println(reverse);
    }
}
