public class Area {
    double area;
    double volume;
    double diameter;
    double circumference;
    Area(double r)
    {
        area = (Math.PI*r*r*0.75);
        volume = (Math.PI*0.75*r*r*r);
        diameter = (2 * r);
        circumference = (2 * Math.PI * r);

    }
}
