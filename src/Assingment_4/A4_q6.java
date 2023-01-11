/*Question-6: 
Write a java program to enter two numbers through the keyboard. Write a program to find the 
value of one number raised to the power of another. (Do not use Java built-in method). 
 
Sample run: 
Enter the base: 5 
Enter the power: 4 
5 to the power 4 is: 625 */
package Assingment_4;
import java.util.*;
public class A4_q6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,r,count=0;
    System.out.println("Enter the number ");
    n=sc.nextInt();
    System.out.println("Enter the power");
    r=sc.nextInt();
    for (int i = 0; i <=r; i++){   
       count=n*n;
    }System.out.println(count);
 }
}