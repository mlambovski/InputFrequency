package lab11zad7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class SurveyRead {

    public static void readFromFile() {
        Scanner input = null;
        try {
            input = new Scanner(new File("numbers.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found!");
        }
        int[] frequencies = new int[10];
        while (input.hasNext()) {
            frequencies[input.nextInt()]++;
        }
        if (input != null) {
            input.close();
        }
        Formatter output = null;
        try {
            output = new Formatter(new File("output.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found!");
        }
        for (int i = 1; i < 10; i++) {
            if (frequencies[i] != 0) {
                output.format("(ResponseID: %d, frequency: %d)%n", i, frequencies[i]);
            }
        }
        if (output != null) {
            output.close();
        }
    }
}
