// Q2. Declare int num = 0. Print 'Positive', 'Negative', or 'Zero' using if-else-if.

public class if_else_if_ladder_Q2 {
    public static void main(String[] args) {
        int num = 0;

        if(num == 0){
            System.out.println("Zero");
        } else if (num > 0) {
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
}
