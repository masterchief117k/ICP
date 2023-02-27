package practiceQuestiononArray;
import java.util.Random;

public class q_1{
    public static void main(String[] args) {
        int N = 10; // Set the size of the array
        int[] arr = new int[N]; // Create an array of size N
        Random rand = new Random(); // Create a Random object to generate random values
        
        // Populate the array with random values between 1 and N
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(N) + 1; // Generate a random value between 1 and N
        }
        
        // Calculate the sum of the values in the array
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        
        // Calculate the average of the values in the array
        double average = (double) sum / N;
        
        // Print the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
