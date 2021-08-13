
import java.util.*;
public class InputArray {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String> ();
        while(true){
            list.add(reader.nextLine());
            if((list.get(list.size()-1)).equals("CLEAR")){
                list.clear();
            }else{
                if((list.get(list.size()-1)).equals("END")){
                    break;
                }
            }
            System.out.println(list.toString());
        }

    }
}
