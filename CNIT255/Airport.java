package CNIT255;

public class Airport {

    // Attributes of the class


    private String Country;
    private String City;
    private String Code;

    public Airport(String Country, String City, String Code) {
        
        // Setters being declared for the attribute

        setCountry(Country);
        setCity(City);
        setCode(Code);
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

}

