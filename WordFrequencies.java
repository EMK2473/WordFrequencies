package WordFrequencies;

import java.util.Scanner;

public class WordFrequencies {

   public static int getWordFrequency(String[] arrayOfStrings, int arraySize, String searchWord) {
        int frequency = 0;
        for(String s: arrayOfStrings) {
            if (s.equalsIgnoreCase(searchWord)) {
               frequency++;
            }
            }
            return frequency;
   }

   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int arraySize = scnr.nextInt();
    String inputWords = scnr.nextLine();
    String[] stringArray = inputWords.split(" ");
    
    for(String s : stringArray){
       if(s.length() > 0){
        String searchWord = s;
        int freq = getWordFrequency(stringArray, arraySize, searchWord);
        System.out.print(s + " " + freq + "\n");
          }
       }
    
    System.out.println(arraySize);
    scnr.close();
   }
}
