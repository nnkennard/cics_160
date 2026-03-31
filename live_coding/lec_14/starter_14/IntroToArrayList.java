import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String[] args) {

        /*
         * = Q1 ================================================================
         * Create an ArrayList of type String named dining_halls.
         */
        
        ArrayList<String> dining_halls = new ArrayList<String>();

        /*
         * = Q2 ================================================================
         * Add to it the names of 3 or more dining halls
         * e.g. Worcester, Franklin, Hampshire...
         */

        dining_halls.add("Worcester");
        dining_halls.add("Franklin");
        dining_halls.add("Hampshire");
        
        /*
         * = Q3 ================================================================
         * Print out the list.
         */

        System.out.println(dining_halls);

        /*
         * = Q4 ================================================================
         * Print out the size of the list.
         */

        System.out.println(dining_halls.size());
        
        /*
         * = Q5 ================================================================
         * Print out the first item of the list.
         */

        System.out.println(dining_halls.get(0));
        // Your code here
        
        /*
         * = Q6 ================================================================
         * Replace the item at index 2 with "Dunkin", then print dining_halls out again.
         */

        dining_halls.set(2, "Dunkin");
        System.out.println(dining_halls);
        /*
         * = Q7 ================================================================
         * Remove "Worcester", then print dining_halls out again.
         * (What happens if you 'remove' something that isn't in the list?)
         */

        dining_halls.remove("Worcester");
        System.out.println(dining_halls);

        /*
         * = Q8 ================================================================
         * Remove the item at index 0, then print dining_halls out again.
         */
        
        // Your code here
        
        dining_halls.remove(0);
        System.out.println(dining_halls);
    }
}
