public class ForEach {
    public static void main(String[] args) {

        /*
         * = Q1 ================================================================
         * 
         * Create an array containing some integers.
         * Then, use a foreach loop to print out the square of each of the
         * integers, one per line.
         */

        // Your code here

        /*
         * = Q2 ================================================================
         * 
         * Take a look at the Cat class, defined below.
         * Create an array of cats, then use a foreach loop to have them speak
         * one by one.
         */

        // Your code here

        /*
         * = Q3 ================================================================
         * 
         * Add to the code above to do the following:
         * 1. Print out the lists before and after the loop
         * 2. Make some changes to each item in the array during the loop (you
         *    can use set_catchphrase() for Cats)
         * 3. Confirm that the item in the underlying list changes for 
         *    reference types but not for primitive types.
         */

        // Your code here

    }
}

class Cat {

    String name, catchphrase;
    public Cat(String n, String c) {
        name = n;
        catchphrase = c;
    }

    public void speak() {
        System.out.println(name + ": " + catchphrase);
    }

    public void setCatchprase(String newCatchphrase) {
        catchphrase = newCatchphrase;
    }

    public String toString()
    {
        return name + ", who says: \"" + catchphrase+"\"";
       }
}