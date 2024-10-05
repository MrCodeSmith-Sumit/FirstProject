package com.example.Project;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	@RestController
	@RequestMapping("/game")
	public class GameController {

	    @Autowired
	    private NumberGuessingGame numberGuessingGame;

	    // End point to check the guess
	    @PostMapping("/guess")
	    public String guessNumber(@RequestParam int guess) {
	        return numberGuessingGame.checkGuess(guess);
	    }

	    // End point to reset the game manually
	    @PostMapping("/reset")
	    public String resetGame() {
	        numberGuessingGame.resetGame();
	        return "Game has been reset!";
	    }
	}


