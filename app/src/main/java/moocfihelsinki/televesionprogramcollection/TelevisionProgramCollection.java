package moocfihelsinki.televesionprogramcollection;

import java.util.ArrayList;
import java.util.Scanner;

import moocfihelsinki.televesionprogramcollection.televisionprogram.TelevisionProgram;

public class TelevisionProgramCollection {
    private ArrayList<TelevisionProgram> televisionList = new ArrayList<>();

    public void addNewTelevisionProgram(Scanner reader){
        reader.nextLine();
        System.out.println("Name of the program: ");
        var name = reader.nextLine();
        System.out.println("Duration of the program: ");
        var dur = reader.nextInt();
        televisionList.add(new TelevisionProgram(name, dur));
    }

    public void filterMoviesDueToDuration(Scanner reader){
        System.out.println("Program's maximum duration? ");
        var usrDuration = reader.nextInt();
        televisionList.forEach((program) -> {
            if(program.getDuration() <= usrDuration){
                System.out.println(program.getName() + ", " + program.getDuration() + (program.getDuration() == 1 ? " minute " : " minutes"));
            }
        });
    }
}
