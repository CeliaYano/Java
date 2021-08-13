import java.util.*;

public class randomNumber {
    public static void main(String [] args){
        Scanner number = new Scanner(System.in);
        int xmax;
        int ymin;

        //my code is confusing me ...
        System.out.println("Enter Maximum Number: ");
        ymin = number.nextInt();
        System.out.println("Enter Minimum Number: ");
        xmax = number.nextInt();

        System.out.println("Random number is: "+ randBetween(ymin, xmax));

    }
    public static int randBetween(int xmax, int ymin){
       if(ymin >= xmax){
           throw new IllegalArgumentException("Invalid Range.");
       }
       Random r = new Random();
       return r.nextInt((xmax-ymin)+1)+ymin;
    }
}
