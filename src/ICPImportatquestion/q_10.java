/*10. Given  a=0,  b=1  and  c=1  are  the  first  three  numbers  of  some 
sequence. All other numbers in the sequence are generated from the sum 
of their three most recent predecessors. Write a java program to generate 
this sequence up to n terms where n > 3 
 */
package ICPImportatquestion;
import java.util.*;
public class q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the sequence (n > 3): ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = 1;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 4; i <= n; i++) {
            int d = a + b + c;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }
}
