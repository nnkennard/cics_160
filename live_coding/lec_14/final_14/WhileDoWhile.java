import java.util.Scanner;

public class WhileDoWhile {
    public static int getSomeInts() {
        /*
         * Using a WHILE loop, sum up all the numbers a user provides through
         * the keyboard scanner.
         * When the sum of the numbers exceeds a 15, return the sum.
         * You may assume that the user only enters valid inputs.
         */

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            sum += Integer.valueOf(sc.nextLine());
            if (sum > 15) {
                sc.close();
                return sum;
            }
        }

    }

    public static int doWhileGetSomeInts() {
        /*
         * Using a DO-WHILE loop, sum up all the numbers a user provides through
         * the keyboard scanner.
         * When the sum of the numbers exceeds a 15, return the sum.
         * You may assume that the user only enters valid inputs.
         * 
         * This can be considered a refactoring of getSomeInts.
         */

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        do {
            sum += Integer.valueOf(sc.nextLine());
        } while (sum <= 15);

        sc.close();
        return sum;

    }

    public static void main(String[] args) {

        /*
         * = Q1 ================================================================
         * Complete the method getSomeInts() using a WHILE loop.
         * Then, uncomment the function call below and check that the method
         * works as expected.
         */

        // System.out.println("The sum is: " + getSomeInts());

        /*
         * = Q2 ================================================================
         * Comment out the call to getSomeInts() above.
         * Complete the method doWhileGetSomeInts() using a DO-WHILE loop.
         * Then, uncomment the function call below and check that the method
         * works as expected.
         */

        System.out.println("The sum is: " + doWhileGetSomeInts());
    }
}
