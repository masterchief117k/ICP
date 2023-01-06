import java.util.*;
public class A3_q10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // create a Scanner object to read input from the user

        System.out.println("Enter your marks out of 100: ");
        int marks = scanner.nextInt(); // read the marks from the user
    
        // use a switch case to determine the grade based on the marks
        switch (marks / 10) {
          case 10:
          System.out.println("Your grade is O");
          break;
          case 9:
            System.out.println("Your grade is A");
            break;
          case 8:
            System.out.println("Your grade is B");
            break;
          case 7:
            System.out.println("Your grade is C");
            break;
          case 6:
            System.out.println("Your grade is D");
            break;
          case 5:
            System.out.println("Your grade is E");
            break;
          case 4:
            System.out.println("Your grade is F");
            break;
          case 3:
            System.out.println("Your grade is F");
            break;
          case 2:
            System.out.println("Your grade is F");
            break;
          case 1:
            System.out.println("Your grade is F");
            break;
          case 0:
            System.out.println("Your grade is F");
            break;
          default:
           System.out.println("you have entered wrong information");
            break;
  
        } 
 }
}