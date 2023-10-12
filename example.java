
import java.util.Scanner;
import java.util.Random;
public class example{
   public static void main(String[] args) {
      Random rand = new Random();
      int compNum = rand.nextInt(100);
      int count = 0;
      Scanner keyboard = new Scanner(System.in);
      int userGuess;  
      boolean win = false;        
      while (win == false ){
         System.out.print("Enter a guess between 1 and 100: ");
         userGuess = keyboard.nextInt();
         count++;
         if(userGuess < 1 || userGuess > 100){
            System.out.println("Your guess is out of range.  Pick a number between 1 and 100.");
            System.out.println();
         }
         else if (userGuess == compNum){
            win = true;
            System.out.println("Congratulations!  Your answer was correct! ");
         }       
         else if (userGuess < compNum){
            System.out.println("Your guess was too low.  Try again. ");
            System.out.println();
         }
         else if (userGuess > compNum){
            System.out.println("Your guess was too high.  Try again. ");
            System.out.println();
         }
      
      }
      if(count == 1){
         System.out.println();
         System.out.println("I had chosen " + compNum + " as the target number.");
         System.out.println("You guessed it in " + count + " tries.");
         System.out.println("That was lucky!");
      }
      else if (count > 1 && count <= 4){
         System.out.println();
         System.out.println("I had chosen " + compNum + " as the target number.");
         System.out.println("You guessed it in " + count + " tries.");
         System.out.println("That was amazing!");
      }
      else if (count > 4 && count <= 6){
         System.out.println();
         System.out.println("I had chosen " + compNum + " as the target number.");
         System.out.println("You guessed it in " + count + " tries.");
         System.out.println("That was good.");
      }
      else if (count > 6 && count <= 7){
         System.out.println();
         System.out.println("I had chosen " + compNum + " as the target number.");
         System.out.println("You guessed it in " + count + " tries.");
         System.out.println("That was OK.");
      }               
      else if (count > 7 && count <= 9){
         System.out.println();
         System.out.println("I had chosen " + compNum + " as the target number.");
         System.out.println("You guessed it in " + count + " tries.");
         System.out.println("That was not very good.");
      }
      else if (count > 10){
         System.out.println();
         System.out.println("I had chosen " + compNum + " as the target number.");
         System.out.println("You guessed it in " + count + " tries.");
         System.out.println("This just isn't your game.");
      
      }
   }
}