import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String firstName;
    private String lastName;
    private Calendar birthday;

    public Person(String firstName, String lastName, Calendar birthday){
        /*This is instance where all information is provided*/
        this.firstName= firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    public Person(String firstName, String lastName){
        /*This is instance where only 2 information is provided*/
        this.firstName= firstName;
        this.lastName = lastName;
        this.birthday = new GregorianCalendar();
    }
    public Person(){
        firstName = " ";
        lastName = " ";
        birthday = new GregorianCalendar();
    }

    public String fullName(){
        return firstName +" "+ lastName;
    }
    public int age(Calendar today){
        return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    }
}
