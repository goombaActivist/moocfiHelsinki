package moocfihelsinki.personalinformationcollection;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

import moocfihelsinki.personalinformationcollection.personalinformation.PersonalInformation;;

public class PersonalInformationCollection {
    private Scanner personReader = new Scanner(System.in);
    private ArrayList<PersonalInformation> personalInfoList = new ArrayList<>();

    public void addPersonalInfo(){
        System.out.println("Type the first name: ");
        var fname = personReader.nextLine();
        System.out.println("Type the second name: ");
        var sname = personReader.nextLine();
        System.out.println("Type the identification number: ");
        var id = new BigInteger(personReader.nextLine());
        personalInfoList.add(new PersonalInformation(fname, sname, id));
    }

    public void printPersonalInfo(){
        personalInfoList.forEach((person) -> {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        } );
    }
}
