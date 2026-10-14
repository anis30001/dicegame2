package org.example;

import java.util.Scanner;
import java.util.random.RandomGenerator;


public class DiceGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // spelare 1
        System.out.println("Spelare 1");
        System.out.print("Förnamn: ");
        String firstName1 = scanner.nextLine();

        System.out.print("Efternamn: ");
        String lastName1 = scanner.nextLine();

        Player player1 = new Player(firstName1, lastName1);


        // spelare 2
        System.out.println("\nSpelare 2");
        System.out.print("Förnamn: ");
        String firstName2 = scanner.nextLine();

        System.out.print("Efternamn: ");
        String lastName2 = scanner.nextLine();

        Player player2 = new Player(firstName2, lastName2);


        // Spelare 1 slår två gånger
        System.out.println("\n" + player1.getFullName() + " slår tärningen!");

        int diceRoll = RandomGenerator.getDefault().nextInt(1, 7);
        System.out.println("Slag 1: " + diceRoll);
        player1.addToScore(diceRoll);

        diceRoll = RandomGenerator.getDefault().nextInt(1, 7);
        System.out.println("Slag 2: " + diceRoll);
        player1.addToScore(diceRoll);


        // Spelare 2 slår två gånger
        System.out.println("\n" + player2.getFullName() + " slår tärningen!");

        diceRoll = RandomGenerator.getDefault().nextInt(1, 7);
        System.out.println("Slag 1: " + diceRoll);
        player2.addToScore(diceRoll);

        diceRoll = RandomGenerator.getDefault().nextInt(1, 7);
        System.out.println("Slag 2: " + diceRoll);
        player2.addToScore(diceRoll);


        // resultat
        System.out.println("\n--- RESULTAT ---");

        System.out.println(
                player1.getFullName() + " fick " + player1.getScore() + " poäng."
        );

        System.out.println(
                player2.getFullName() + " fick " + player2.getScore() + " poäng."
        );


        // Jämför score
        if (player1.getScore() > player2.getScore()) {

            System.out.println("Vinnare: " + player1.getFullName());

        } else if (player2.getScore() > player1.getScore()) {

            System.out.println("Vinnare: " + player2.getFullName());

        } else {

            System.out.println("Det blev oavgjort!");
        }

        scanner.close();
    }
}

