import java.util.Scanner;

public class Question14{

   public static void main (String [] args){
   
   
   //input 
      double rad;
   
      Scanner inData = new Scanner(System.in);
   
   
      System.out.println("Enter the radius of the circle!!!!");
      rad = inData.nextDouble();
   
   
   
   //output
   
      System.out.println("The area of the circle is " + Math.pow(rad, 2)*Math.PI + "cm2.");
   
   
   }
}