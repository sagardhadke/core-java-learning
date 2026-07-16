// Q2. Declare int num = 15. Using nested if-else, first check if num > 0. If yes, check if it is even or odd
// and print the result.

public class Nested_if_else_Q2 {
    public static void main(String[] args) {
        int num = 15;

        if(num > 0){
            if(num % 2 == 0){
                System.out.println(num + " is even");
            }else{
                System.out.println(num + " is odd");
            }
        }else{
            System.out.println("Invalid Number" + num + " : is Negative");
        }
    }
}
