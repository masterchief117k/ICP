/*Question-10: 
Design and develop a menu driven java program for the following array operations. 
a. Create an array of N integers 
b. Display the array elements 
c. Insert an element at specific position 
d. Delete an element at a given position 
e. Exit */
package practiceQuestiononArray;
import java.util.*;
public class q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null; // Initialize the array to null
        
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Create an array of N integers");
            System.out.println("2. Display the array elements");
            System.out.println("3. Insert an element at specific position");
            System.out.println("4. Delete an element at a given position");
            System.out.println("5. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    int size = scanner.nextInt();
                    array = new int[size];
                    System.out.println("Array created successfully!");
                    break;
                    
                case 2:
                    if (array == null) {
                        System.out.println("Array not yet created!");
                    } else {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    if (array == null) {
                        System.out.println("Array not yet created!");
                    } else {
                        System.out.print("Enter the index to insert the element: ");
                        int index = scanner.nextInt();
                        
                        if (index < 0 || index >= array.length) {
                            System.out.println("Invalid index!");
                        } else {
                            System.out.print("Enter the element to insert: ");
                            int element = scanner.nextInt();
                            for (int i = array.length - 1; i > index; i--) {
                                array[i] = array[i - 1];
                            }
                            array[index] = element;
                            System.out.println("Element inserted successfully!");
                        }
                    }
                    break;
                    
                case 4:
                    if (array == null) {
                        System.out.println("Array not yet created!");
                    } else {
                        System.out.print("Enter the index to delete the element: ");
                        int index = scanner.nextInt();
                        
                        if (index < 0 || index >= array.length) {
                            System.out.println("Invalid index!");
                        } else {
                            for (int i = index; i < array.length - 1; i++) {
                                array[i] = array[i + 1];
                            }
                            array[array.length - 1] = 0;
                            System.out.println("Element deleted successfully!");
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}