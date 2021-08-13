
import java.util.*;

public class temperatureFuntionConversion {

    //f to c : (temp − 32) × 5/9
    //c to k : (temp + 273.15)
    //k to f : (temp − 32) × 5/9 + 273.15
    public static void  main (String [] args){
        //conversion  of temp to either fahrenheit or celsius or kelvins
        Scanner reader = new Scanner(System.in);
        char inputTemp;
        char outputTemp;
        float InputTempValue;
        float OutputTempValue;

        //inputs
        System.out.println("Current Temperature F|K|C: ");
        inputTemp = reader.next().charAt(0);
        System.out.println("Converted Temperature F|K|CF: ");
        outputTemp = reader.next().charAt(0);
        System.out.println("Enter Temperature: ");
        InputTempValue = reader.nextFloat();

        //converting from Celsius
        switch(inputTemp){
            case 'F':
                InputTempValue = FtoC(InputTempValue);
            break;
            case'C':
            break;
            case'K':
                InputTempValue = FtoC(CtoK(InputTempValue));
            break;
            default:
                System.exit(1);

        }
        //converting from Celsius
        switch(outputTemp){
            case 'F':
                InputTempValue = KtoF(CtoK(InputTempValue));
                break;
            case'C':
                break;
            case'K':
                InputTempValue = CtoK(InputTempValue);
                break;
            default:
                System.exit(1);

        }
        System.out.println("The temperature converted is:" + InputTempValue);
    }

    public static float FtoC( float fVal){
        return ((fVal-32.0f) * 5.0f)/9.0f;
    }
    public static float KtoF(float KVal){
        return ((KVal - 273.15f) * 9.0f/5.0f) + 32.0f;
    }
    public static float CtoK(float CVal){
        return (CVal + 273.15f);
    }
}
