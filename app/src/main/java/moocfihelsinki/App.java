/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package moocfihelsinki;

import java.util.Scanner;

import moocfihelsinki.personalinformationcollection.PersonalInformationCollection;
import moocfihelsinki.televesionprogramcollection.TelevisionProgramCollection;;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //Personalnformation
        var appReader = new Scanner(System.in);
        System.out.println("Type 1 to demo personal information program");
        System.out.println("Type 2 to demo television programs ");
        switch (appReader.nextInt()) {
            case 1:
                var personListInfo = new PersonalInformationCollection();
                do{
                    System.out.println("New personal details: ");
                    personListInfo.addPersonalInfo();
                    System.out.println("Choice Personal Information, press 1 to add a new personal info ");
                }while (appReader.nextInt()==1);
                personListInfo.printPersonalInfo();
                break;
            case 2:
                var tvList = new TelevisionProgramCollection();
                do{
                    System.out.println("New Tv Program: ");
                    tvList.addNewTelevisionProgram(appReader);
                    System.out.println("Add new TV program? Press 2");
                }while(appReader.nextInt()==2);
                tvList.filterMoviesDueToDuration(appReader);
            default:
                break;
        }
        System.out.println("End of demo!");
    }
}
