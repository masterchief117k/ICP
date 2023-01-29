/*Question-8:
WAP to enter the value of n and display find the following sum of the series: 
 1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n) */
package Assingment_5;
import java.util.*;
public class q8_a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
            sum += j;
          }
        }
        System.out.println("The sum of the series is: " + sum);
      }
}
