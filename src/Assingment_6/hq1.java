/*Question-1: 
Write a program to find the first non-repeated character in a given String, for example, if the 
given String is "Java" then the first non-repeated character is "J".
 */
package Assingment_6;

public class hq1 {
    public static Character findFirstNonRepeatedChar(String str) {
        // Initialize an array to keep track of the count of each character in the string
        int[] charCount = new int[256];
    
        // Iterate through the string and increment the count of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }
    
        // Iterate through the string and return the first character that has a count of 1
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount[c] == 1) {
                return c;
            }
        }
    
        // If no non-repeated character is found, return null
        return null;
    }
    public static void main(String[] args){
        String str = "Java";
Character firstNonRepeatedChar = findFirstNonRepeatedChar(str);
System.out.println(firstNonRepeatedChar);
    }
    
}
