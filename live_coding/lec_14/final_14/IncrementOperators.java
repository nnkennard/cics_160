public class IncrementOperators {

    public static void printAnInt(int i){
        System.out.println("i = "+i);
    }
    
    public static void main(String[] args) {
        int a = 3;

        /*
         * = Q1 ================================================================
         * 
         * Confirm that the line below prints 3, as expected.
         */

        printAnInt(a);

        /*
         * = Q2 ================================================================
         * 
         * When a POST-increment (a++) operator is seen in a statement, it is
         * treated as follows:
         * 
         * 1. Complete the execution of the statement using the current value
         * 2. THEN increment the value of the variable. 
         * 
         * Predict what the commented-out lines below will print to System.out.
         * Record your prediction, then check it.
         * 
         * >>> your prediction here <<<
         * 
         */

        // printAnInt(a++);
        // printAnInt(a);

        /*
         * = Q3 ================================================================
         * 
         * When a PRE-increment (++a) operator is seen in a statement, it is
         * treated as follows:
         * 
         * 1. Increment the value of the variable
         * 1. THEN complete execution of the statement, using the new value. 
         * 
         * Predict what the commented-out lines below will print to System.out.
         * Record your prediction, then check it.
         * 
         * >>> your prediction here <<<
         * 
         */
        
        // printAnInt(++a);
        // printAnInt(a);

        /*
         * = Q3 ================================================================
         * 
         * Pre- and post-DECREMENT operators are similar.
         * 
         * For a challenge, 
         * Predict what the commented-out lines below will print to System.out.
         * Record your prediction, then check it.
         * 
         * >>> your prediction here <<<
         * 
         */

        // int b = 37;
        
        // System.out.println("b = " + b--);
        // System.out.println("b = " + b);
        // System.out.println("b = " + --b);
        
    }
}

