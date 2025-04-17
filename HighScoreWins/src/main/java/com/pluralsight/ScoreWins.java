package com.pluralsight;

import java.util.Scanner;

public class ScoreWins{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String input = scanner.nextLine().trim();

        // Split on the pipe to separate teams and scores
        String[] parts = input.split("\\|");
        if (parts.length != 2) {
            System.out.println("Invalid input format. Please use TeamA:TeamB|ScoreA:ScoreB");
            return;
        }

        // Split the teams and scores
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        if (teams.length != 2 || scores.length != 2) {
            System.out.println("Invalid input format. Please make sure you include two teams and two scores.");
            return;
        }

        String team1 = teams[0].trim();
        String team2 = teams[1].trim();

        int score1;
        int score2;

        try {
            score1 = Integer.parseInt(scores[0].trim());
            score2 = Integer.parseInt(scores[1].trim());
        } catch (NumberFormatException e) {
            System.out.println("Scores must be valid integers.");
            return;
        }

        // Determine the winner
        if (score1 > score2) {
            System.out.println("Winner: " + team1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2);
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}
