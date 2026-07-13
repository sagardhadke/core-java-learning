// Q3. Declare int age = 20. Print 'Adult' if age >= 18, else print 'Minor'

public class If_If_else_Q3 {
    public static void main(String[] args) {
        int age = 20;
        if(age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Minor");
            System.out.println("Wait for " + (18 - age) + " For Vote");
        }
    }
}
