//* Q1 — Countdown with Message
//* Print numbers from 20 down to 1, but whenever the number is divisible by 4, print "Divisible!" instead of the number.

public class logic_q11 {
    public static void main(String[] args) {

        for(int i = 20; i>= 1; i--){
            if(i % 4 == 0){
                System.out.println("Divisible!");
            }else{
                System.out.println(i);
            }
        }
    }
}
