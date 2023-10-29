package moocfihelsinki.personalinformationcollection.personalinformation;

import java.math.BigInteger;

public class PersonalInformation {
    private String firstName;    
    private String lastName;
    private BigInteger identification;

    public PersonalInformation(String fname, String lname, BigInteger id){
        this.firstName = fname;
        this.lastName = lname;
        this.identification = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public BigInteger getIdentification() {
        return identification;
    }

    public String getLastName() {
        return lastName;
    }
}
