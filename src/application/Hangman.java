package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while(running);
	}
	
	/* These are method stubs.  Don't really do much
	 * just used as placeholders really
	 * 	
	public void displayWord() {
		System.out.println("displayWord");
	}
	 */
	
	/* need a class that picks a random word
	 * and displays letters/spaces as needed
	 */

	
	private void getUserInput() {
		//Ask user to enter a character
		//Get the character as a string
		//Pass the character to RandomWord as the
		//argument to a method
		
		System.out.println("Enter your guess as a single letter: ");

		char c;
		String inputGuess = scanner.nextLine();
		//scanner.close();
		c = inputGuess.charAt(0);
		word.addGuess(c);
	}
	
	private void checkUserInput() {
		System.out.println("checkUserInput");
	}
	
	private void displayWord() {
		System.out.println(word);
	}
}
