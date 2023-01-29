/*Question-9: 
Write a program that will read the value of n from the user and calculate sum of the following 
series: 
 1/1^2+1/2^2+1/3^2+........+1/n^2
 */
package Assingment_5;
import java.util.*;
public class q9_a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0;
    
        for (int i = 1; i <= n; i++) {
          sum += 1.0 / (i * i);
        }
    
        System.out.println("The sum of the series is: " + sum);
      }
}
