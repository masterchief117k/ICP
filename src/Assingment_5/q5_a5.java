/*Question-5: 
WAP to display the multiplication table from 2 to 15. 
 
Sample run: 
Multiplication table of 2 
2 × 1 = 2 
2 × 2 = 4 
: 
: 
2 × 10 = 20 
 
Multiplication table of 3 
3 × 1 = 3 
3 × 2 = 6  */
package Assingment_5;
import java.util.*;
public class q5_a5 {
    public static void main(String[]args){    
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("Enter the first number ");
    a=sc.nextInt();
    System.out.println("Enter the second number ");
    b=sc.nextInt();
    for(int i=a;i<=b;i++){
        for (int j = 1; j <= 10; j++) {
            System.out.println(i + "x" + j + "=" + j * i);
        }
    }
}
}
