import java.util.Scanner;

public class Question16{

   public static void main (String [] args){
   
   //input
      double num, sum;
   
      Scanner inData = new Scanner(System.in);
   
      System.out.println("Enter a very long decimal number!");
      num = inData.nextDouble();
   
      sum = Math.round(num*10);
   //output
      System.out.println("If you round " + num + " to one decimal place, it is " + (sum/10) + ".");
   
   
   }
}