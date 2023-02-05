/*Question-4
Write a java program to evaluate the function sin(x) as defined by the infinite series expansion. 
cos (x) */
package Assingment_5;
import java.util.*;
public class homework_question4 {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of theta");

        double x = sc.nextDouble();
        double result = 1.0;
        double term = 1.0;
        double factorial = 1.0;
        int i = 1;
  
        while (Math.abs(term) > 1e-6) {
           result += term;
           i += 2;
           factorial *= (i-1) * i;
           term *= -(x * x) / factorial;
        }
  
        System.out.println(result-1);
}
}

