import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {

        /*
         * = Q1 ================================================================
         * 
         * Create an array containing some integers.
         * Then, use a foreach loop to print out the square of each of the
         * integers, one per line.
         */

        int[] numbers = { 1, 3, 7, 4, 23, 7 };

        System.out.println(Arrays.toString(numbers)); // Added for Q3

        for (int i : numbers) {
            System.out.println(i * i);
            i += 5;
        }

        System.out.println(Arrays.toString(numbers)); // Added for Q3

        /*
         * = Q2 ================================================================
         * 
         * Take a look at the Cat class, defined below.
         * Create an array of cats, then use a foreach loop to have them speak
         * one by one.
         */

        Cat mo = new Cat("Moja", "I love my mom.");
        Cat ru = new Cat("Rumal", "I am a man of mystery.");
        Cat[] kennard_household = { mo, ru };

        System.out.println(Arrays.toString(kennard_household)); // Added for Q3

        for (Cat c : kennard_household) {
            c.speak();
        }

        System.out.println(Arrays.toString(kennard_household)); // Added for Q3

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