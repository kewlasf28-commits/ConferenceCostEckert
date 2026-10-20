/*
 * Student: Allison Eckert
 * Course: CIS 171 - Java
 * Assignment: Conference Cost
 *
 * Source: Conference rates provided by Karen Lentz-O'Loughlin.
 * OpenAI ChatGPT assisted with program testing.
 */

import java.util.Scanner;

public class ConferenceCostEckert {

    private static final int[][] RATES = {
            {100, 190, 270, 340, 400},
            {90, 170, 250, 320, 380},
            {85, 160, 240, 310, 370},
            {75, 150, 230, 300, 360}
    };

    public static int determineConferenceCost(int days, int tier) {

        if (days < 1 || days > 5) {
            throw new IllegalArgumentException("Days must be 1-5.");
        }

        if (tier < 1 || tier > 4) {
            throw new IllegalArgumentException("Tier must be 1-4.");
        }

        return RATES[tier - 1][days - 1];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Conference Cost Calculator ===");

        while (true) {

            System.out.print("Enter days (1-5) or 999 to quit: ");

            if (!input.hasNextInt()) {
                System.out.println("Please enter a whole number.");
                input.next();
                continue;
            }

            int days = input.nextInt();

            if (days == 999) {
                break;
            }

            if (days < 1 || days > 5) {
                System.out.println("Invalid number of days.");
                continue;
            }

            System.out.print("Enter tier (1-4): ");

            if (!input.hasNextInt()) {
                System.out.println("Please enter a whole number.");
                input.next();
                continue;
            }

            int tier = input.nextInt();

            try {
                int cost = determineConferenceCost(days, tier);

                System.out.println("Conference Cost: $" + cost);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Program ended.");
        input.close();
    }
}

