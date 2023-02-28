/*Question-4: 
Write a method that returns the number of days in a year using the following header: 
 
public static int numberOfDaysInAYear(int year)  
Write a java program that displays the number of days in year from 2000 to 2020.
 */
package Assingment_6;
import java.util.*;

public class q4_a6 {
    public static int numberOfDaysInAYear(int year){
         int a= 0;
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            a=366;
        }
        else
        {
            a=365;
        }
        return a;
    }
    public static void main(String[] args) {
    int z=0;
       int a=0 ;
       for(int i = 2000;i<=2020;i++) {
            if( numberOfDaysInAYear(i)==366){
                a++;
            }else{
             z+=365;
            }
            
        }
       System.out.println("the number of days in a year "+" is "+(z+(a*366)));

    }
    
}
