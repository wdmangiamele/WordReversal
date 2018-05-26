import java.util.ArrayList;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class SentenceReverse {
   //Start time of the program
   public static double startTime = System.nanoTime();
   
   //The string to be reversed (can be changed to any sentence)
   public static String sentence = "This is a string";

   public static void main(String []args){   
        
        SentenceReverse sr = new SentenceReverse();
        
        System.out.println(sentence);
        System.out.println(sr.wordFlip(sentence));
        System.out.println(sr.fullReverse(sentence));
        
        //Print out the program runtime
        final double endTime = System.nanoTime();
        final double duration = (endTime - startTime)/100000000;
        NumberFormat formatter = new DecimalFormat("###.#####");  
        String f = formatter.format(duration);
        
        System.out.println("\nProgram Runtime: "+f+" seconds");
  
   }
   
   
   //this method flips the word order backwards 
   public String wordFlip(String sentence){
        String backwards="";
        //split the sentence up into an array
        String splitWords[] = sentence.split(" ");
        //reverse the string
        for(int i=splitWords.length-1; i>=0; i--){
           backwards= backwards.concat(splitWords[i]+" ");
        }
        //return backwards sentence 
        return backwards;
   }
   
   //this method flips each letter in every word, and word order
   public String fullReverse(String sentence){
       //make a char array out of the sentence
       char[] charArray = sentence.toCharArray();
       //get length
       int arrayLength = charArray.length;
       //find the middle of the array
       int halfLength = arrayLength/2;
       for (int i = 0; i<halfLength; i++){
           //get the character at i so its not lost during swap
           char temp = charArray[i];
           //set char on the left half with its reflection
           charArray[i] = charArray[arrayLength-1-i];
           //set char on the right side with its reflection
           charArray[arrayLength-1-i] = temp;
       }
       return new String(charArray);
   }
   
   

}