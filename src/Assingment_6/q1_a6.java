package Assingment_6;
import java.util.*;
public class q1_a6 {
    static void add (double x,double y){
        double a;
        a=x+y;
        System.out.println("Entered numbers are "+x+" "+y+"\n the sum of numbers are "+a);
    }
    static void sub (double x,double y){
        double a;
        a=x-y;
        System.out.println("Entered numbers are "+x+" "+y+"\n the subtraction  of numbers are "+a);
    }
    static void multiply (double  x,double y){
        double m;
        m=x*y;
        System.out.println("Entered numbers are "+x+" "+y+" Their multiplication is "+m);
    }
    static void div(double x,double y){
        double d;
        d=x/y;
       if(y>0 || y<0){
       System.out.println("Entered numbers are "+x+" "+y+" Their division is "+d);
    }
        else {System.out.println("the divisor is zero");
    }    
}
     static void remain (double x,double y){
        double rem;
        rem=x%y;
        if(y!=0){
        System.out.println("Entered numbers are "+x+" "+y+" Their division is "+rem);
        }
        else{System.out.println("the denominator is 0");}
    }
    static void root (double x,double y){
      double r;
      r= Math.pow(x, y);
      System.out.println("the number entered are "+x+" to the power of "+y);
      System.out.println(r);
    }

    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    Scanner sc1= new Scanner(System.in);    
    double a,b;
        String hold;
    System.out.println("enter the first number ");
     a = sc.nextDouble();
    System.out.println("Enter the scound number ");
     b = sc.nextDouble();
    System.out.println("Enter the operation you want to perform");
     hold = sc1.nextLine();
    if(hold.equals("addition")){
        add(a,b);
    }
    else if(hold.equals("subraction")){
        sub(a,b);
    }
    else if(hold.equals("multiplication")){
        multiply(a,b);
    }
    else if(hold.equals("division")){
        div(a,b);
    } 
    else if(hold.equals("remainder")){
        remain(a,b);
    } 
    else if(hold.equals("power")){
        root(a, b);
   }
   else{
    System.out.println("This operation doesnot exist");
   }
}
    
}

