/*Question-8: 
Write a java method to check a string is palindrome or not. 
 */
package Assingment_6;

import java.util.*;

public class q8_a6 {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();
        
        // Use two pointers to compare characters from the start and end of the string
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, the string is not a palindrome
            }
            left++;
            right--;
        }
        return true; // If all characters match, the string is a palindrome
    }
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        String a ;
        System.out.println("enter the string you want to check wether it is a palendrome or not ");
        a=sc.nextLine();
        System.out.println(isPalindrome(a));
    }
    //saem can be done by the help of for loop making it more convinitent to use 
    /*as shown below in the comment 
     * public static boolean count(String str ){
        int left = str.length()-1;
        int right = 0;
        char a=' ';
        char b=' ';
        for (int i=left; i>=0; i--){
        a = str.charAt(i);

        }
        for (int i=0; i<str.length(); i++){
         b=str.charAt(i);
        }
        if(a==b){
            return true;    
        }
        else {
            return false;
        }

    }
   public static void main(String[] args) {
      System.out.println("The string is a palendrome :"+count("101"));
   }
     */
}
