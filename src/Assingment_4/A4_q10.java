/*Question-10: 
Write a java program to print largest power of three less than or equal to N. 
Sample run: 
Enter a number: 100 
The largest power of 3 less than or equal to 100 is 81 
 
  */
package Assingment_4;
import java.util.*;
public class A4_q10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int largestPower = 1;
            while (largestPower <= n) {
                largestPower *= 3;
            }
            largestPower /= 3;
            System.out.println("The largest power of 3 less than or equal to " + n + " is " + largestPower);
        }
}