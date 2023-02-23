/*Question-9: 
Some websites impose certain rules for passwords.  
Write a method that checks whether a string is a valid password. Suppose the password rules 
are as follows: 
 A password must have at least eight characters. 
 A password consists of only letters and digits. 
 A password must contain at least two digits.  
Write a program that prompts the user to enter a password and displays Valid Password if the 
rules are followed or Invalid Password otherwise.
 */
package Assingment_6;
import java.util.Scanner;

public class q9_a6 {
    public static boolean isValidPassword(String password) {
        // Check the length of the password
        if (password.length() < 8) {
            return false;
        }
    
        // Check that the password consists only of letters and digits
        if (!password.matches("[a-zA-Z0-9]+")) {
            return false;
        }
    
        // Check that the password contains at least two digits
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
                if (digitCount >= 2) {
                    break;
                }
            }
        }
        return digitCount >= 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
