package CNIT255;


public class Passenger extends CNIT255.People{

    // additional attributes needed for the class

    private String SeatNumber;
    private Float Luggage;

    public Passenger(String FirstName, String LastName, String PassportNumber, String Nationality, String SeatNumber, Float Luggage) {
        super(FirstName, LastName, PassportNumber, Nationality);
        //TODO Auto-generated constructor stub
        setFirstName(FirstName);
        setLastName(LastName);
        setNationality(Nationality);
        setPassportNumber(PassportNumber);
        setSeatNumber(SeatNumber);
        setLuggage(Luggage);
    }
    
// writing the method that are only implemented in this class
    public void setSeatNumber(String seatNumber) {
        this.SeatNumber = seatNumber;
    }

    public void setLuggage(Float luggage) {
        this.Luggage = luggage;
    }

    public String getSeatNumber() {
        return SeatNumber;
    }

    public Float getLuggage() {
        return Luggage;
    }
    
}
