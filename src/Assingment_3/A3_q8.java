package Assingment_3;
import java.util.*;
public class A3_q8 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x coordinates");
    double x=sc.nextDouble();
    System.out.println("enter y coordinates");
    double y = sc.nextDouble(); 
    if (x > 0 && y > 0){
    System.out.println("lies in First quadrant");
    }
    else if (x < 0 && y > 0){
     System.out.println("lies in Second quadrant");
    } 
    else if (x < 0 && y < 0){
     System.out.println("lies in Third quadrant");
    }
    else if (x > 0 && y < 0){
     System.out.println("lies in Fourth quadrant");
    }
    else if (x == 0 && y > 0){
     System.out.println("lies at positive y axis");
    }
    else if (x == 0 && y < 0){
      System.out.println("lies at negative y axis");
    }
    else if (y == 0 && x < 0){
     System.out.println("lies at negative x axis");
    }
    else if (y == 0 && x > 0){
     System.out.println("lies at positive x axis");
    }
    else{
     System.out.println("lies at origin");
    }
}

}

