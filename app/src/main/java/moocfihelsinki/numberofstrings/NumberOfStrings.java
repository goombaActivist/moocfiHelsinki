package moocfihelsinki.numberofstrings;

import java.util.Scanner;

public class NumberOfStrings {
    public static void howManyStrings(Scanner reader){
        System.out.println("While \"end\" is not typed the program will continue to run");
        var numStrings = 0;
        while(!reader.nextLine().equals("end")){
            System.out.println("Type new string: ");
            numStrings+=1;
        }            
        System.out.println("You typed " + numStrings + " strings!");
    }
}
