//* Q2. Use a do-while loop to print the multiplication table of 7.

public class do_while_q2 {
    public static void main(String[] args) {
        int num = 1;

        do {
            System.out.println("7 x " + num + " = " + (7 * num));
            num++;
        } while (num <= 10);
    }
}
