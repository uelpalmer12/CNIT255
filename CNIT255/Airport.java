package CNIT255;

public class Airport {

    // Attributes of the class


    private String Country;
    private String City;
    private String Code;
    private String Airlines;

    public Airport(String Country, String City, String Flights, String Airlines, String Code) {
        
        // Setters being declared for the attribute

        setCountry(Country);
        setCity(City);
        setCode(Code);
        setAirlines(Airlines);
    }

    
    // Create set methods

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }


    public void setAirlines(String Airlines) {
        this.Airlines = Airlines;
    }


    // Create getter methods for the class

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return City;
    }

    public String getCode() {
        return Code;
    }

    public String getAirlines() {
        return Airlines;
    }

}

