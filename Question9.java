import java.util.Scanner;

public class Question9
{ 
   public static void main (String [] args)
   {
      //input
      String name;
     
      Scanner inData;
      
      inData = new Scanner(System.in);
      
      System.out.println("come ti chiami?");
      
      name = inData.nextLine();
      
      //output
      System.out.println("il tuo nome è " + name + "!!!!");
   }




}
