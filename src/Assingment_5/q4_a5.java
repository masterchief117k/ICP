/*Question-4: 
WAP to calculate and display the factorial of all numbers between m and n (where m < n, m 
> 0, n > 0) 
Sample run: 
Enter the value of m: 2 
Enter the value of n: 5 
Factorial of 2 is: 2 
Factorial of 3 is: 6 
Factorial of 4 is: 24 
Factorial of 5 is: 120 
 

 */
package Assingment_5;
import java.util.*;
public class q4_a5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m,n,count=1;
    System.out.println("Enter the value of m");
    m=sc.nextInt();
    System.out.println("Enter the nalue of n");
    n= sc.nextInt();
    for(int i = m; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
       
        count*=j;  
        
      }
      System.out.println("factorial of "+i+" is "+count);
      count=1;
     
    } 

    }
}
