import java.util.Scanner;

public class WhileDoWhile {
    public static int getSomeInts(Scanner sc) {
        /*
         * Using a WHILE loop, sum up all the numbers a user provides through
         * the keyboard scanner.
         * When the sum of the numbers exceeds a 15, return the sum.
         * You may assume that the user only enters valid inputs.
         */

        int sum = 0;
        while (true) {
            sum += sc.nextInt();
            if (sum > 15) {
                return sum;
            }
        }

    }

    public static int doWhileGetSomeInts(Scanner sc) {
        /*
         * Using a DO-WHILE loop, sum up all the numbers a user provides through
         * the keyboard scanner.
         * When the sum of the numbers exceeds a 15, return the sum.
         * You may assume that the user only enters valid inputs.
         * 
         * This can be considered a refactoring of getSomeInts.
         */

        int sum = 0;

        do {
            sum += Integer.valueOf(sc.nextLine());
        } while (sum <= 15);

        return sum;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        /*
         * = Q1 ================================================================
         * Complete the method getSomeInts() using a WHILE loop.
         * Then, uncomment the function call below and check that the method
         * works as expected.
         */

        System.out.println("The sum is: " + getSomeInts(sc));

        /*
         * = Q2 ================================================================
         * Comment out the call to getSomeInts() above.
         * Complete the method doWhileGetSomeInts() using a DO-WHILE loop.
         * Then, uncomment the function call below and check that the method
         * works as expected.
         */

        // System.out.println("The sum is: " + doWhileGetSomeInts(sc));
 
        sc.close();
    }
}
