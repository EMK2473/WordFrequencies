package WordFrequencies;

import java.util.Scanner;

public class WordFrequencies {

   public static int getWordFrequency(String[] arrayOfStrings, int arraySize, String searchWord) {
        int frequency = 0;
        return frequency;
   }

   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int arraySize = scnr.nextInt();
    String inputWords = scnr.nextLine();
    String[] stringArray = inputWords.split(" ");
    
    for(String s : stringArray){
       if(s.length() > 0){
          System.out.print(s + " \n");
          }
       }
    
    System.out.println(arraySize);
    scnr.close();
   }
}
