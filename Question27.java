import java.util.Scanner;

public class Question27
{
   public static void main (String [] args){
   
   //input
      Scanner inData = new Scanner(System.in);
      String line;
   
   
      System.out.println("Enter a word!");
      line = inData.nextLine();
      String up = line.toUpperCase();
      String low = line.toLowerCase();
      
   //output
      System.out.println(up);
      System.out.println(low);
   
   
   }
}