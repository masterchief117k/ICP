/*Given a=0, b=1 and c=1 are the first three numbers of some sequence. All other numbers in 
the sequence are generated from the sum of their three most recent predecessors. Write a java 
program to generate this sequence up to n terms where n > 3. */
package Assingment_5;
import java.util.*;
public class q10_a5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
    
        int a = 0, b = 1, c = 1;
        int next;
    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
        for (int i = 3; i < n; i++) {
          next = a + b + c;
          System.out.println(next);
          a = b;
          b = c;
          c = next;
        }
      }
}
