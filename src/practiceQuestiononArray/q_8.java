/*Question-8: 
Write a java program that implements the array reversal algorithm suggested in Note 1. 
 
Note 1: There is a simpler algorithm for array reversal that starts out with two indices, i=0 
and j=n-1. With each iteration i is increased and j is decreased for i<j */
package practiceQuestiononArray;

import java.util.*;

public class q_8 {
    public static void main(String[] args){
        int n, res,i,j=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int array[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for( i=n;i>0 ; i--,j++)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);
    
        }
    }
}
