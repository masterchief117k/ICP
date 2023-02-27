/*Question-4: 
Write a method that returns the number of days in a year using the following header: 
 
public static int numberOfDaysInAYear(int year)  
Write a java program that displays the number of days in year from 2000 to 2020.
 */
package Assingment_6;
import java.util.*;

public class q4_a6 {
    public static int numberOfDaysInAYear(int year){

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            return(366);
        }else{
            return(365);
        }
    }
    public static void main(String[] args) {

       int a ;
       int y;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the year");
       y=sc.nextInt();
       for(int i = 2000;i<=2020;i++) {

        
            a= numberOfDaysInAYear(i);
            a=+a;
        }
       System.out.println("the nuber of dsays in a year "+ y +" is "+a);

    }
    
}
