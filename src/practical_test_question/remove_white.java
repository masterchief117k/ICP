package practical_test_question;
import java.util.*;
public class remove_white {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    int length=str.length();
    int count=1;
    for(int i =0; i<length;i++){
        if(str.charAt(i)==' '){
          count++;
        }else{
            System.out.print(str.charAt(i));
        }
        
    }
    System.out.println("\nThe numeber of words in the string is "+count); 

    }
}
