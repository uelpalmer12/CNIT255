package CNIT255;



public class Flight {


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




}