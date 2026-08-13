//* Q2 — Sum Until Limit
//* Keep adding natural numbers 1, 2, 3, 4… until the sum exceeds 50. Print the final sum and the last number that was added.

public class logic_q12 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        for(int i = 1; i<= 50; i++){
            sum += i;
            if(sum > 50){
                num = i;
                break;
            }
        }
        System.out.println("Sum " + sum + " Num " + num);
    }
}
