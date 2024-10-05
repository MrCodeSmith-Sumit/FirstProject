package com.example.Project;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class NumberGuessingGame {
    private int targetNumber;
    private int maxNumber = 100;

    public NumberGuessingGame() {
        resetGame();
    }

    public void resetGame() {
        Random random = new Random();
        this.targetNumber = random.nextInt(maxNumber) + 1;
    }

    public String checkGuess(int guess) {
        if (guess < targetNumber) {
            return "Your guess is too low!";
        } else if (guess > targetNumber) {
            return "Your guess is too high!";
        } else {
            resetGame(); // Game resets when the guess is correct
            return "Correct! You've guessed the number. The game is resetting!";
        }
    }
}
