package CNIT255;

public class Driver {




    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello uel");

        Passenger uel = new Passenger("Uel", "Kouame", "18AR52266", "CIV", "18F", 18.0, "AF108");
        Passenger marc = new Passenger("Marc", "MarshMallow", "19AR52266", "USA", "18L", 10.0, "AF108");

        Flight AirFrance1 = new Flight("CDG", "ORD", 9, "AF108");

        AirFrance1.addPassengerToFlight(uel);
        AirFrance1.addPassengerToFlight(marc);

        System.out.println(AirFrance1.getPassengersFor("AF108"));

        

        

        
        

        



        
        




    }

    
}
