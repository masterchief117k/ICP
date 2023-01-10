import java.util.*;
 public class A3_q5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year ");
        int a;
        a=sc.nextInt();
        if(a%400==0){
            System.out.println("the year is a leap year");
        }else if(a%4==0 && a%100!=0){
            System.out.println("the year is a leap year");

        }else{
            System.out.println("the year is not a leap year");
        }

    }
}
