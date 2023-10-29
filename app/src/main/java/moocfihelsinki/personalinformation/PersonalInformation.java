package moocfihelsinki.personalinformation;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private int identificationNumber;
    
    public PersonalInformation(String fname, String lname, int id){
        this.firstName = fname;
        this.lastName = lname;
        this.identificationNumber = id;
    }
}
