package edu.cnm.deepdive;


import java.util.Scanner;

public class GaussianSum {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int upperLimit;

    upperLimit = -1;
    long sum;

    while (upperLimit < 1 || upperLimit > 100000000) {
      System.out.println("Put in a number 1-100000000:");
      while (!input.hasNextInt()) {
        System.out.println(input.next() + " is invalid please put an integer, dummy!");
      }
      upperLimit = input.nextInt();
      if (upperLimit < 1 || upperLimit > 10000000) {
        System.out.println("dummy");
      }
    }
    sum = (long) upperLimit * (upperLimit + 1) / 2;
    System.out.print("The sum of 1 through " + upperLimit + " = ");
    System.out.println(sum);
  }
}
