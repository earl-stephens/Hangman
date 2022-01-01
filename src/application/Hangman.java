package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int numberOfTries = 5;
	private char lastGuess;
	
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

		String inputGuess = scanner.nextLine();
		if(inputGuess.equals("")) {
			System.out.println("Enter your guess as a single letter: ");
		} else {
			lastGuess = inputGuess.charAt(0);
		}
	}
	
	private void checkUserInput() {
		//check if the word is complete
		//can set a boolean is the word is complete
		boolean isCorrect = word.checkGuess(lastGuess);
		if(isCorrect) {
			if(word.isComplete()) {
			System.out.println("You won!");
			running = false;
			
			}
		} else {
			numberOfTries--;
			
			if(numberOfTries == 0) {
				System.out.println("You have lost!");
				running = false;
			}
		}
	}
	
	private void displayWord() {
		System.out.println("Remaining tries: " + numberOfTries);
		System.out.println(word);
	}
	
	//Java doesn't have a destructor method
	//Won't work if there's a system.exit somewhere
	public void close() {
		scanner.close();
	}

}
