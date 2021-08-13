import java.util.Calendar;

public class InputDetails {
    private String firstName;
    private String lastName;
    private Calendar birthday;

    public InputDetails(String firstName, String lastName, Calendar birthaday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    public String fullName(){
        return firstName +" "+ lastName;
    }
    public int age(Calendar today){
        return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    }
}
