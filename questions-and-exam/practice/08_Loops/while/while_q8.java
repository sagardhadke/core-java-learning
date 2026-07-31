//* Q8. Use a while loop to check if a number is a palindrome. Use num = 121.
// (A number is a palindrome if it reads the same forwards and backwards.)

public class while_q8 {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverse = 0;

        while (num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
