// Q1. Declare int marks = 82. Print grade using if-else-if ladder: A (>= 90), B (>= 75), C (>= 60), D (>=
// 50), F (below 50).

public class if_else_if_Ladder_Q1 {
    public static void main(String[] args) {
        int marks = 82;

        if(marks >= 90){
            System.out.println(marks + ": A");
        } else if (marks >= 75) {
            System.out.println(marks + ": B");
        } else if (marks >= 60) {
            System.out.println(marks + ": C");
        } else if (marks >= 50) {
            System.out.println(marks + ": D");
        }else{
            System.out.println(marks + ": F");
        }
    }
}
