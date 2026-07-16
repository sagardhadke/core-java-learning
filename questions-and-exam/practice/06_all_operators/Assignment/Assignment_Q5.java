// int a = 8; Apply: a <<= 2; then a >>= 1; Print a after each step

public class Assignment_Q5 {

    public static void main(String[] args) {
        int a = 8;

        a <<= 2; // Left shift by 2 (8 -> 32)
        System.out.println("After a <<= 2: " + a);

        a >>= 1; // Right shift by 1 (32 -> 16)
        System.out.println("After a >>= 1: " + a);
    }

}