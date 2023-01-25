package Assingment_3;
import java.util.*;
public class A3_q7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the uits of elereicity consumed");
        double x=sc.nextDouble();
        System.out.println("Do you wish to pay online?(y/n)");
        Scanner sc1= new Scanner (System.in);
        String y=sc1.nextLine();
        if(y.equals("y")){
        if(x<50)
        {
            System.out.println("you have to per "+ x +" rs per untit. "+ x*3*0.3 +" Rs is the total amount you have to pay");
        } 
        else if(x>=50 && x<200)
        {
            System.out.println("you have consumed "+ x +"  untit. "+ x*4.80*0.3 +" Rs is the total amount you have to pay");
        }else if(x>=200 && x<400){
            System.out.println("you have consumed "+ x +"  untit. "+ x*5.80*0.3 +" Rs is the total amount you have to pay");
        }else{
            System.out.println("you have consumed "+ x +"  untit. "+ x*6.20*0.3 +" Rs is the total amount you have to pay");            
        }
        }else{
            if(x<50)
            {
                System.out.println("you have to per "+ x +" rs per untit. "+ x*3 +" Rs is the total amount you have to pay");
            } 
            else if(x>=50 && x<200)
            {
                System.out.println("you have consumed "+ x +"  untit. "+ x*4.80 +" Rs is the total amount you have to pay");
            }else if(x>=200 && x<400){
                System.out.println("you have consumed "+ x +"  untit. "+ x*5.80 +" Rs is the total amount you have to pay");
            }else{
                System.out.println("you have consumed "+ x +"  untit. "+ x*6.20 +" Rs is the total amount you have to pay");            
            }
       
        }
    }      
}


