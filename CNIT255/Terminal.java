package CNIT255;

public class Terminal {

    // Additional attributes needed for this class

    private String TerminalNumber;
    private String GateNumber;

    public Terminal() {

    }

    // Create setter methods for the class

    public void setTerminalNumber(String TerminalNumber) {
        this.TerminalNumber = TerminalNumber;
    }

    public void setGateNumber(String GateNumber) {
        this.GateNumber = GateNumber;
    }

    // Create getter methods for the class

    public String getTerminalNumber() {
        return TerminalNumber;
    }

    public String getGateNumber() {
        return GateNumber;
    }

}