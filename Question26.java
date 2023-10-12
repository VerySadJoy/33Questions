import java.util.Scanner;
public class Question26{
   public static void main (String [] args)
   {
      //input
      Scanner inData= new Scanner(System.in);
      String fn, ln;
      System.out.println("Enter your first name!");
      fn = inData.nextLine();
      
      System.out.println("Enter your last name!");
      ln = inData.nextLine();
      
      //output
      System.out.println("Initial: " + fn.substring(0, 1) + ln.substring(0, 1));
      
   }
}