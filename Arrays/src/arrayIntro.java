
import java.util.Arrays;

//introduction, Display the 26 letters of the alphabet
public class arrayIntro {
    public static void main(String [] args){
        char[] alpha = new char[26];
        //97=a
        for(int x = 0; x<26; x++){

            //using ascii decimal for the letters
            //www.asciitable.com

            alpha[x] = (char)(97+x);
        }
        System.out.println(Arrays.toString(alpha));
    }
}
