/* Question-2: 
WAP  to  check  whether  a  number  is  twisted  prime  or  not.  Twisted  prime  is  a  number  if  the 
number and its reverse both are prime then it is called twisted prime. 
 
Sample run 1: 
Enter a number: 97 
97 is twisted prime. 
 
Sample run 2: 43 
43 is not a twisted prime 
 */
package Assingment_5;
import java.util.*;
public class q2_a5
 {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int a,hold=0 ,b=0;
     System.out.println("Enter the number:");
     a=sc.nextInt();
     for(int i=0; i<2;i++){
        for(int j=2;j<a;j++){
        if(a%j!=0){
            System.out.println("Entered number is prime."+a);
            while(a!=0){
             hold=hold*10+a%10;
             a/=10;
            b=a;
            continue;           
            }
        }else{
            System.out.println("the number is not a twised prime");
        }
        }
        a=hold;
    }

    }
}
