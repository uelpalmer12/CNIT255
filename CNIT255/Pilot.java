package CNIT255;


public class Pilot extends People {

    private String LicenseNumber;
    private String Role;
    private Float HoursFlown;

    public Pilot(String FirstName, String LastName, String PassportNumber, String Nationality, String LicenseNumber, String Role, Float HoursFlown) {
        super(FirstName, LastName, PassportNumber, Nationality);
        //TODO Auto-generated constructor stub


        setFirstName(FirstName);
        setLastName(LastName);
        setNationality(Nationality);
        setPassportNumber(PassportNumber);
        setLicenseNumber(LicenseNumber);
        setRole(Role);
        setHoursFlown(HoursFlown);
    }


    // methods that are only used for this class


    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }
    public void setRole(String role) {
        this.Role = role;
    }

    public void setHoursFlown(Float hoursFlown) {
        this.HoursFlown = hoursFlown;
    }

    public String LicenseNumber() {
        return LicenseNumber;
    }

    public String getRole() {
        return Role;
    }

    public Float getHoursFlown() {
        return HoursFlown;
    }
    
}
