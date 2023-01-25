/*Question-1: 
Amicable  numbers  are  pair  of  numbers  each  of  whose  divisors  are  added  to  give  the  other 
number.  
Example: The smallest pair of amicable numbers is (220, 284).  
They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 
110, of which the sum is 284; and the proper divisors of 284 are 1, 2, 4, 71 and 142, of which 
the sum is 220.  
Note: 1 is included as a divisor but the numbers are not included as their own divisors.  
Write a java program that tests whether a given pair of numbers is amicable numbers or not. 
Sample run 1: 
Enter first number: 220 
Enter second number: 284 
220 and 284 are amicable numbers. 
Sample run 2: 
Enter first number: 220 
Enter second number: 230 
220 and 230 are not amicable numbers.*/ 
 

package Assingment_5;
import java.util.*;
public class q1_a5 {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      int a,b,count=0,count2=0;
      System.out.println("Enter the first number");
      a=sc.nextInt();
      System.out.println("Enter the second number");
      b=sc.nextInt();
      for(int i =1;i<a;i++)
      {
       if(a%i==0)
        {
            count+=i;
         }
      }
      for(int i = 1; i<b; i++)
      {
       if(b%i==0)
       {
        count2+=i;
      }
    }
      if(count == b && count2==a)
      {
         System.out.println("The numbers are amicable numbers");
      }
      else
      {
        System.out.println("The numbers are not amicable numbers");
      }

    }
}
