package Assingment_4;
/*Write a java program that gets three integer numbers from the user. Count from the first number 
to the second number increments by the third number. Use for loop to do it. Also, display the 
sum of numbers displayed between the first number and second number.
Sample run: 
Enter first number: 4 
Enter second number: 13 
Enter third number: 3 
4 7 10 13 
The sum of number displayed is 34
 */
import java.util.*;
public class A4_q1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b,c,sum=0;
    System.out.print("Enter first number: ");
    a=sc.nextInt();
    System.out.print("\nEnter second number: ");
    b=sc.nextInt();
    System.out.println("\nEnter third number: ");
    c=sc.nextInt();
    for(int i=a;i<=b;i+=c) {
       System.out.print(i+" ");
        sum+=i;        
    }
    System.out.println("\n"+"\nThe sum of number displayed is "+sum);
 }
}
