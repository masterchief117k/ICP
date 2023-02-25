/*
   Write a program to input a number and print whether the number is a 
special number or not. (A number is. said to be a special number, if the 
sum of the factorial of the digits of the number is same as the original 
number). Example: 145 is a special number, because 1!+4!+5! = 1 + 24 
+ 120 = 145 (Where! stands for factorial of the number and the factorial 
value of a number is the product of all integers from 1 to that number, 
example 5! = 1*2*3*4*5 = 120)
 */
package ICPImportatquestion;

import java.util.Scanner;

public class q_5 {
    public static int factorial(int num) {
        /*
        Returns the factorial of a number.
        */
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int sumOfFactorials = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }

        if (number == sumOfFactorials) {
            System.out.println(number + " is a special number");
        } else {
            System.out.println(number + " is not a special number");
        }
    }
}

