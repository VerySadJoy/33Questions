/**********************************************************
File: Q2.java 
Purpose: Finding the total amount you need to pay
Author: Jin Ha Joo
Date: Feb 13, 2017
Based on: ICS3U Java Assignment 1, Question 2
**********************************************************/
import java.util.Scanner;
public class Q2{
   public static void main (String [] args){
   //var dec
      int bu, fr, dr, bur, fri, dri;
      double tax, totb, tot;
      Scanner inData = new Scanner(System.in);
   //input
      System.out.println("Guys, did you know a fast food restaurant charges $1.69 for burgers, $1.09 for fries, and $0.99 for drinks?");
      System.out.print("\nEnter the number of burgers: ");
      bu = inData.nextInt();
      System.out.print("Enter the number of fries: ");
      fr = inData.nextInt();
      System.out.print("Enter the number of drinks: ");
      dr = inData.nextInt();
   //output
      bur = bu*169;
      fri = fr*109;
      dri = dr*99;
      totb = bur + fri + dri;
      System.out.println("Total before tax: $" + totb/100);
      tax = Math.round(totb*0.13);
      System.out.println("Tax: $" + tax/100);
      tot = totb/100 + tax/100;
      System.out.println ("Final Total: $" + tot);
   }
}