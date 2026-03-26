import java.util.Arrays;

public class IntroToArrays {
    public static void main(String[] args) {
        /*
         * = Q1 ================================================================
         * Create an array of size 8 that stores ints, call it arr.
         */
        int[] arr = new int[8];

        /*
         * = Q2 ================================================================
         * Create an array of strings of cat names e.g. Mo, Ru, Tunky.
         */
        String[] catNames = { "Mo", "Ru", "Tunky" };

        /*
         * = Q3 ================================================================
         * Create an array of strings of size 29 that contains only empty
         * strings, call it empty.
         */
        String[] empty = new String[29];

        /*
         * = Q4 ================================================================
         * Create a 2d array of ints named matrix, where the outer array is of
         * size 4 and the inner arrays are all of size 3.
         */
        int[][] matrix = new int[4][3];

        /*
         * = Q5 ================================================================
         * Print out arr (created above).
         */
        System.out.println(Arrays.toString(arr));

        /*
         * = Q6 ================================================================
         * Print out empty (created above).
         */
        System.out.println(Arrays.toString(empty));

        /*
         * = Q7 ================================================================
         * Print out matrix (created above).
         */
        System.out.println(Arrays.deepToString(matrix));

        /*
         * = Q8 ================================================================
         * Print out the length of the cat names array.
         */
        System.out.println(catNames.length);

    }
}
