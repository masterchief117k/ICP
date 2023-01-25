package Assingment_3;
import java.util.*;
public class A3_q9 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = sc.nextInt();
    
        int smallest = num1;
        int largest = num1;
        int secondLargest = num1;
    
        if (num2 < smallest) {
          smallest = num2;
        } else if (num2 > largest) {
          secondLargest = largest;
          largest = num2;
        } else {
          secondLargest = num2;
        }
    
        if (num3 < smallest) {
          smallest = num3;
        } else if (num3 > largest) {
          secondLargest = largest;
          largest = num3;
        } else if (num3 > secondLargest) {
          secondLargest = num3;
        }
    
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
      }
    }
    

