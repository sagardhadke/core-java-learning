//* Q4. Use a for loop to print the sum of numbers from 1 to 100. Print only the final sum.

public class for_Q4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
