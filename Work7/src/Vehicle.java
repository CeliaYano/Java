public class Vehicle {
    protected String Make;
    protected String Model;
    protected int Year;
    protected int Weight;

    protected boolean NeedsMaintenance = false;
    protected int TripsSinceMaintenance = 0;

    public Vehicle(String Make, String Model, int Year, int Weight, boolean NeedsMaintenance, int TripsSinceManitenance)
    {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Weight = Weight;
        this.NeedsMaintenance = NeedsMaintenance;
        this.TripsSinceMaintenance = TripsSinceManitenance;
    }
    public void Print(){
        System.out.println("The Make: " + Make);
        System.out.println("\tModel: " + Model);
        System.out.println("\tYear: " + Year);
        System.out.println("\tWeight(In Kgs): " + Weight);
        //System.out.println("\tNeeds Maintenance: " + NeedsMaintenance);
        //System.out.println("\tTrips Since Maintenance: " + TripsSinceMaintenance);
    }
}
