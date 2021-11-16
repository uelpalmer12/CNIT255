package CNIT255;


public class People {
    

    // Attributes of the class


    private String FirstName;
    private String LastName;
    private String PassportNumber;
    private String Nationality;


    public People(String FirstName, String LastName, String PassportNumber, String Nationality){

        // Setters for the attribute

        setFirstName(FirstName);
        setLastName(LastName);
        setPassportNumber(PassportNumber);
        setNationality(Nationality);
    }


    // create set methods

    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }

    public void setNationality(String Nationality){
        this.Nationality = Nationality;
    }

    public void setPassportNumber(String PassportNumber){
        this.PassportNumber = PassportNumber;
    }


    // create getters methods for the class

    public String getFullName(){
        return FirstName + " " + LastName;
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){
        return LastName;
    }

    public String getNationality(){
        return Nationality;
    }

    public String getPassportNumber(){
        return PassportNumber;
    }

}


