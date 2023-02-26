package icpMIDsem;

public class img2ans {
  public static void main(String[] args){
    /*max value of integer is (2^31)-1 
     * if we add sometinh to the max positive value then it resets
     * teh max number to minimum number and adds it .
    */
     int a = Integer.MAX_VALUE;
     System.out.println(a+9);//(-2^31)-1 +9=-2147483640
     System.out.println(-a-8);//2147483641
     System.out.println(a*3);//2147483645
     System.out.println(a>>24);//127
  }
    
}
