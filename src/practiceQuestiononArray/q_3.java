/*Write a java program using an array that reads the integers between 1 and 100 and counts the 
occurrences of each. Assume the input ends with 0.  
Sample run: 
Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0 
2 occurs 2 times 
3 occurs 1 time 
4 occurs 1 time 
5 occurs 2 times 
6 occurs 1 time 
23 occurs 1 time 
43 occurs 1 time 
Note: If a number occurs more than one time, the plural word “times” is used in the output */

package practiceQuestiononArray;
import java.util.*;
public class q_3 {
    public static void main(String[] args) {
        int[] counts = new int[100]; // initialize counts to 0
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int num = input.nextInt();
        while (num != 0) {//you can avoide the while by using for loop or recursion i used while loop cause i realy dont use it much 
            counts[num - 1]++; // increment the count for the number
            num = input.nextInt();
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.printf("%d occurs %d %s%n", i + 1, counts[i], (counts[i] == 1 ? "time" : "times"));//i used turnary operator just to be fancy noo need to use that
            }
        }
    }
}
