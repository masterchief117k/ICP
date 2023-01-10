/*Question-2: 
An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your 
program  to  determine  whether  or  not  the  number  is  divisible  by  9.  Test  it  on  the  following 
numbers: Use while loop. 
 
n = 123456 
n = 154368 
n = 621594 
 
Hint: Use the % operator to get each digit; then use / operator to remove the digit. 
 
Sample run 1: 
Enter a number: 154368 
The number 154368 is divisible by 9. 
Sample run 2: 
Enter a number: 123456 
The number 123456 is not divisible by 9. 
 
 */

package Assingment_4;
import java.util.*;
public class A4_q2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter your number :");
    n = sc.nextInt();
    int sum= 0;
    while(n>0){
        int a=n % 10;
        sum+=a;
        n/=10;
    } 
    if(sum%9==0){
        System.out.println(" The number  is divisible by 9");
    }else{
        System.out.println(" The number is not divisible by 9 ");
    }
    }
}
