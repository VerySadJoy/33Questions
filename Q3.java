/**********************************************************
File: Q3.java 
Purpose: Finding the minimum number of coin required
Author: Jin Ha Joo
Date: Feb 14, 2017
Based on: ICS3U Java Assignment 1, Question 3
**********************************************************/
import java.util.Scanner;
public class Q3{
   public static void main (String [] args){
   //var dec
      int tot, too, loo, qua, dim, nic, pen;
      Scanner inData= new Scanner(System.in);
   //input
      System.out.print("Enter the change in cents: ");
      tot = inData.nextInt();
   //calculation
      too = tot/200;
      tot = tot%200;
      loo = tot/100;
      tot = tot%100;
      qua = tot/25;
      tot = tot%25;
      dim = tot/10;
      tot = tot%10;
      nic = tot/5;
      tot = tot%5;
      pen = tot;
   //output
      System.out.println("The minimum number of coins is: ");
      System.out.println("Toonies: " + too);
      System.out.println("Loonies: " + loo);
      System.out.println("Quarters: " + qua);
      System.out.println("Dimes: " + dim);
      System.out.println("Nickels: " + nic);
      System.out.println("Pennies: " + pen);
   }
}