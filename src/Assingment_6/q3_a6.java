/* Question-3: 
Write the methods with the following headers  
// Return the reversal of an integer. Example: reverse (456), returns 654 
 
public static int reverse(int number)  
// Return true if number is a palindrome 
 
public static boolean isPalindrome(int number)  
 
Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is 
the same as itself. Write a java program that prompts the user to enter an integer and reports 
whether the integer is a palindrome
*/
package Assingment_6;
import java.util.*;
public class q3_a6 {
    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        return reverseNumber;
    }

    public static boolean isPalindrome(int number) {
        int reverseNumber = reverse(number);
        return reverseNumber == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
