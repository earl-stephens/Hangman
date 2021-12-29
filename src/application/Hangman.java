package application;

public class Hangman {
	
	private boolean running = false;
	private RandomWord word = new RandomWord();
	
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
	private void displayWord() {
		System.out.println(word);
	}
	
	private void getUserInput() {
		System.out.println("getUserInput");
	}
	
	private void checkUserInput() {
		System.out.println("checkUserInput");
	}
}
