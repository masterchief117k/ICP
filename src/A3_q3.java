import java.util.*;
public class A3_q3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int a,b,c,d;
    a=sc.nextInt();
    System.out.println("enter the second number");
    b=sc.nextInt();
    System.out.println("enter the third number");
    c=sc.nextInt();  
    if(a<b&&a<c){
        System.out.println("assending order");
    } else{
        System.out.println("decending order ");
    } 
}
}
