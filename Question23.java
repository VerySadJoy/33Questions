import java.util.Scanner;

public class Question23{

   public static void main (String [] args){
   //varibale declaration of independence
      String name;
      int num;
   
      Scanner inData = new Scanner(System.in);
   
   //input
   
      System.out.println("Enter your name!");
      name = inData.nextLine();
   //calculation
      num = name.length();
   
   //output
      System.out.println("Your name is " + num + " letters long!");
   
   
   }
}