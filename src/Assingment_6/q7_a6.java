/*Question-7: 
Write java method called count accepts a string as input and returns the number of vowels in 
it. The method header is given below. 
public static int count(String str)  
For example, count ("Welcome") returns 2
 */
package Assingment_6;
import java.util.*;

public class q7_a6
 {
    public static int count(String str, char a){
        int x=str.indexOf(a);
        return (x);
    }
    public static void main(String[]args){
     Scanner sc =new Scanner (System.in);
     System.out.println("Enter word ");
     String str = sc.nextLine();
     System.out.println("Enter the char u are searching for ");
     char a=sc.next().charAt(0);
     System.out.println(count(str,a));
    }
         
}
