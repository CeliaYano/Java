import java.util.Scanner;

public class reverseString {
    public static String reverseString(String Rval){
        StringBuilder sb = new StringBuilder(Rval);
        sb.reverse();
        return sb.toString();
    }
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        String ReverseString;
        System.out.println("Enter String: ");
        ReverseString = reader.next();

        System.out.println("The reverse string is: " + reverseString(ReverseString));
    }
}
