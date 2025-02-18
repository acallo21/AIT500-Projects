import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
	private Scanner input = new Scanner(System.in);
	private SecureRandom randomNumbers = new SecureRandom();
	private int numberOfGuesses;
	
public static void main(String[]args) {
		GuessTheNumber guesstheNumber = new GuessTheNumber();
			guesstheNumber.play();
	}
	public void play() {
		int magicNumber = 1 + randomNumbers.nextInt(10);
		int guess = 0;
		System.out.println("I have a magic number. Can you guess it? ");
		numberOfGuesses = 0;
		
		// Ask for guess
		guess = askForGuess();
		// if it is
	while (true) {
		if (guess == magicNumber) {
		System.out.printf("You guessed correctly in %d guesses!%n", numberOfGuesses);
		break;
		}
		// Otherwise, tell the user if their guess is too high or too low and
		else if (guess < magicNumber) {
			System.out.println("Your guess is too low");
		} 
		else if (guess > magicNumber) {
			System.out.println("Your guess is too high");
			}
		// ask for another guess.
	    guess = askForGuess();
		}
	}
	private int askForGuess() {
		// Prompt the user of a guess
		System.out.print("Your guess: ");
		int guess = input.nextInt();
		
		// Make sure the guess is between 1 and 10 inclusive
		// if not, display error message and prompt for a guess
		
		while (guess < 0 || guess > 10) {
			System.out.println("Error! Please guess a number between 1 and 10.");
			System.out.print("Your guess: ");
			guess = input.nextInt();
		}
		numberOfGuesses++;
		return guess;
	}
}
