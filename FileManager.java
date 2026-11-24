// Base file from w3 schools

import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class FileManager {

    File file;

    public Attendee[] readFile(String fileName) {

        file = new File(fileName);
        Attendee[] attendees = new Attendee[0];

        try {
            // find amount of attendees (would be amazing use of an arraylist)
            int count = 0;
            try (Scanner counter = new Scanner(file)) {
                while (counter.hasNextLine()) {
                    counter.nextLine();
                    count++;
                }
            }

            attendees = new Attendee[count];

            // fill array with attendees
            try (Scanner myReader = new Scanner(file)) {
                int i = 0;
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] parts = data.split(",");
                    attendees[i] = new Attendee(parts[0], parts[1], Integer.parseInt(parts[2])); // TODO: Verify if this works
                    i++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return attendees;
    }
}