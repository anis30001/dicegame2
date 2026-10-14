package org.example;

public class Player {

        private String firstName;
        private String lastName;
        private int score;

        // Konstruktor
        public Player(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.score = 0;
        }

        //  poäng
        public void addToScore(int score) {
            this.score += score;
        }

        // Returnerar namn
        public String getFullName() {
            return firstName + " " + lastName;
        }

        // Returnerar score
        public int getScore() {
            return score;
        }
    }


