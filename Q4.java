/**********************************************************
File: Q4.java
Purpose: To find the slope
Author: Jin Ha Joo
Date: Feb 14, 2017
Based on: ICS3U Java Assignment 1, Question 4
**********************************************************/
import java.util.Scanner;
public class Q4{
   public static void main (String [] args){
   //var dec
      double x1, x2, x3, x4, x5, y1, y2, y3, y4, y5, xav, yav, slop, yint;
      double l1, l2, l3, l4, l5, w1, w2, w3, w4, w5, num, dem;
      Scanner inData = new Scanner(System.in);
      
   //input
      System.out.println("Enter your first x-value!");
      x1 = inData.nextDouble();
      System.out.println("Enter your first y-value!");
      y1 = inData.nextDouble();
      System.out.println("Enter your second x-value!");
      x2 = inData.nextDouble();
      System.out.println("Enter your second y-value!");
      y2 = inData.nextDouble();
      System.out.println("Enter your third x-value!");
      x3 = inData.nextDouble();
      System.out.println("Enter your third y-value!");
      y3 = inData.nextDouble();
      System.out.println("Enter your fourth x-value!");
      x4 = inData.nextDouble();
      System.out.println("Enter your fourth y-value!");
      y4 = inData.nextDouble();
      System.out.println("Enter your fifth x-value!");
      x5 = inData.nextDouble();
      System.out.println("Enter your fifth y-value!");
      y5 = inData.nextDouble();
   //calculations
      xav = ((x1+x2+x3+x4+x5)/5);
      yav = ((y1+y2+y3+y4+y5)/5);
      l1 = (x1-xav)*(y1-yav);
      l2 = (x2-xav)*(y2-yav);
      l3 = (x3-xav)*(y3-yav);
      l4 = (x4-xav)*(y4-yav);
      l5 = (x5-xav)*(y5-yav);
      num = l1 + l2 + l3 + l4 + l5;
      w1 = Math.pow((x1 - xav), 2);
      w2 = Math.pow((x2 - xav), 2);
      w3 = Math.pow((x3 - xav), 2);
      w4 = Math.pow((x4 - xav), 2);
      w5 = Math.pow((x5 - xav), 2);
      dem = w1 + w2 + w3 + w4+ w5;
      slop = num/dem;
      yint = yav - slop*xav;
   //output
      System.out.println("y = " + slop + "x" + " + " + yint);
   }
}