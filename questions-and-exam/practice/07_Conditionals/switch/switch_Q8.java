//* Q8. Write a switch where two cases intentionally fall through into a shared block, but the third case does
// NOT. Use int x = 1 and show the output.

public class switch_Q8 {
    public static void main(String[] args) {
        int x = 1;

        switch (x) {
            case 1:
            case 2:
                System.out.println("Shared Block");
                break;

            case 3:
                System.out.println("Only Case 3");
                break;
        }
    }
}
