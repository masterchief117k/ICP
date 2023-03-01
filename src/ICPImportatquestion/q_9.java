package ICPImportatquestion;
import java.util.*;
public class q_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a ten-digit number: ");
        long number = scanner.nextLong();

        int sum = 0;
        int multiplier = 1;
        for (int i = 0; i < 10; i++) {
            int digit = (int) (number % 10);
            sum += multiplier * digit;
            multiplier++;
            number /= 10;
        }

        int remainder = sum % 11;
        if (remainder == 0) {
            System.out.println("Legal ISBN");
        } else {
            System.out.println("Illegal ISBN");
        }
    }
}
