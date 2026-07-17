// Q3. Declare int age = 16. Print 'Child' (< 13), 'Teenager' (13–17), 'Adult' (18–59), 'c' (>= 60) using
// if-else-if.

public class if_else_if_ladder_Q3 {
    public static void main(String[] args) {
        int age = 16;
        
        if(age < 13){
            System.out.println(age + ": Child");
        } else if (age > 13 && age < 17) {
            System.out.println("Teenager");
        } else if (age > 18 && age < 59) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("C");
        }
    }
}
