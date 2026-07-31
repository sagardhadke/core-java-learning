//* Q7. Use a while loop to print the Fibonacci sequence up to the 10th term. (0, 1, 1, 2, 3, 5, 8, 13, 21, 34)

public class while_q7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 0;

        while (count <= 10){
            System.out.println(a + " ");

            int next = a + b;
            a = b;
            b = next;
            count++;
        }
    }
}
