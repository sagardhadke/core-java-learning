//* Q6. Use a for loop to find and print the factorial of 6. (6! = 6×5×4×3×2×1)

public class for_Q6 {
    public static void main(String[] args) {
        int num = 6;
        int factorial = 1;

        for(int i = 1; i<=num; i++){
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
