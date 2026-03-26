import java.util.ArrayList;

public class ArrayListTricky {
    public static void main(String[] args) {
        ArrayList<Integer> some_numbers = new ArrayList<Integer>();
        some_numbers.add(6);
        some_numbers.add(5);
        some_numbers.add(4);
        some_numbers.add(3);
        some_numbers.add(2);
        some_numbers.add(1);

        System.out.println(some_numbers);
        // The line above prints [6, 5, 4, 3, 2, 1].

        /*
         * = Q1 ================================================================
         * 
         * Below this multiline comment, there are two commented-out lines of Java code.
         * Try to predict what will be printed to System.out when those lines are uncommented and this method is run.
         * Record your prediction, then uncomment the lines and run this method.
         * 
         * >>> [6, 4, 3, 2, 1] <<<
         */

        // some_numbers.remove(1);
        // System.out.println(some_numbers);

        /*
         * = Q2 ================================================================
         * 
         * Below this multiline comment, there are two commented-out lines of Java code.
         * Try to predict what will be printed to System.out when those lines are
         * uncommented and this method is run.
         * Record your prediction, then uncomment the lines and run this method.
         * 
         * >>> [6, 4, 3, 1] <<<
         */

        // some_numbers.remove(Integer.valueOf(2));
        // System.out.println(some_numbers);

        // =====================================================================

    }
}
