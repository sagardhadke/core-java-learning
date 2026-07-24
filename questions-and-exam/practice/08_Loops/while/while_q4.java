//* Q4. Use a while loop to count how many digits are in the number 987654. Print the count.

public class while_q4 {
    public static void main(String[] args) {
        int num = 987654;
        int count = 0;

        while (num > 0){
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
