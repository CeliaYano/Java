
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double radius = reader.nextDouble();

        SphereDetails sphere = new SphereDetails(radius);

        System.out.println("The diameter is:" + sphere.diameter + ". The Circumference is: " + sphere.circumference +
                ". The SurfaceArea is: " + sphere.surfaceArea + ". The Volume is: " + sphere.volume + "." );

    }
}
