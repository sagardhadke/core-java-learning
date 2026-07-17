//* Declare int marks = 82. Using an if-else-if ladder, print the grade: A (>= 90) | B
// (>= 75) | C (>= 60) | D (>= 50) | F (below 50) Then declare int income = 750000 and
// print its tax slab using another if-else-if: 0–250000 ® No Tax | 250001–500000 ® 5% |
// 500001–1000000 ® 20% | above 1000000 ® 30%

public class code_Q4 {
    public static void main(String[] args) {
        int marks = 82;

        if(marks >= 90){
            System.out.println(marks + " A");
        } else if (marks >= 75) {
            System.out.println(marks + " B");
        } else if (marks >= 60) {
            System.out.println(marks + " C");
        } else if (marks >= 50) {
            System.out.println(marks + " D");
        } else if (marks < 50) {
            System.out.println(marks + " F");
        }

        int income = 750000;
        double result = 0;

        if(income < 250000){
            System.out.println(income + " ® No Tax");
        }else if (income < 500000){
            result = (0.05 * income);
            System.out.println(income + " ® 5%" + " = " + result);
        } else if (income < 1000000) {
            result = (0.20 * income);
            System.out.println(income + " ® 20%" + " = " + result);
        } else if (income > 1000000) {
            result = (0.30 * income);
            System.out.println(income + " ® 30%" + " = " + result);
        }
    }
}
