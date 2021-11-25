package CNIT255;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> PassengerList = new ArrayList<>();
    private Flight[] flights;

    public void FlightTest(){
        flights = new Flight[0];
    }

    // Additional attributes needed for this class

    private String Destination;
    private String Origin;
    private int Duration;
    private String FlightNumber;

    public Flight(String Destination, String Origin, int Duration, String FlightNumber) {

        setDestination(Destination);
        setOrigin(Origin);
        setDuration(Duration);
        setFlightNumber(FlightNumber);

    }

    // Create setter methods for the class

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public void setDuration(int Duration){
        this.Duration = Duration;
    }

    public void setFlightNumber(String flightNumber) {
        this.FlightNumber = flightNumber;
    }

    // Create getter methods for the class

    public String getOrigin() {
        return Origin;
    }

    public String getDestination() {
        return Destination;
    }

    public int getDuration() {
        return Duration;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public void addFlight(Flight f){

        Flight newArray[] = new Flight[flights.length+1];
        for (int i = 0; i < flights.length; i+=1){
            newArray[i] = flights[i];
        }

        newArray[newArray.length-1] = f;
        flights = newArray;
    }


    public Flight getFlightbyFlightNumber(String FlightNumber){

        for (int i = 0; i < flights.length; i+=1){
            if (flights[i].getFlightNumber() == FlightNumber){
                return flights[i];
            }
        }
        return null;
    }


    public void addPassengerToFlight(Passenger p){
        PassengerList.add(p);
    }


    public Passenger[] getPassengersFor(String FlightNumber){
        ArrayList<Passenger> passengerInFlight = new ArrayList<>();
        for (Passenger passenger : PassengerList){
            if(passenger.getFlightNumber() == FlightNumber){
            passengerInFlight.add(passenger);
            continue;
            }
            else{
                continue;
            }
        }

        Passenger[] finalPassengerList = new Passenger[passengerInFlight.size()];
        for(int i = 0; i < passengerInFlight.size(); i+=1){
            finalPassengerList[i] = passengerInFlight.get(i);
        }
        return finalPassengerList;
    }
}