//* Q4. Declare int x = 2. Write a switch WITHOUT break in any case. Print the output and write a comment
// explaining fall-through.

public class switch_Q4 {
    public static void main(String[] args) {
        int x = 2;

        switch (x) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Done");
        }
    }
}
