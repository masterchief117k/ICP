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
    public static int count(String str) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU"; 
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) != -1) { 
                vowelCount++; 
            }
        }
        
        return vowelCount;
    }
    public static void main(String[]args){
     Scanner sc =new Scanner (System.in);
     System.out.println("Enter word ");
     String str = sc.nextLine();
     
     System.out.println(count(str));
    }
         
}
