package Assingment_5;

public class homework_question2 {
    public static void main(String[] args){
        for (int i = 1; i <= 7; i++) {
       
            for (int j = 1; j <= 7-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
               if(i%2!=0){
                System.out.print("*"+" ");
               }
            }
            System.out.println("");
        
           
    }
    }
    
}
