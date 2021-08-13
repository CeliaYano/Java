public class Main {

    public static void main(String[] args) {
        Cars one = new Cars(
                "Toyota", "IST",
                2006, 1100, false, 23
        );
        Cars two = new Cars(
                "Mercedes benz", "4matic",
                2018, 1683, false, 4
        );
        Cars three = new Cars(
                "Subaru", "Forester", 2007,
                1450, true, 130
        );
        Plane four = new Plane("Boeing", "747", 2017, 183500, true, 7  );
        Plane five = new Plane("Boeing", "737", 2018, 41410, false, 2  );

        Vehicle[] vehicle = new Vehicle[5];
        vehicle[0] = one;
        vehicle[1] = two;
        vehicle[2] = three;
        vehicle[3] = four;
        vehicle[4] = five;

        for(int i= 0; i < vehicle.length; i++){
            vehicle[i].Print();
        }
    }
}
