public class ForLoop {

    public static int factorial(int a) {
        /*
         * Implement this method to calculate the factorial of an integer.
         * Use a for loop to do the calculation.
         * 
         * The factorial of an integer n (written as n!) is the product of the
         * integers between 1 and n (inclusive).
         * 
         * e.g. 5! = 5 * 4 * 3 * 2 * 1 = 120
         * 
         */

        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void reverseAlphabet() {
        /*
         * Use a for loop to print the alphabet in reverse.
         *
         * The output should look like:
         * Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
         * 
         */
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        /*
         * = Q1 ================================================================
         * 
         * Complete the code in factorial() such that the loop below prints the
         * correct values.
         */

        for (int i = 1; i < 6; i++) {
            System.out.println(i + "! = " + factorial(i));
        }

        /*
         * = Q2 ================================================================
         * 
         * Uncomment the two lines below. They show one way to manipulate chars
         * in Java.
         * Run this method and observe the output -- (What's going on with the
         * increment operator?)
         * Leverage this information to complete the reverseAlphabet() method
         * so that it prints the correct output.
         * 
         */

        char c = 'A';
        System.out.println(c + " " + ++c);
        reverseAlphabet();

    }
}
