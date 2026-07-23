//* Q9. Use a nested for loop to print the multiplication table for numbers 1 to 5 in a grid format.

public class for_Q9 {
    public static void main(String[] args) {
        for(int i = 1; i<= 5; i++){
            for(int j = 1; j <= 5; j++){ // full multiplication j <= 10 , and grid 5x5 so j <= 5
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
