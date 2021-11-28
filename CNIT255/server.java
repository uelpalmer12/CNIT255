package CNIT255;

import java.util.ArrayList;

// this class will contain most of the logic behind the system to later be added in the driver



public class server {
    
    private Passenger[] passengers;
    private Pilot[] pilots;
    private FlightAttendant[] flightAttendants;

    private ArrayList<Flight> flightsList = new ArrayList<>();

    public server(){
        passengers = new Passenger[0];
        flightAttendants = new FlightAttendant[0];
        pilots = new Pilot[0];
    }

    public void addFlightAttendant(FlightAttendant fa){
        FlightAttendant newArray[] = new FlightAttendant[flightAttendants.length+1];
        for (int i = 0; i < flightAttendants.length; i+=1){
            newArray[i] = flightAttendants[i];
        }

        newArray[newArray.length-1] = fa;
        flightAttendants = newArray;
    }

    public void addPilot(Pilot p){

        Pilot newArray[] = new Pilot[pilots.length+1];
        for (int i = 0; i < pilots.length; i+=1){
            newArray[i] = pilots[i];
        }

        newArray[newArray.length-1] = p;
        pilots = newArray;

    }



    public void addPassenger(Passenger p){

        Passenger newArray[] = new Passenger[passengers.length+1];
        for (int i = 0; i < passengers.length; i+=1){
            newArray[i] = passengers[i];
        }

        newArray[newArray.length-1] = p;
        passengers = newArray;

    }

    public Passenger getPassengerByFlightNumber(String FlightNumber){
        for (int i = 0; i < passengers.length; i+=1){
            if (passengers[i].getFlightNumber().equals(FlightNumber)){
                return passengers[i];
            }
        }
        return null;
    } 

    public void addFlight(Flight f){
        flightsList.add(f);
    }
    
    
    
    
    
    //// Tanzim code
    public Passenger[] getPassengersFor(String FlightNumber)
    {
        ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
    	for(int i = 0; i < this.passengers.length; i++) {
    		if(passengers[i].getFlightNumber().equals(FlightNumber)) {
    			passengerList.add(passengers[i]);
    		}
    	}
    	
    	Passenger[] passengerArray = new Passenger[passengerList.size()];
        
    	for(int i = 0; i < passengerList.size(); i++) {
    		passengerArray[i] = passengerList.get(i);
    	}
        return passengerArray;
    }

    public Pilot[] getPilotsFor(String FlightNumber) {
        ArrayList<Pilot> pilotList = new ArrayList<Pilot>();
    	for(int i = 0; i < this.pilots.length; i++) {
    		if(pilots[i].getFlightNumber().equals(FlightNumber)) {
    			pilotList.add(pilots[i]);
    		}
    	}
    	
    	Pilot[] pilotArray = new Pilot[pilotList.size()];
        
    	for(int i = 0; i < pilotList.size(); i++) {
    		pilotArray[i] = pilotList.get(i);
    	}
        return pilotArray;
    }

    public FlightAttendant[] getFlightAttendantFor(String FlightNumber) {
        ArrayList<FlightAttendant> flightattendantList = new ArrayList<FlightAttendant>();
    	for(int i = 0; i < this.flightAttendants.length; i++) {
    		if(flightAttendants[i].getFlightNumber().equals(FlightNumber)) {
    			flightattendantList.add(flightAttendants[i]);
    		}
    	}
    	
    	FlightAttendant[] flightAttendantArray = new FlightAttendant[flightattendantList.size()];
        
    	for(int i = 0; i < flightattendantList.size(); i++) {
    		flightAttendantArray[i] = flightattendantList.get(i);
    	}
        return flightAttendantArray;
    }





    
    public Flight[] printFlights()
    {
        Flight[] flightsArray = new Flight[flightsList.size()];
        
        for(int i = 0; i < flightsList.size(); i++) {
    		flightsArray[i] = flightsList.get(i);
    	}
        return flightsArray;
    }
    //// Tanzim code
    
    
    
    
    
    

   /* public Passenger[] getFlightFor(String FlightNumber){
        ArrayList<Passenger> passengerToBeReturned = new ArrayList<>();
        for (Flight flight : flightsList){
            if (flight.getFlightNumber().equals(FlightNumber)){
                passengerToBeReturned.add(pas)
            }
        }
    }
    */
    
    




}
