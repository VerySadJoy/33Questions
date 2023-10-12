import java.util.Scanner;

public class Question32{
   public static void main (String [] args){
     
     //var dec
      int inp, tot;
      Scanner inData = new Scanner(System.in);
      
      //input1
         System.out.println("Enter your first number!");
         inp = inData.nextInt();
         tot = inp;
      //output1
         System.out.println("The total is " + tot + ".");
      //input2
         System.out.println("\nEnter your second number!");
         inp = inData.nextInt();
         tot = inp+tot;
      //output2
         System.out.println("The total is " + tot + ".");
      //input1
         System.out.println("Enter your third number!");
         inp = inData.nextInt();
         tot = inp+tot;
      //output3
         System.out.println("The total is " + tot + ".");
   }
}