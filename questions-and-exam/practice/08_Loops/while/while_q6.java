//* Q6. Use a while loop to find the GCD (Greatest Common Divisor) of 48 and 18 using repeated subtraction

public class while_q6 {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        while (a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
