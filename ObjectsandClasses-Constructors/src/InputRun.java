
import java.util.*;
public class InputRun {
    public static void main(String [] args){

        Scanner inputValues= new Scanner(System.in);
        System.out.println("Enter FirstName: ");
        String fname = inputValues.nextLine();
        System.out.println("Enter LastName: ");
        String lname = inputValues.nextLine();
        System.out.println("Enter Birthday: ");
        Calendar birthday = inputValues.nextLine(new GregorianCalendar());//FROM KESHO

        InputDetails person = new InputDetails(fname, lname, birthday);

    }
}
