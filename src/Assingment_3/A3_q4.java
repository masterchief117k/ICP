import java.lang.*;
import java.util.*;
public class A3_q4 {
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a,b,c,d;
System.out.println("enter the number you want to guess ");
a=sc.nextInt();
b=(int)((Math.random()*10));
c=b-1;
d=b+1;
if(a==b){
    
    System.out.println("you have gussed correctly ");
}else if(a==c||a==d){
    System.out.println("tou we almost correct ");
}
else{
    System.out.println("you have guessed wrongly ");
}
System.out.println("the number was "+b);
    }
     
} 
