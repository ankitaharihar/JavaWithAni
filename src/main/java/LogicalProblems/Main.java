package LogicalProblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            
            File file = new File("C:\\Users\\Aditya\\git\\JavaWithAni\\src\\main\\java\\Source.txt");

           
            Scanner scanner = new Scanner(file);

            
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                System.out.println(line);
            }

           
            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");

        }

    }
}