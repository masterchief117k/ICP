/*Question-7: 
Write a program to print the following outputs using for loops: 
 
(a) 
 A  
 A B 
 A B C 
 A B C D 
 A B C D E  
 
(b) 
 $ $ $ $ $ 
 $ $ $ $ 
 $ $ $ 
 $ $ 
 $ 
 
 (c)     1 
       2 2 
     3 3 3 
   4 4 4 4 
 5 5 5 5 5  */
package Assingment_5;
import java.util.*;
public class q7_a5 {
    public static void main(String[]args){
        for (int i = 1; i <= 5; i++) {
            for (int j = 65; j < 65 + i; j++) {
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
    System.out.println("\n b");
    for(int i = 5; i >0; i--){
        System.out.println(" ");
        for(int j =i;j>0;j--) {
            System.out.print("$ ");
        }
    }
    System.out.println("\nc)");
    for (int i = 1; i <= 5; i++) {
       
        for (int j = 1; j <= 5-i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print(i);
        }
        System.out.println("");
    
       
}
    }
}
