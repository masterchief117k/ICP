/*Question-5: 
Write a Java program to check if a number is perfect number or not.  
 
(Hints: A number N is called  perfect number, if the sum of factors  except N as a factor is 
equals to the number N.  
 
Example:  
N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.) 
 
Sample run1: 
Enter a number: 496 
496 is a perfect number. 
Sample run2: 
Enter a number: 490 
490 is not a perfect number. 
 
 */
package Assingment_4;
import java.util.*;
public class A4_q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        System.out.print("0");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.print(" + "+sum);
            }
        }
        if (sum == num) {
            System.out.println("\n"+num + " is a perfect number.");
        } else {
            System.out.println("\n"+num + " is not a perfect number.");
        }
    }
}
