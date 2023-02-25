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
