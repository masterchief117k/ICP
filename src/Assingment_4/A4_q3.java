/*Question-3: 
Write a java program that takes an integer N from user, uses 
Math.  Random  ()  to  print  N  random  integer  numbers  between  1  to  N,  and  then  prints  their 
average value. Use do while loop. 
Sample run: 
Enter a number: 6 
Random numbers generated are: 6 4 5 2 2 5 
Average of 6 random numbers are 4 */
package Assingment_4;
import java.lang.*;
import java.util.*;
public class A4_q3 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n,r,count=0;
    System.out.println("Enter the number ");
    n=sc.nextInt();
    int sum=0,div=0;
   System.out.print("The randomly generated number are ");
    do{
       r= 1+((int)((Math.random())*((n-1)+1)));
       count=count+r;
       System.out.print( r+" ");
       sum++;
    
    }
    while(sum<=n-1);
   int avrage=count/n;
    System.out.println("\nAvrage of "+n+" numbers are "+avrage);
        

    
     
  }
}
