/*
   * We would like to write the equivalent of the following Python code:
   *
   *   greeting = input()
   *   print("Here's the greeting: " + greeting)
   * 
   *   number = int(input())
   *   print("You entered the number: " + str(number))
*/

import java.util.Scanner;

public class IntroToKeyboardInput {
    public static void main(String[] args) {

        String greeting;

        // greeting = someKindOfObject.getKeyboardInput();
        // Create the keyboardInputCapturer (somehow related to System.in)
        Scanner sc = new Scanner(System.in);

        // greeting = keyboardInputCapturer.getSomeInput();
        greeting = sc.nextLine();
        System.out.println("Here's the greeting: " + greeting);

        int number = Integer.valueOf(sc.nextLine());
        System.out.println("You entered the number: " + number);

        sc.close();
    }
}