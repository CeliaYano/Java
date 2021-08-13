import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        char inputChar;

        System.out.println("A. Generate a random number.");
        System.out.println("B. Reverse a String(Word).");
        System.out.println("C. Palindrome a word(String).");

        System.out.println("Choose an option:");
        inputChar = reader.next().charAt(0);

        switch (inputChar){
            case 'A':
                Scanner number = new Scanner(System.in);
                int xmax;
                int ymin;

                System.out.println("Enter Maximum Number: ");
                ymin = number.nextInt();
                System.out.println("Enter Minimum Number: ");
                xmax = number.nextInt();

                System.out.println("Random number is: "+ randomNumber(ymin, xmax));
                //inputChar = randomNumber(inputChar);
                break;
            case 'B':
                Scanner Sreader = new Scanner(System.in);
                String ReverseString;
                System.out.println("Enter String: ");
                ReverseString = Sreader.next();

                System.out.println("The reverse string is: " + reverseString(ReverseString));
                //inputChar = reverseString(inputChar);
                break;
            case 'C':
                Scanner preader = new Scanner(System.in);

                String inputString;
                System.out.println("Enter String:");
                inputString = preader.next();

                System.out.println(isPalindrome(inputString));
                //inputChar = isPalindrome(inputChar);
                break;
            default:
                System.out.println("Invalid Choice. Program Exit.");
                System.exit(1);
                break;
        }
    }
    public static int randomNumber(int xmax, int ymin){
        if(ymin >= xmax){
            throw new IllegalArgumentException("Invalid Range.");
        }
        Random r = new Random();
        return r.nextInt((xmax-ymin)+1)+ymin;
    }
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
    public static String reverseString(String Rval){
        StringBuilder sb = new StringBuilder(Rval);
        sb.reverse();
        return sb.toString();
    }
}
