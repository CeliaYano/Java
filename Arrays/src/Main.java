import java.util.*;
public class Main
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("apple");
        list.add("watermelon");
        list.add("pineapple");

        Iterator<String> itr = list.iterator();//looping through the list
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}