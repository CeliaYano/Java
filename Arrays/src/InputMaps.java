
import java.util.*;

public class InputMaps {
    public static void main(String[] args) {

        String [] HarryPotterFamily=
                //<editor-fold desc="raw names data">
                {
                        "Hermoine","Granger",
                        "Harry","Potter",
                        "Ronald", "Weasely",
                        "Ginny", "Weasely",
                        "Sirius","Black",
                        "Fred","Weasely",
                        "George","Weasely",
                        "Seaverus", "Snape",
                        "Minerva", "McGonagall",
                        "Albus","Dumbledoor",
                        "James", "Potter",
                        "Lilly", "Potter",
                        "Reamus","Lupin"
                };
        //</editor-fold>
        String[] firstNames = new String[HarryPotterFamily.length/2];
        String[] LastNames = new String[HarryPotterFamily.length/2];

        for(int i = 0; i<HarryPotterFamily.length; i++){

            if(i%2==0){
                firstNames[i/2]=HarryPotterFamily[i];
            }else{
                LastNames[i/2]=HarryPotterFamily[i];
            }
        }
	   /* System.out.println(Arrays.toString(firstNames)); //this will print firsts names and last names in individula lines
	    System.out.println(Arrays.toString(LastNames));*/

        //MAP interface use;
        Map<String,String> Nox = new HashMap<>();
        for(int i=0; i<LastNames.length; i++){
            //to note last names is being used as a pointer for Array
            Nox.put(LastNames[i], firstNames[i]);
        }
        //System.out.println(Nox.get(""));// get someones first name through last name
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter last name of character of harry potter friends: ");

        System.out.println("First name is "+ Nox.get(reader.nextLine()));

    }
}
