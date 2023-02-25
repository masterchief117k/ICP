/*Write  a  program  that  encodes  a  word  into  Piglatin.  To  translate  word 
into a Piglatin word, convert the word into uppercase and then place the 
first vowel of the original word as the start of the new word along with 
the remaining alphabets. The alphabets present before the vowel being 
shifted towards the end followed by “AY”. Sample input (1): London, 
Sample output (1): ONDONLAY Sample input (2): Olympics, Sample 
output (2): OLYMPICSAY. 
 */
package ICPImportatquestion;
import java.util.*;

public class q_3 {
    public class PiglatinEncoder {
        public static String piglatin(String word) {
            String vowels = "AEIOU";
            word = word.toUpperCase();
            int firstVowelIndex = -1;
            for (int i = 0; i < word.length(); i++) {
                if (vowels.indexOf(word.charAt(i)) != -1) {
                    firstVowelIndex = i;
                    break;
                }
            }
            if (firstVowelIndex == -1) {
                return word + "AY";
            } else {
                return word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "AY";
            }
        }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String in;
        System.out.println("Enter the word to cinvert to Piglatn");
        in=sc.nextLine();
        System.out.println(piglatin(in));

    }    
 }
}