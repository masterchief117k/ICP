/*
Question-5
Write a method to find the largest element present in the Array. The method header is given 
below. 
public static int max(int[] array) 
Write a java program that prompts the user to enter 5 numbers, invokes this method to return 
the maximum value, and displays the maximum value. Here is a sample run of the program: 
Sample run: 
Enter five numbers: 9 5 7 2 3 
The maximum number is: 9  */
package practiceQuestiononArray;
import java.util.*;
import java.util.Arrays;
public class q_5 {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of element you want  to enter");
       int n=sc.nextInt();
       int [] arr=new int [n];
       System.out.println("Enter your elements ");
       for (int i=0; i<n; i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("The array is "+Arrays.toString(arr));
       System.out.println("the max value in the array is "+max(arr));
    }
    public static int max(int arr []){
        int max=arr[0];
        int len=arr.length;
        for (int i = 0; i<len;i++){
            if(max<arr[i]){
               max=arr[i];
            }
        }
        return max;
    }
}
