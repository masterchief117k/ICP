/*Question-9: 
Write a method to find the element present in the Array using Linear Search. The method 
header is given below. 
public static int Lsearch(int[] array, item) 
The method will return the index of the item if the element is present in the array. Otherwise it will 
return -1. Write a java program that prompts the user to enter 5 numbers, and the item to search, then 
invokes this method to display whether the element is present in the array. Here is a sample run of the 
program: 
Sample run: 
Enter ten numbers: 9 5 7 2 6 
Enter the item to search: 7 
The element is present in the array at position: 3 */
package practiceQuestiononArray;
import java.util.*;
public class q_9 {
    public static int Lsearch(int[] array,int item){
      int len = array.length;
    int x =0;
      for (int i = 0; i < len; i++){
     if (item==array[i]){
      x=i;
     }
    }
     return x; 
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you are searching for");
        int n=sc.nextInt();
        System.out.println("Enter the number of elements you want to enter in the array");
        int x=sc.nextInt();
        
        System.out.println("Enter the elements of your array :");
        int [] arr=new int [x];
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The entered array is :"+Arrays.toString(arr));
        System.out.println("the element you are searching for is in index:"+Lsearch(arr, n));        
    }
    
}
