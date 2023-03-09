package practiceQuestiononArray;
import java.util.*;

public class q_2 {
   public static boolean prime(int a ){
      if(a<=1){return false;}
      for (int i =2; i<a ; i++){
       if(a%i==0){
         return false;
       }
      }
      return true;
   }
   public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numeber of element ");
    int n= sc.nextInt();
    int[] arr=new int[n];
    Random rand=new Random();
    System.out.println("The randomly generated elements are");
    for (int i=0; i<n; i++) {
      arr[i]=rand.nextInt(100)+1;
      System.out.print(arr[i]+"   ");
    }
    int count=0;
    for (int i = 0; i <n;i++) {
       if(prime(arr[i])==true){
         count++;
       }
    }
   System.out.println("\n \n the numer of elements that are prime are "+count);
 }
}