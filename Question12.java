import java.util.Scanner;

public class Question12{

   public static void main (String [] args){
   
   
   //input
   
      double leng, widt, heig, volu;
   
      Scanner inData = new Scanner(System.in);
   
      System.out.println("Enter the length.");
      leng = inData.nextDouble();
      
      System.out.println("Enter the width.");
      widt = inData.nextDouble();
      
      System.out.println("Enter the height.");
      heig = inData.nextDouble();
      
      volu = leng*widt*heig;
      
    //output
      System.out.println("The volume of the box is " + volu + "cm3.");
   }
}