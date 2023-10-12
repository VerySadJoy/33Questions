import  java.util.Scanner;

public class Question19{

   public static void main (String [] args){
   
   //varibale declaration of independence
      int num1, num2, dem1, dem2, numf, demf;
      
      
      Scanner inData = new Scanner(System.in);
     
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
      numf = num1*num2;
      demf = dem1*dem2;
      
    //output
    
       System.out.println("The final fraction is " + numf + "/" + demf + ".");
   
   
   
   
   
   
   }
}