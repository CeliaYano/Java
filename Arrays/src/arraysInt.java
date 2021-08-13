import java.util.Arrays;

public class arraysInt {
    public static void main (String[]args){
        int[] accnumbers = new int[10];
        int[] decnumbers = new int[10];

        for(int i = 0; i<10; i++){
            accnumbers[i]= 1 + i;
            decnumbers[i]= 10-i;
        }
        System.out.println(Arrays.toString(accnumbers));

        System.out.println(Arrays.toString(decnumbers));
    }
}
