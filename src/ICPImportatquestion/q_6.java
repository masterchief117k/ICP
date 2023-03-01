/*Write a program in java accepts two number  and print the lcm of the 
two numbers. 
 */
package ICPImportatquestion;
import java.util.*;
public class q_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a,b;
        System.out.println("enter the numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        int max = Math.max(a, b);
        int lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm += max;
        }

        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
    
    
}
