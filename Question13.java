import java.util.Scanner;

public class Question13{

   public static void main (String [] args){
      
      //input
      String name;
      int age, year;
      
      Scanner inData1 = new Scanner(System.in);
      Scanner inData2 = new Scanner(System.in);
      
      System.out.println("State your name!");
      name = inData1.nextLine();
      
      System.out.println("What year were you born???????");
      year = inData2.nextInt();
      
      age = 2050 - year; 
      
      //output
      System.out.println(name + ", you will be " + age + "years old in the year 2050.");
      
      
   }
    
}
