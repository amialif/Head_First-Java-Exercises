package com.practicehouse.guessgame;

/**
 *
 * @author arifur.rahman
 */
public class GuessGameJava {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        // Create Player
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;

        // Default Win Situation is false
        boolean p1win = false;
        boolean p2win = false;
        boolean p3win = false;
        
        // This number player will guess
        int targetNum = (int) (Math.random() * 10);

        while (true) {
            System.out.println("Let's Start The Game.. Guess a Number between 1 to 10");
            System.out.println("Number You Have to Guess is " + targetNum);

            p1.guess(); // Player one guessing
            p2.guess(); // Player 2 guessing
            p3.guess(); // Player 3 guessing

            p1Guess = p1.number;
            System.out.println("Player One is guessed " + p1Guess);

            p2Guess = p2.number;
            System.out.println("Player Two Guessed " + p2Guess);

            p3Guess = p3.number;
            System.out.println("Player Three is Guessed " + p3Guess);

            if (p1Guess == targetNum) {
                p1win = true;
            }
            if (p2Guess == targetNum) {
                p2win = true;
            }
            if (p3Guess == targetNum) {
                p3win = true;
            }

            if (p1win || p2win || p3win) {
                System.out.println("We have our Winner");
                System.out.println("Player 1 is win or not ? " + p1win);
                System.out.println("Player 2 is win or not ? " + p2win);
                System.out.println("Player 3 is win or not ? " + p3win);
                System.out.println("Game OVer ************************");
                break; // break the loop

            } else {
                System.out.println("We all Are Wrong..let's one more time");
            }

        }

    }

}
