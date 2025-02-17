import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {
		//Get Sentence
		Scanner scanner = new Scanner(System.in);
		System.out.println("Create a sentence");
		String sentence = scanner.nextLine();
		
		//Process user sentence
		String[] tokens = sentence.split(" ");
		System.out.println();
		//Print in reverse order
	        for (int i = tokens.length - 1; i >= 0; i--) {
	            System.out.println(tokens[i] + " ");
	     }
	}

}
