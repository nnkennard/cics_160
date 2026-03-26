public class JavaVsPythonPlus {
    public static void main(String[] args) {

        /*
         * = Q1 ================================================================
         * If either operand of the + operator is a string, both operands are treated as
         * strings.
         * Confirm that the code below runs without errors.
         */

        String old_timey_song;
        old_timey_song = "Mambo No. " + 5;
        System.out.println(old_timey_song);

        /*
         * = Q2 ================================================================
         * 
         * If there are multiple + operators in an expression, evaluation proceeds from
         * left to right.
         * The immediate neighbors of the + are treated as operands, then the result is
         * used in the continued computation.
         * Predict what the commented-out line below will print to System.out.
         * Record your prediction, then check it.
         * 
         * >>> your prediction here <<<
         * 
         */

        // System.out.println("The sum of 5 and 10 is: " + 5 + 10);

        /*
         * = Q3 ================================================================
         * 
         * Predict what the two commented-out lines below will print to System.out.
         * Record your prediction, then check it.
         * 
         * >>> your prediction here <<<
         * 
         */

        // System.out.println(5 + 10 + " is the sum of 5 and 10.");
        // System.out.println("The sum of 5 and 10 is: " + (5 + 10));

    }

}
