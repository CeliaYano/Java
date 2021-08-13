public class SphereDetails {
    double diameter;
    double circumference;
    double surfaceArea;
    double volume;

    //constructor
    SphereDetails(double radius ){
       diameter = (2 * radius);
       circumference = (2 * Math.PI * radius);
       surfaceArea = (2 * 0.75 * Math.PI * radius * radius);
       volume = (2 * 0.75 * Math.PI * radius * radius * radius);
    }
}
