/**********************************************************
File: Q5.java
Purpose: Free program
Author: Jin Ha Joo
Date: Feb 14, 2017
Based on: ICS3U Java Assignment 1, Question 5
**********************************************************/
import java.util.Scanner;
public class Q5{
   public static void main (String [] args){
   //var dec
      double vt, m, g, cd, p, a;
      Scanner inData = new Scanner(System.in);
   //input
      System.out.println("Terminal velocity is the constant speed that a freely falling object eventually reaches when the resistance of the medium through which it is falling prevents further acceleration.");
      System.out.println("\nEnter the mass of the falling object.");
      m = inData.nextDouble();
      System.out.println("Enter the acceleration due to gravity.");
      g = inData.nextDouble();
      System.out.println("Enter the drag coefficient.");
      cd = inData.nextDouble();
      System.out.println("Enter the density of the fluid through which the object is falling.");
      p = inData.nextDouble();
      System.out.println("Enter the projected area of the object.");
      a = inData.nextDouble();
   //calculation
      vt = Math.sqrt((2*m*g)/(p*a*cd));
   //output
      System.out.println("The terminal velocity is " + vt + "m/s.");
   }
}