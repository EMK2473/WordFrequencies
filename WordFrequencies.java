package WordFrequencies;

import java.util.Scanner;

public class WordFrequencies {

   /* Define your method here */

   public static void main(String[] args) {
      /* Type your code here. */

      Scanner scnr = new Scanner(System.in);
        String inputLine = scnr.nextLine();
        String[] stringArray = inputLine.split(" ");
        int arraySize = stringArray.length;

        System.out.print("Array of strings: ");
        // for each syntax
        for(String s: stringArray) {
            System.out.print(s + " \n");
        }
        System.out. println("Array size: " + arraySize);
      scnr.close();
   }
}
