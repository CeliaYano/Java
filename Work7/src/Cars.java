public class Cars  extends  Vehicle {
    protected boolean isDriving;

    public Cars(String Make, String Model, int Year, int Weight, boolean NeedsMaintenance, int TripsSinceManitenance) {
        super(Make, Model, Year, Weight, NeedsMaintenance, TripsSinceManitenance);  //calling parent class constructor
        this.isDriving = isDriving;
    }
    public void Drive(){
        isDriving = true;
    }
    public void stop(){
        isDriving = false;

        if(TripsSinceMaintenance <= 100){
            System.out.println("Car is Okay");
        }else{
            NeedsMaintenance = true;
            System.out.println("Car Needs Maintenance. Trips Exceeded.");
        }
    }
    public void Repair(){
        TripsSinceMaintenance = 0;
        NeedsMaintenance = false;
    }
    public void Print(){
        super.Print();
        System.out.println("\tTrips Made: " + TripsSinceMaintenance);
        System.out.println("\tMaintenance State: " + NeedsMaintenance);
    }

}
