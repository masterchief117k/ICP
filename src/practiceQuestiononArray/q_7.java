/*Question-7: 
Write a method to find the second largest element present in the Array. The method header is 
given below. 
public static int sec_max(int[] array) 
Write a java program that prompts the user to enter 5 numbers, invokes this method to return 
the maximum value, and displays the maximum value. Here is a sample run of the program: 
Sample run: 
Enter ten numbers: 9 5 7 2 3 
The second maximum number is: 7 
 */
package practiceQuestiononArray;
import java.util.*;
public class q_7 {
    public static int sec_max(int[] array){
        int x=array.length;
        int temp;
        for (int i=0; i<x; i++){
           for (int j=i+1; j<i; j++){
              if(array[i]>array[j]){
                 temp=array[i];
                 array[i]=array[j];
                 array[j]=temp;
              }
           }
        }
        return(array[x-2]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array");
        int n = sc.nextInt();
        int [] a= new int[n];
        System.out.println("enter the elements");
        for(int i=0; i<n; i++){
          a[i] =sc.nextInt(); 
        }
        System.out.println("The array you have entered is "+Arrays.toString(a));
    System.out.println("The second largest number is " +sec_max(a));
    }
    
}
