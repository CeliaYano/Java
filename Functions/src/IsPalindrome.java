import java.util.*;

public class IsPalindrome {
    public static Boolean isPalindrome(String pVal){
        //pointers
        int i = 0;
        int j = pVal.length()-1;

        //Characters to be compared
        while(i<j){
            if(pVal.charAt(i)!=pVal.charAt(j)) return false;
            i++;
            j--;
        }
        return  true;//if it is a palindrome
    }
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        String inputString;
        System.out.println("Enter String:");
        inputString = reader.next();

        System.out.println(isPalindrome(inputString));
    }
}
