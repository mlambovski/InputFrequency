package lab11zad7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class SurveyWrite {

    public static void writeToFile() {
        Formatter output = null;
        try {
            output = new Formatter(new File("numbers.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found!");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 9(enter 0 to end input):");
        int number = scanner.nextInt();
        while (number != 0) {
            output.format("%d%n", number);
            number = scanner.nextInt();
        }
        if (output != null) {
            output.close();
        }
    }
}
