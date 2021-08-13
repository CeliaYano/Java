import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double rad= s.nextDouble();
        Area a=new Area(rad);
        System.out.println("Area of Sphere is: " + a.area + ". The volume of a sphere is: " + a.volume +
                 ". The diameter is: " + a.diameter + "The circumference is: " + a.circumference);
    }
}
