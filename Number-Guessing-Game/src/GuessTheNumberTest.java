import java.util.Scanner;

public class GuessTheNumberTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		GuessTheNumber game = new GuessTheNumber();
		game.play();
		
		System.out.println("\nWould you like to play again?");
		String answer = input.nextLine();
		
		while (!answer.equalsIgnoreCase("No")) {
			game.play();
			System.out.println("\nWould you like to play again? Yes or no");
			answer = input.nextLine();
		}

		System.out.println("Game over. Thank you for playing!");
		// ask the user if they want to play again, maybe use a do...while loop

	}

}
