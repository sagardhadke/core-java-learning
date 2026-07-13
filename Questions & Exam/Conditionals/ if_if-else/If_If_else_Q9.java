// Q9. Declare int x = 0. Write an if statement with an empty body (semicolon only), then write a comment
// below explaining what bug this creates and why the block always runs

public class If_If_else_Q9 {
    public static void main(String[] args) {
        int x = 0;

        // The semicolon ends the if statement immediately. The following block is not part of the if, so it always executes, creating a logical bug.
        if(x == 0);{

        }


    }
}
