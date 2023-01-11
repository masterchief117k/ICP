/*Question-8: 
Write a program that generates a random integer number between 1 to 10 and asks the user to 
guess what the number is. If the user's guess is higher than the random number, the program 
should display "Too high, try again." If the user's guess is lower than the random number, the 
program should display "Too low, try again." The program should use a loop that repeats until 
the user correctly guesses the random number and display good guess
 
 
 

 
 */
package Assingment_4;
import java.util.*;
import java.lang.*;
public class A4_q8 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1; // generates a random number between 1 and 10
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number between 1 to 10: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Good guess!");
                break;
            } else if (guess < number) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }
        }
    }

}
