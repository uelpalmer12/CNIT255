package CNIT255;

public class Flight {

    // Additional attributes needed for this class

    private String Destination;
    private String Origin;

    public Flight() {

    }

    // Create setter methods for the class

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    // Create getter methods for the class

    public String getOrigin() {
        return Origin;
    }

    public String getDestination() {
        return Destination;
    }

}