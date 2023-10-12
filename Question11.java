import java.util.Scanner;

class Question11
{
   public static void main (String [] args)
   {
   //input
      double cel, fah;
   
      Scanner inData = new Scanner(System.in);
   
      System.out.println("Enter the temperature in Celsius.");
      cel = inData.nextDouble();
   
   //calculation
      fah = cel*1.8 + 32;
   
   //output
      System.out.println("The temperature inf Fahrenheit is " + fah + "°F!");
   
   
   }
}