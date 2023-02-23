/*Write a java program to calculate the area of triangle, square, circle, rectangle by using method 
overloading.
 */
package Assingment_6;

public class q10_a6 {
    
        public static void main(String[] args) {
            double triangleArea = calculateArea(10, 5);
            double squareArea = calculateArea1(7);
            double circleArea = calculateArea2(3.5);
            double rectangleArea = calculateArea3(8, 12);
    
            System.out.println("Triangle area: " + triangleArea);
            System.out.println("Square area: " + squareArea);
            System.out.println("Circle area: " + circleArea);
            System.out.println("Rectangle area: " + rectangleArea);
        }
    
        public static double calculateArea(double base, double height) {
            return 0.5 * base * height; // Area of a triangle
        }
    
        public static double calculateArea1(double side) {
            return side * side; // Area of a square
        }
    
        public static double calculateArea2(double radius) {
            return Math.PI * radius * radius; // Area of a circle
        }
    
        public static double calculateArea3(double length, double width) {
            return length * width; // Area of a rectangle
        }
    }
        

