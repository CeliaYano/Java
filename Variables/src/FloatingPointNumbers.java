public class FloatingPointNumbers {
    public static void main(String[] args){

        int iNumber = 49;
        float fNumber = 49/21; // rounds of to the nearest whole number
        float cNumber = 49.0f/21.0f;// gives the real value of division

        /* Floating Point numbers are usually placed with an "f" at the end to ensure
         that the real value of a number is actually realised*/

        int x =5;
        int y =6;
        float xyNumber = (float)x/y; //casting, declaring an operation of primitive numbers to a specific variable
        /* in this case we only casted the value x into an integer*/

        //double is a cousin of float that allows the user to have more memory space in storing information

        double a = 5.0;
        double b = 6.0;
        float abnumber = (float)(a/b);//a form of casting also but the same as above.

        System.out.println(iNumber);
        System.out.println(fNumber);
        System.out.println(cNumber);
        System.out.println(xyNumber);
        System.out.println(abnumber);

    }
}
