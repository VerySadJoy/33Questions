import java.util.Scanner;

public class Question20{

   public static void main (String [] args){
   
   //variable declartion
      int num1, num2, dem1, dem2, numf, demf;
      
      Scanner inData= new Scanner(System.in);
      
   //input
      System.out.println("Enter the first numerator!");
      num1 = inData.nextInt();
      System.out.println("Enter the first denominator!");
      dem1 = inData.nextInt();
      System.out.println("Enter the second numerator!");
      num2 = inData.nextInt();
      System.out.println("Enter the second denominator!");
      dem2 = inData.nextInt();   
   //calculations
      
      numf = num1*dem2 + num2*dem1;
      demf = dem1*dem2;
      
   //output
    
      System.out.println("The final fraction is " + numf + "/" + demf + ".");
   
   
   
   
   }
}