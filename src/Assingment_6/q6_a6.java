/*Question-6: 
Write a method that finds the number of occurrences of a specified character in a string using 
the following header: 
public static int count(String str, char a)  
For example, count ("Vivek", 'v') returns 2.  
Write a java program that prompts the user to enter a string followed by a character and 
displays the number of occurrences of the character in the string
 */
package  Assingment_6 ;
import java.util.*;
public class q6_a6 {
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
    
            System.out.print("Enter a character: ");
            char a = scanner.next().charAt(0);
    
            int count = count(str, a);
            System.out.println("The character '" + a + "' appears in the string '" + str + "' " + count + " times.");
        }
    
}
