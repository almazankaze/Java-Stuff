package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    // return points earned
    public static double evalGrade(String letter) {
        switch(letter) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {

        File myFile = new File("Grades.txt");

        double totalHours = 0.0;
        double qualityPoints = 0.0;
        double finalResult = 0.0;

        try {

            Scanner input = new Scanner(myFile);

            // while there is text in file
            while(input.hasNextLine()) {

                String [] br = input.nextLine().split(":");
                double hours = Double.parseDouble(br[0]);
                totalHours += hours;
                qualityPoints += hours * evalGrade(br[1]);
            }

            input.close();

            if(totalHours != 0) {
                finalResult = qualityPoints / totalHours;
                System.out.printf("Major GPA: %.2f", finalResult);
            }
            else
                System.out.println("Total hours should not be zero");

        } catch (IOException e) {
            System.out.println("Something went wrong while reading the file...");
        }
    }
}
