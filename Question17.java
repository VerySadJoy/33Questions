import java.util.Scanner;

public class Question17{

   public static void main (String [] args){
   //input
      double adj, opp, hyp;
      Scanner inData = new Scanner (System.in);
      
      
      System.out.println("Enter the opposite length of the triangle!");
      opp = inData.nextDouble();
   
      System.out.println("Enter the adjacent length of the triangle!");
      adj = inData.nextDouble();
   
      hyp = Math.round((Math.sqrt(Math.pow(opp, 2) + Math.pow(adj, 2)))*100);
   //output
      
      System.out.println("The hypotenuse of the triangle is " + (hyp/100) + "cm.");
   
   
   
   }
}