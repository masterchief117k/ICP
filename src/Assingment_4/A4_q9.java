/*Question-8: 
Question-9: 
Write a java program to take an integer input from the user and print the input by removing all 
zeros.  
 
Example: Input = 10200 then Output = 12. 
 
Sample run: 
Enter an integer number: 10203040 
After removing 0 from number 10203040, the new number is 1234
  */
package Assingment_4;
import java.util.*;
public class A4_q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        str = str.replace("0", "");
        int newNum = Integer.parseInt(str);
        System.out.println("After removing 0 from number " + num + ", the new number is " + newNum);
    }
}

