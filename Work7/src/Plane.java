public class Plane extends  Vehicle {
    protected boolean isFlying;

    public Plane(String Make, String Model, int Year, int Weight, boolean NeedsMaintenance, int TripsSinceManitenance) {
        super(Make, Model, Year, Weight, NeedsMaintenance, TripsSinceManitenance);  //calling parent class constructor
        this.isFlying = isFlying;
    }
    public void Flying(){
        isFlying = true;
    }
    public void Landing(){
        isFlying = false;
        if(TripsSinceMaintenance <= 5){
            NeedsMaintenance = false;
        }else{
            NeedsMaintenance = true;
        }
    }
    public void  Print(){
        super.Print();
        if(NeedsMaintenance == true){
            System.out.println("Flight Rejected.\nPlane Needs Maintenance.");
        }else{
            System.out.println("Flight Accepted. \nPlane is allowed to fly.");
        }
    }
}
