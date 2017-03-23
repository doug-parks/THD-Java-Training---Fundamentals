package ObjectsAndClasses;

import java.util.Scanner;


/**
 * Created by djp4830 on 3/23/17.
 */
public class ClassesExercise {

    public static void printNumDivisibleBySeven() {
        System.out.println("----------Exercise 1----------\n");
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void addAllNumbersLoop() {
        System.out.println("\n----------Exercise 2----------\n");

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }

        System.out.println("\nThe sum of all numbers 0-100 is: " + sum);

    }

    public static void findStringLength() {
        System.out.println("\n----------Exercise 3----------\n");
        String str = getString();
        System.out.println("\nThe length of " + str + " is " + str.length() + " characters");

    }

    public static void findCharDistribution() {
        System.out.println("\n----------Exercise 4----------\n");

        String str = getString();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.substring(i, i + 1)) {
                case "a":
                    count++;
                    break;

                case "e":
                    count++;
                    break;

                case "i":
                    count++;
                    break;

                case "o":
                    count++;
                    break;

                case "u":
                    count++;
                    break;
            }


        }
        System.out.println("Your string " + str + " contains " + (str.length() - count) + " consonants and " + count
                + " vowels");

    }

    public ClassesExercise() {
    }

    public static String getString() {
        Scanner scan = new Scanner(System.in);
        String input = "";
        int length = 0;

        System.out.println("Please enter a String containing at least 20 characters:");

        while (input.length() < 20) {
            input = scan.nextLine();
            if (input.length() < 20)
                System.out.println("Invalid input. Please reenter: ");
        }

        return input;

    }
}



