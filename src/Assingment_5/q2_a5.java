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
     int a,b=0;
     System.out.println("Enter the number:");
     a=sc.nextInt();
    for (int i = 2; i<a; i++){
        if(a%i==0){    
        }else{
            while(a!=0){
                b=b*10+a%10;
                a/=10;
            }   
        
          
            break;
        }
    } 
    
    for(int i=2;i<b;i++){
        if(b%i!=0){
            System.out.println("The number is twiste prime");
            break;
    }else{
        System.out.println("The number is not twisted prime");
        break;
    }
    }
}
 }
