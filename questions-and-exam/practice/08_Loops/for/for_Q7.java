//* Q7. Use a nested for loop to print this pattern: 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

public class for_Q7 {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
