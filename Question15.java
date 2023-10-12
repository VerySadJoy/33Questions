import java.util.Scanner;

public class Question15{

   public static void main(String [] args){
   
   
   //input
      double num1, num2;
   
      Scanner inData = new Scanner(System.in);
   
      System.out.println("Enter your first number!");
      num1 = inData.nextDouble();
   
      System.out.println("Enter your second number!");
      num2 = inData.nextDouble();
   
   //output
   
      System.out.println(num1 + " divided by " + num2 + " is " + Math.round(num1/num2) + " remainder " + num1%num2 + "!");
   
   }
}