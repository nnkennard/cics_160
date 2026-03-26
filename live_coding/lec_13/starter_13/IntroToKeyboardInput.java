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
      System.out.println("Hi");

      Scanner sc = new Scanner(System.in);
      // There's also System.in
      // greeting = some_object.read_from_keyboard();

      greeting = sc.nextLine();

      System.out.println("Here's the greeting: " + greeting);

      String number;
      number = sc.nextLine();
      System.out.println("Here's the number: " + number);

      sc.close();


   }
}