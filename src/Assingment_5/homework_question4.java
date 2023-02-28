/*Question-4
Write a java program to evaluate the function sin(x) as defined by the infinite series expansion. 
cos (x) */
package Assingment_5;
import java.util.*;
public class homework_question4 {
    public static void main(String[] args){
       
        
        // define the value of x (in radians)
        double x = Math.PI / 4;

        // define the number of terms in the series
        int n = 10;

        // initialize variables for the sum and the sign
        double sum = 1.0;
        int sign = -1;

        // calculate the series using a loop
        for (int i = 2; i <= n; i += 2) {
            double term = Math.pow(x, i) / factorial(i);
            sum += sign * term;
            sign *= -1;
        }

        // print the result
        System.out.println("cos(" + x + ") = " + sum);
    }

    // helper method to calculate the factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


