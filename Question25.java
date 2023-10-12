import java.util.Scanner;

public class Question25{

   public static void main (String [] args){
   
   //input
      Scanner inData = new Scanner(System.in);
      int num1;
      System.out.println("Enter the starting index value!");
      num1 = inData.nextInt();
   
   //output
      String line = new String("The quick brown fox jumped over the lazy dog.");
      System.out.println(line.substring(num1));
      System.out.println();
   
   
   
   }
}