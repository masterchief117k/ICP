/*Write a program to accept a number and check and display whether it is 
a spy number or not. (A number is spy if the sum of its digits equals the 
product of its digits.) Example: consider the number 1124, Sum of the 
digits = l + l+ 2 + 4 = 8 Product of the digits = 1×1x2x4 = 8
 */
//Provided by Vikas Kumar
package ICPImportatquestion;
import java.util.*;

public class q_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
        int num = in.nextInt();
        
        int digit, sum = 0;
        int n = num;
        int prod = 1;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            prod *= digit;
            num /= 10;
        }
        if (sum == prod)
            System.out.println(n + " is Spy Number");
        else
            System.out.println(n + " is not Spy Number");
	}
}

