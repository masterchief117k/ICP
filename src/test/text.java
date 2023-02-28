package test;
public class text {
  
    public static boolean count(String str ){
        int left = str.length()-1;
        int right = 0;
        char a=' ';
        char b=' ';
        for (int i=left; i>=0; i--){
        a = str.charAt(i);

        }
        for (int i=0; i<str.length(); i++){
         b=str.charAt(i);
        }
        if(a==b){
            return true;    
        }
        else {
            return false;
        }

    }
   public static void main(String[] args) {
      System.out.println("The string is a palendrome :"+count("101"));
   }
}