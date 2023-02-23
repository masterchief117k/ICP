/*Question-6: 
Write a method that finds the number of occurrences of a specified character in a string using 
the following header: 
public static int count(String str, char a)  
For example, count ("Welcome", 'e') returns 2.  
Write a java program that prompts the user to enter a string followed by a character and 
displays the number of occurrences of the character in the string
 */
package  Assingment_6 ;
import java.util.*;
public class q6_a6 {
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
