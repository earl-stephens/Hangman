package application;

public class Hangman {
	
	private boolean running = true;
	
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
	
	public void displayWord() {
		System.out.println("displayWord");
	}
	
	public void getUserInput() {
		System.out.println("displayWord");
	}
	
	public void checkUserInput() {
		System.out.println("displayWord");
	}
}
