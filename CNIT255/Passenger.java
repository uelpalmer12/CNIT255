package CNIT255;


public class Passenger extends CNIT255.People{

    // additional attributes needed for the class

    private String SeatNumber;
    private double Luggage;
    private String FlightNumber;

    public Passenger(String FirstName, String LastName, String PassportNumber, String Nationality, String SeatNumber, double Luggage, String FlightNumber) {
        super(FirstName, LastName, PassportNumber, Nationality);
        //TODO Auto-generated constructor stub
        setFirstName(FirstName);
        setLastName(LastName);
        setNationality(Nationality);
        setPassportNumber(PassportNumber);
        setSeatNumber(SeatNumber);
        setLuggage(Luggage);
        setFlightNumber(FlightNumber);
    }
    
// writing the method that are only implemented in this class
    public void setSeatNumber(String seatNumber) {
        this.SeatNumber = seatNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.FlightNumber = flightNumber;
    }

    public void setLuggage(double Luggage) {
        this.Luggage = Luggage;
    }

    public String getSeatNumber() {
        return SeatNumber;
    }

    public double getLuggage() {
        return Luggage;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    
    
}
