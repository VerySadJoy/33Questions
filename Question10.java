import java.util.Scanner;

public class Question10
{
public static void main (String [] args)
   {
   //input
   int num1, num2, num3, sum;
   
   Scanner inData = new Scanner(System.in);
   
   System.out.println("Enter your first number.");
   num1 = inData.nextInt();
   
   System.out.println("Enter your second number.");
   num2 = inData.nextInt();
   
   System.out.println("Enter your third number.");
   num3 = inData.nextInt();
   
   sum = num1*num2*num3;
   
   //output
   System.out.println("The product is " + sum + "!");
   
   
   }
}