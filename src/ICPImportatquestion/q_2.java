/*  Assume  that  x  is  a  positive  variable  of  type  double.  Write  a  code 
fragment that the value of sum to e x = 1 + x + x2 /2 + x3/3 + ...x n/n 
 Eg-e3=20.07 
  */
package ICPImportatquestion;

public class q_2 {
    public static void main (String[] args){
        double n = 4;
        double x =2;
        double hold = 0; 
        System.out.println(1);
        System.out.println(x);
        for (int i = 2; i <= n; i++) {
            hold=(Math.pow(x, i))/i;
            hold+=hold;
        }
        System.out.println(hold);
    }
    
}
