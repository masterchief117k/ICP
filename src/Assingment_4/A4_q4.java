/*Write  a  program  that  finds  greatest  common  divisor  (GCD)  of  two  numbers  using  Euclid's 
algorithm, which is an iterative computation based on the following observation: if y divides 
x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y. 
 
Sample run: 
Enter the first number: 56 
Enter the second number: 98 
GCD of 56 and 98 is 14. */
package Assingment_4;
import java.util.*;
public class A4_q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int x = input.nextInt();
    System.out.print("Enter the second number: ");
    int y = input.nextInt();

    while (y != 0) {
        int temp = y;
        y = x % y;
        x = temp;
    }

    System.out.println("GCD: " + x);
}
}
ds