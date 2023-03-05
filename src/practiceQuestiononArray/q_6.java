/*Question-6: 
Write a method to find the second smallest element present in the Array. The method header 
is given below. 
public static double sec_small(double[] array) 
Write a java program that prompts the user to enter ten numbers, invokes this method to return 
the second minimum value, and displays the second minimum value. Here is a sample run of the 
program: 
Sample run: 
Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2 
The second minimum number is: 1.9
 */
package practiceQuestiononArray;
 import java.util.*;
import java.util.Arrays;
public class q_6{
    public static void main(String []args){
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements in string ");
      int n = sc.nextInt();
      System.out.println("Enter the elements");
      int [] arr = new int[n];
      
      for (int i = 0; i < n; i++){
       arr [i] =sc.nextInt();   
      }
      System.out.println("The Entered string is "+Arrays.toString(arr));
      System.out.println("the second largest element is "+ small(arr));
     
    }
   
   
    public static int small(int str[]){
        int len = str.length;
        int min ;
        for(int j=0; j<len; j++){
        for (int i = j+1; i < len; i++){
            if (str[j]>str[i]){
                min=str[j];
                str[j]=str[i];
                str[j]=min;
            }
         }
            
        }
        return str[1];
    }
}