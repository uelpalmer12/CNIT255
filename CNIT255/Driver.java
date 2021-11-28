package CNIT255;

import java.util.Scanner;

public class Driver {

    public static void addPassengerTo(server s) {
        s.addPassenger(new Passenger("Mavie", "Kouame", "Something", "Ivorian", "18F", 32.0, "AF108"));
        s.addPassenger(new Passenger("Uel", "Kouame", "18AR52266", "Ivoirian", "18F", 18.0, "DEL101"));

        /// Tanzim code
        s.addPassenger(new Passenger("Tanzim", "Mubarrat", "Dunno", "Bangladeshi", "29E", 18.0, "DEL101"));
        // Tanzim code
    
    
    
    }

    public static void addPilotTo(server s){
        s.addPilot(new Pilot("Richard", "Perignon", "Something", "French", "1890-990-90" , "Main Pilot", 900.0, "AF108"));
        s.addPilot(new Pilot("Max", "Braus", "Something", "American", "1789-999-05", "Assistant Pilot", 600.0, "AF108"));
    }

    public static void addFlightAttendantTo(server s){
        s.addFlightAttendant(new FlightAttendant("Maggie", "Ackerman", "Something", "Canadian", "Steward", "Stew10", "AF108"));
        s.addFlightAttendant(new FlightAttendant("Dominic", "Braun", "Something", "British", "Steward", "Stew13", "AF108"));
    }

    public static void addFlightServer(server s) {
        s.addFlight(new Flight("CDG", "IND", 9, "AF108"));
        s.addFlight(new Flight("ORD", "ATL", 3, "DEL101"));

    }

    public static void handlePrint(server s, String FlightNumber) {

        //Passenger[] a =s.getPassengerByFlightNumber(FlightNumber);
        
        
        
        
        /// Tanzim code
        Passenger[] a = s.getPassengersFor(FlightNumber);
        /// Tanzim code

        Pilot[] p = s.getPilotsFor(FlightNumber);

        FlightAttendant [] fa = s.getFlightAttendantFor(FlightNumber);

        
        
        
        if (a == null || p == null || fa == null) {
            System.out.println("No passenger, pilot or flight attendant registered to the flight " + FlightNumber);
        }


        //System.out.println("Showing the list of people assigned to " + FlightNumber + ": ");
        
        
        
        
        System.out.println("Showing the list of pilots assigned to " + FlightNumber + ":");
        System.out.println();
        for (int i = 0; i < p.length; i += 1){
            System.out.println(p[i].getFullName() + ", " + p[i].getNationality() + ", " + p[i].getLicenseNumber());
        }
        System.out.println();

        System.out.println("Showing the list of flight attendants assigned to " + FlightNumber + ":");
        System.out.println();
        for(int i = 0; i < fa.length; i += 1){
            System.out.println(fa[i].getFullName() + ", " + fa[i].getNationality() + ", " + fa[i].getAttendantID());
        }

        System.out.println();
        
        //// Tanzim code
        System.out.println("Showing the list of passengers assigned to " + FlightNumber + ":");
        System.out.println();
        for (int i = 0; i < a.length; i += 1) {
            System.out.println(a[i].getFullName()+ ", " + a[i].getNationality() + ", " + a[i].getPassportNumber());
            /// You can also print all other attributes of the passengers
        }
        System.out.println();
        //// tanzim code
        
        
        
        
        
        

       // boolean any = false;

    }

    public static void printPassenger(Scanner scan, server s) {
        System.out.println("Enter the flight number: ");
        String FlightNumber = scan.nextLine();
        scan.nextLine();

        handlePrint(s, FlightNumber);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        server s = new server();
        addPassengerTo(s);
        addFlightAttendantTo(s);
        addPilotTo(s);
        
        
        
        
        //// Tanzim code
        addFlightServer(s);
        //// Tanzim code

        
        
        
        
        while (true) {
            System.out.print("Type 'quit' to exit or 'continue' to proceed: ");
            if ("quit".equals(scan.next())) {
                break;
            }

            System.out.print("Enter the flight number you want to get the passengers of or -1 to show all flights: ");
            String FlightNumber = scan.next();
            scan.nextLine();
            if (FlightNumber.equals("-1")) {
                
                
                
                
                
                
                
                //// Tanzim code
                Flight[] a = s.printFlights();
                System.out.println("Showing the list of flights: ");
                for (int i = 0; i < a.length; i += 1) {
                    System.out.println(a[i].getFlightNumber() + " from " + a[i].getOrigin() + " to " + a[i].getDestination() + ", Duration: " + a[i].getDuration() + " hrs");
                    /// You can also print all other attributes of the flights
                }
                break;
                //// Tanzim code
                
                
                
                
                
                
            }

            Passenger passenger = s.getPassengerByFlightNumber(FlightNumber);
            if (passenger == null) {
                System.out.println("No passengers in flight");
                continue;
            }
            if (passenger != null) {
                handlePrint(s, FlightNumber);
                continue;
            }

        }

        /* server s = new server();
        addPassengerTo(s);

        while(true){
            System.out.println("Type 'quit' to exit, anything else to keep going: ");
            if("quit".equals(scan.nextLine()));
            {
                break;
            }

            System.out.println("Enter the flight number to add passenger or -1 to see current passenger: ");
            String FlightNumber = scan.nextLine();
            if (FlightNumber.equals("-1")){
                printPassenger(scan, s);
                continue;
            }
            Passenger pass = s.getPassengerByFlightNumber(FlightNumber);
            if (pass == null){
                System.out.println("Passenger");
            }
        }
         */
    }

}
