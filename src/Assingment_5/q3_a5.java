/*WAP to enter the first number and second number. Display the prime numbers between the 
first and second number. 
 
Sample run: 
Enter the first number: 4 
Enter the second number: 15 
Prime numbers between 4 and 15 are: 5 7 11 13 */
package Assingment_5;
import java.util.*;


public class q3_a5 {
    public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    int a,b,count=0;
    System.out.println("Enter the first number");
    a=sc.nextInt();
    System.out.println("Enter the second number");
    b=sc.nextInt();
    System.out.print("The prime number between "+a+" and "+b+" are  ");
  
        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    
    }
}