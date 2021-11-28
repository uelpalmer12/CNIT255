package CNIT255;

public class Airlines {
    private String Country;
    private String AirlineName;

    public Airlines(String Country, String AirlineName){
        setCountry(Country);
        setAirlineName(AirlineName);
    }

    public void setAirlineName(String AirlineName) {
        this.AirlineName = AirlineName;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getAirlineName() {
        return AirlineName;
    }

    public String getCountry() {
        return Country;
    }
}
