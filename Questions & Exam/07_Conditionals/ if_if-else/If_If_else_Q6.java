// Q6. Declare int a = 10, b = 20, c = 15. Print whether a + b is greater than b + c.

public class If_If_else_Q6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        int sum1 = a + b;
        int sum2 = b + c;

        if(sum1 > sum2){
            System.out.println("A + B is greater then B + C");
        }else{
            System.out.println("B + C is greater then A + B");

        }
    }
}
