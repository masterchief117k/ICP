/*Write a program in java to accept an Array A and swap two consecutive 
elements in array. 
Input: A[]={1,2,3.4,5,6} 
Output: A[]={2,1,4,3,6,5}
 */
package ICPImportatquestion;
import java.util.Arrays;
public class q_8 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        for(int i=0 ; i < a.length-1; i+=2) {
           int  temp =a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
           
        }
        System.out.println("new array is "+Arrays.toString(a));
    }
}
