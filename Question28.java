import java.util.Scanner;
public class Question28{
   public static void main (String [] args)
   {
      //input
      Scanner inData= new Scanner(System.in);
      String fn, ln;
      System.out.println("Enter your first name!");
      fn = inData.nextLine();
      String cfn = fn.toUpperCase();
      
      System.out.println("Enter your last name!");
      ln = inData.nextLine();
      String cln = ln.toUpperCase();
      
      //output
      System.out.println("Initial: " + cfn.substring(0, 1) + cln.substring(0, 1));
      
      
   }
}