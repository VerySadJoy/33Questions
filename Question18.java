import java.util.Scanner;

public class Question18{

   public static void main (String [] args){
   //input
      double prince, interesting, num, ape;
      
      Scanner inData = new Scanner(System.in);
      
      
      
      System.out.println("Enter the principal amount originally deposited!");
      prince = inData.nextDouble();
      
      System.out.println("Enter the interest rate by compounding period!");
      interesting = inData.nextDouble();
      
      System.out.println("Enter the number of compounding period!");
      num = inData.nextDouble();
      
      ape = Math.round(prince*(Math.pow((1 + interesting), num))*100);
   //output
      
      
      System.out.println("The amount will be  $" + (ape/100) + ".");
      
   
   
   
   }
}