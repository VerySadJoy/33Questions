/**********************************************************
File: Q1.java 
Purpose: Input spending categories and amounts, then 	output a spending percentage breakdown.
Author: Jin Ha Joo
Date: Feb 13, 2017
Based on: ICS3U Java Assignment 1, Question 1
**********************************************************/
import java.util.Scanner;
public class Q1{
   public static void main (String [] args){
   //var dec
      Scanner inData1 = new Scanner(System.in);
      Scanner inData2 = new Scanner(System.in);
      double cat1, cat2, cat3, tot, perc1, perc2, perc3;
      String ca1, ca2, ca3;
   //input
      System.out.print("Enter the first Category: ");
      ca1 = inData1.nextLine();
      System.out.print("Enter the amount spent on " + ca1 + ": $");
      cat1 = inData2.nextDouble();
      System.out.print("Enter the second Category: ");
      ca2 = inData1.nextLine();
      System.out.print("Enter the amount spent on " + ca2 + ": $");
      cat2 = inData2.nextDouble();
      System.out.print("Enter the third Category: ");
      ca3 = inData1.nextLine();
      System.out.print("Enter the amount spent on " + ca3 + ": $");
      cat3 = inData2.nextDouble();
   //cal
      ca1 = ca1.toUpperCase();
      ca2 = ca2.toUpperCase();
      ca3 = ca3.toUpperCase();
      tot = cat1 + cat2 + cat3;
      perc1 = (cat1/tot)*100;
      perc2 = (cat2/tot)*100;
      perc3 = (cat3/tot)*100;
   //ouput
      System.out.println("Your spending habits breakdown is \n" + ca1 + ": " + Math.round(perc1) + "%");
      System.out.println(ca2 + ": " + Math.round(perc2) + "%");
      System.out.println(ca3 + ": " + Math.round(perc3) + "%");
   }
}