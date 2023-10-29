package moocfihelsinki.cubes;

import java.util.Scanner;

public class Cubes {
    public static void cubeOfNumber(Scanner reader){
        System.out.println("While \"end\" is not typed the program will continue to run, type anything");
        while(!reader.nextLine().equals("end")){
            System.out.println("Type new number: ");
            var typedNum = reader.nextInt();
            System.out.println(typedNum*typedNum*typedNum);
        }            
    }
}
