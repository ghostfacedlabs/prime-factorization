package com.ghostfacedlabs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This application will print all Prime Factors of a given number");
        System.out.println("----------------------------------------");

        while (true) {
            System.out.print("Please enter a number: ");
            String input = scanner.nextLine();
            int number;

            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException n) {
                System.out.println("Must be a valid number");
                continue;
            }

            printFactors(number);
            break;

        }
    }

    public static void printFactors(int num) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Prime Factors:");
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                numbers.add(i);
                num /= i;
            }
        }
        for (int j : numbers) {
            System.out.println(j);
        }
    }
}
