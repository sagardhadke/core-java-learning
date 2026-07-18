//* Q10. Convert this if-else-if into a switch: if(x==1) print 'A'; else if(x==2) print 'B'; else if(x==3) print 'C';
// else print 'Other'; Then write a comment on ONE thing a switch cannot do that if-else-if can.

public class switch_Q10 {
    public static void main(String[] args) {
        int x = 2;

        switch (x) {
            case 1:
                System.out.println("A");
                break;

            case 2:
                System.out.println("B");
                break;

            case 3:
                System.out.println("C");
                break;

            default:
                System.out.println("Other");
        }
    }
}
