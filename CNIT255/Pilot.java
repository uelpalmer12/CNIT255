package CNIT255;


public class Pilot extends People {

    private String LicenseNumber;
    private String Role;
    private double HoursFlown;
    private String FlightNumber;
    

    public Pilot(String FirstName, String LastName, String PassportNumber, String Nationality, String LicenseNumber, String Role, double HoursFlown, String FlightNumber) {
        super(FirstName, LastName, PassportNumber, Nationality);
        //TODO Auto-generated constructor stub


        setFirstName(FirstName);
        setLastName(LastName);
        setNationality(Nationality);
        setPassportNumber(PassportNumber);
        setLicenseNumber(LicenseNumber);
        setRole(Role);
        setHoursFlown(HoursFlown);
        setFlightNumber(FlightNumber);

        
    }


    // methods that are only used for this class


    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }
    public void setRole(String role) {
        this.Role = role;
    }

    public void setHoursFlown(double HoursFlown) {
        this.HoursFlown = HoursFlown;
    }

    public void setFlightNumber(String flightNumber) {
        this.FlightNumber = flightNumber;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public String getRole() {
        return Role;
    }

    public double getHoursFlown() {
        return HoursFlown;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }
    
}
