import java.text.DecimalFormat;


public class Question30{
   public static void main (String [] args){
      DecimalFormat money = new DecimalFormat("$0.00");
      double amount = Math.random();
      System.out.println("You will get " + money.format((amount*(2000000 + 2000000 +1) - 2000000)) + ".");
   
   
   }
}