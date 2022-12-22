/*Write a program to input the age of a person and check if the age of the person is 
greater than or equal to 18 then print the message:
“You are eligible to cast your vote”.*/
import java.util.*;
public class A3_P1 {
    public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the age of the person: ");
     int age; 
     age = sc.nextInt();
     if(age<18){
        System.out.println("/n"+"you are not eidigble to cast your vote");
   }else{
        System.out.println("you are eligible to cast your vote");
    }
 }
}