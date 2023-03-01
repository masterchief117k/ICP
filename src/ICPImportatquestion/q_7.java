/*   Write the java statements to input amount from user and print minimum 
number of notes (Rs. 2000, 500, 100, 50, 20, 10, 5, 2, 1) required for the 
amount */

package ICPImportatquestion;
import java.util.*;
public class q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int[] denominations = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] notesCount = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                notesCount[i] = amount / denominations[i];
                amount %= denominations[i];
            }
        }

        System.out.println("Minimum number of notes required:");
        for (int i = 0; i < denominations.length; i++) {
            if (notesCount[i] > 0) {
                System.out.println(denominations[i] + " x " + notesCount[i]);
            }
        }
    }
}

