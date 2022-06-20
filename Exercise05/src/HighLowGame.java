/*
 * Author: Stanley Pieda
 * Date: March 16, 2022
 * Modified by: **** Your name here ***
 * Modified Date: **** Due Date Here ****
 * Description: Starter Code / Sample Solution Exercise 05
 * Starter Code Note: Use the pseudocode and complete the reset and run methods
 */

import java.util.Random;

/*
 * Supervisor wants a comment here overviewing the class
 */
public class HighLowGame {
	private User user = new User(); // internal only, no get/set
	private Random random = new Random(); // internal only, no get/set
	private int fuelAvailable;
	private int numberToGuess;
	private static final int MIN = 1; // internal only, no get/set
	private static final int MAX = 10; // internal only, no get/set

	/*
	 * No argument constructor, calls method reset to initialize the game
	 */
	public HighLowGame() {
		reset();
	}

	/*
	 * Accessor for fuelAvailable
	 */
	public int getFuelAvailable() {
		return fuelAvailable;
	}

	/*
	 * Mutator for fuelAvailable
	 */
	public void setFuelAvailable(int fuelAvailable) {
		this.fuelAvailable = fuelAvailable;
	}

	/*
	 * Access for numberToGuess
	 */
	public int getNumberToGuess() {
		return numberToGuess;
	}

	/*
	 * Mutator for numberToGuess
	 */
	public void setNumberToGuess(int numberToGuess) {
		this.numberToGuess = numberToGuess;
	}

	/*
	 * Resets game if user wants to continue.
	 * Sets value back to starting values
	 * & generates new random integer
	 */
	public void reset() {
		int sum = 0;
		numberToGuess = random.nextInt(MAX + 1);
		for (int value = MIN; value <= MAX; value++){
			sum += value;
		}
		fuelAvailable = sum / 2;

	}

	/*
	 * Core logic of the game, uses methods from CheckGuessResult
	 * And User to create the main game loop
	 */
	public void run() {
		//Declarations
		CheckGuessResult checkGuessResult;
		String message;
		boolean isWon = false;
		int guessCount = 0;
		int userNumber;

		System.out.println(String.format("Guess the number from %d to %d.",MIN,MAX));
		System.out.println(String.format("You have %d guess-fuel remaining.", fuelAvailable));
		while(fuelAvailable > 0 && !isWon){
			guessCount += 1;
			userNumber = user.inputInteger("Guess: ");
			fuelAvailable -= userNumber;

			if (fuelAvailable < 0)
				fuelAvailable = 0;

			checkGuessResult = checkGuess(userNumber);
			isWon = checkGuessResult.isWin();
			message = checkGuessResult.getMessage();
			System.out.println(message);

		}

		message = reportGameResult(isWon,guessCount);
		System.out.println(message);

	}

	/*
	 * This method examines the guess to see if it matches the numberToGuess
	 * value. To report win or no-win, with a message as well a CheckGuessResult
	 * instance is created with these results, and the reference to the
	 * CheckGuessResult object is returned.
	 */
	private CheckGuessResult checkGuess(int guess) {
		boolean isWin = false;
		String message;

		if (guess == numberToGuess) {
			message = "You guessed the number";
			isWin = true;
		}
		else {
			if(guess < numberToGuess) {
				message = "too low, ";
			}
			else {
				message = "too high, ";
			}
			message = message + String.format(
					"%d guess-fuel remaining", fuelAvailable);
		}
		CheckGuessResult checkGuessResult = new CheckGuessResult(message, isWin);
		return checkGuessResult;
	}
	
	/*
	 * This method writes out a final result of the game (win or lose) as well
	 * as the number of guesses used by the player (i.e. the user).
	 */
	private String reportGameResult(boolean isWon, int guessCount) {
		String message;
		if(isWon) {
			message = "You win! It took you ";
		}
		else {
			message = "You did not win, you used ";
		}
		message = String.format(message + "%d guesses", guessCount);
		return message;
	}
}
