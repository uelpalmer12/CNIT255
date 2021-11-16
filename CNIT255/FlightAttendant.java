package CNIT255;


public class FlightAttendant extends People {

    private String AttendantID;
    private String Role;


    public FlightAttendant(String FirstName, String LastName, String PassportNumber, String Nationality,  String Role, String AttendantID) {
        super(FirstName, LastName, PassportNumber, Nationality);
        //TODO Auto-generated constructor stub

        setFirstName(FirstName);
        setLastName(LastName);
        setNationality(Nationality);
        setPassportNumber(PassportNumber);
        setRole(Role);
        setAttendantID(AttendantID);
    }
    
    // methods that are not inherited from the people class

    public void setAttendantID(String attendantID) {
        this.AttendantID = attendantID;
    }
    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getAttendantID() {
        return AttendantID;
    }

    public String getRole() {
        return Role;
    }
}
