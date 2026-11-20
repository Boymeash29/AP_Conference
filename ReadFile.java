// Base file from w3 schools

import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class ReadFile {

    File file;

    public void readFile(String fileName) {

        File file = new File(fileName);
        file.useDelimiter(","); // From W3 Schools

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(file)) {
            while (myReader.hasNext()) {
            String data = myReader.next();
            System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}