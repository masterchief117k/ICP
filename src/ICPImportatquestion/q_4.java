/*  A tech number has even number of digits. If the number is split in two 
equal  halves,  then  the  square  of  sum  of  these  halves  is  equal  to  the 
number itself. Write a program to check whether it is a Tech number or 
not. Example: Consider the number 3025 Square of sum of the halves 
of 3025 = (30+25)2 = (55)2 = 3025 is a tech number*/
package ICPImportatquestion;
import java.util.*;

public class q_4 {
   
    public static boolean isTechNumber(int n) {
        int digits = (int) Math.log10(n) + 1; // number of digits in n
        if (digits % 2 != 0) { // tech numbers have even number of digits
            return false;
        }
        int half = digits / 2; // half the number of digits
        int firstHalf = n / (int) Math.pow(10, half); // first half of the number
        int secondHalf = n % (int) Math.pow(10, half); // second half of the number
        int sum = firstHalf + secondHalf;
        return Math.pow(sum, 2) == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isTechNumber(n)) {
            System.out.println(n + " is a tech number.");
        } else {
            System.out.println(n + " is not a tech number.");
        }
    }
}