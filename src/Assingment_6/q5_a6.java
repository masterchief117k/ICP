/*Question-5: 
A regular polygon is an n-sided polygon in which all sides are of the same length and all angles 
have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for 
computing the area of a regular polygon is 
Area = 𝑛 × 𝑆2
4 ×tan(𝜋
𝑛) 
Write a method that returns the area of a regular polygon using the following header: 
 
public static double area(int n, double side)
 */
package Assingment_6;
import java.util.*;

public class q5_a6 {
    public static double area(int n, double side) {
        double numerator = n * Math.pow(side, 2);
        double denominator = 4 * Math.tan(Math.PI / n);
        return numerator / denominator;
    }
    public static void main(String[] args) {
        int side;
        double  number ;
        System.out.println("Enter the side and number of sides: ");
        double area;
        Scanner sc = new Scanner(System.in);
        
        number = sc.nextDouble();
        side = sc.nextInt();
        area = area(side,number);
        System.out.println("Area is "+area );
    }

            
}
