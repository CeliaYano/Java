import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Person john = new Person("John", "Doe", new GregorianCalendar(1988, 6, 28));
        Person jane = new Person("Jane", "Doe");
        Person papito = new Person();
        /*john.firstName = "John";
        john.lastName = "Doe";
        john.birthday = new GregorianCalendar(1988, 6, 28);*/

        System.out.println("My name is "+ john.fullName()+ ". "+ "I am "+ john.age(new GregorianCalendar()) + " years old.");
        System.out.println("My name is "+ jane.fullName()+ ". "+ "I am "+ jane.age(new GregorianCalendar()) + " years old.");
        System.out.println("My name is "+ papito.fullName()+ ". "+ "I am "+ papito.age(new GregorianCalendar()) + " years old.");
    }
}
