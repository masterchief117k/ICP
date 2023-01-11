/*Question-8: 
Write a program that generates a random integer number between 1 to 10 and asks the user to 
guess what the number is. If the user's guess is higher than the random number, the program 
should display "Too high, try again." If the user's guess is lower than the random number, the 
program should display "Too low, try again." The program should use a loop that repeats until 
the user correctly guesses the random number and display good guess.  */
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

