import java.util.Scanner;

/* This script is used to show two common problems you might run into using
     java.util.Scanner. (named P1 and P2 below)
*/

public class ScannerProblems {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a scanner.

        /*
         * = P1 ================================================================
         * One type of problem occurs when using Scanner.nextInt() to parse an
         *   integer input from the keyboard.
         * Every keyboard entry ends with a '\n' (newline) character.
         * Scanner.nextInt() parses only the integer part, and leaves the '\n'
         *   character to become part of the next scanner input.
         * If the next scanner input is a string, using sc.nextLine(), the
         *   character '\n' will be read in as the entire input, and
         *   sc.nextLine() will return before reading any new input from the
         *   keyboard.
         * 
         * Result: String willBeEmpty will contain an empty string (no input
         *   possible)
         * 
         * Fix: To read integers from the keyboard, use Scanner.nextLine() and 
         *   then parse using Integer methods.
         * 
         * You can comment out the incorrect code and uncomment the correct
         *   code below to see the difference.
        */

        // == Incorrect below this line ================================== P1 ==

        int i = sc.nextInt();
        String willBeEmpty = sc.nextLine();

        // == Incorrect above this line, correct below =================== P1 ==

        // int i = Integer.parseInt(sc.nextLine());
        // String willBeEmpty = sc.nextLine();

        // == Correct above this line ==================================== P1 ==

        System.out.println("The number is " + i + " and the string is " + willBeEmpty);

        /*
         * = P2 ================================================================
         * Another problem occurs if one Scanner object with System.in is
         *   closed, and then another Scanner object with System.in is opened.
         * It turns out that closing the Scanner closes System.in as well, and 
         *   so the second Scanner will not be able to use System.in.
         * 
         * Result: java.util.NoSuchElementException raised
         * 
         * Fix: Create the Scanner object in the main function, and don't close 
         *   it until the end of the main function.
         *   If it needs to be used in a function, send it as an argument.
         * 
         * You can comment out the incorrect code and uncomment the correct
         *   code below to see the difference.
         */


        // == Incorrect below this line ================================== P2 ==

        sc.close();
        scanAgainProblem();

        // == Incorrect above this line, correct below =================== P2 ==

        // scanAgainFine(sc); // You can use the Scanner multiple times
        // scanAgainFine(sc);
        // scanAgainFine(sc);
        // sc.close(); // Make sure sc.close() is the last thing in the method.

        // == Correct above this line ==================================== P2 ==

       
    }

    public static void scanAgainFine(Scanner sc){
        System.out.print("Enter another number: ");
        int j = Integer.parseInt(sc.nextLine());
        System.out.println(j);
    }

    public static void scanAgainProblem() {
        System.out.print("Enter another number: ");
        Scanner sc2 = new Scanner(System.in);
        int j = Integer.parseInt(sc2.nextLine());
        System.out.println(j);

    }
}