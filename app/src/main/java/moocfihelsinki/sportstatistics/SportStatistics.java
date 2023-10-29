package moocfihelsinki.sportstatistics;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void gamesPlayed(Scanner reader) throws IOException{
        System.out.println("File: ");
        var fileOfInterest = reader.nextLine();
        try(var fileReader = new Scanner(Paths.get(fileOfInterest))) {
            // CSV content is know beforehand
            System.out.println("Team: ");
            var teamOfChoice = reader.nextLine();
            int numGames = 0;
            int wins = 0;
            int losses = 0;
            int TEAM1 = 0;
            int TEAM2 = 1;
            int POINTS_TEAM1 = 2;
            int POINTS_TEAM2 = 3;
            while(fileReader.hasNextLine()){
                var curLine = fileReader.nextLine().split(",");
                // Part1
                if(curLine[TEAM1].equals(teamOfChoice) || curLine[TEAM2].equals(teamOfChoice)){
                    numGames++;
                }
                //Part2
                boolean team1Winner = Integer.parseInt(curLine[POINTS_TEAM1]) > Integer.parseInt(curLine[POINTS_TEAM2]);
                    if(curLine[TEAM1].equals(teamOfChoice) && team1Winner){
                        wins++;
                    }else if(curLine[TEAM2].equals(teamOfChoice) && !team1Winner){
                        wins++;
                    }else if(curLine[TEAM1].equals(teamOfChoice) || curLine[TEAM2].equals(teamOfChoice)){
                        losses++;
                    }
                }
                System.out.println("Games: " + numGames);
                System.out.println("Wins: " + wins);
                System.out.println("Losses: " + losses);
                fileReader.close();
        }catch(IOException e){
            System.out.println("Error non existent file: " + e.getMessage());
        }
    }
}