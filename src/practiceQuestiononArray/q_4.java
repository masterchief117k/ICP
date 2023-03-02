/*
Question-4: 
Write a method to find the smallest element present in the Array. The method header is given 
below. 
 
public static double min(double[] array) 
Write a java program that prompts the user to enter ten numbers, invokes this method to return 
the minimum value, and displays the minimum value. Here is a sample run of the program: 
Sample run: 
 
Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2 
The minimum number is: 1.5
 */
package practiceQuestiononArray;
import java.util.*;
public class q_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }
        int max = max(array);
        System.out.println("The maximum number is: " + max);
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
