package application;

import java.util.Random;

public class RandomWord {
/* A soulmate is someone who has locks that fit our keys, and keys to fit our locks. When we feel safe enough to open the locks, our truest selves step out and we can be completely and honestly who we are; we can be loved for who we are and not for who we’re pretending to be. Each unveils the best part of the other. No matter what else goes wrong around us, with that one person we’re safe in our own paradise. Our soulmate is someone who shares our deepest longings, our sense of direction. When we’re two balloons, and together our direction is up, chances are we’ve found the right person. Our soulmate is the one who makes life come to life.
 */
	
	
	private String[] words = {"someone", "enough", "completely", "honestly", "pretending", "matter", "around", "paradise", "balloons", "together", "direction"};
	private String chosenWord;
	//This is an instance variable in case it's needed again elsewhere in the class
	private Random randomText = new Random();
	private char[] characters;
	private int freeTry = 0;
	
	public int getFreeTry() {
		return freeTry;
	}
	
	//This constructor generates a random word as soon as the object
	//is instantiated
	public RandomWord() {
		chosenWord = words[randomText.nextInt(words.length)];
		//now going to initialize the characters array to the same length as chosenWord
		characters = new char[chosenWord.length()];
	}
	
	public String toString() {

		StringBuilder sb1 = new StringBuilder();
		for(int i = 0; i < characters.length; i++) {
			//sb1 = characters[i] == '\u0000' ? sb1.append("_ "): sb1.append(characters[i]).append(" ");
			sb1.append(characters[i] == '\u0000' ? "_": characters[i]);
			sb1.append(' ');
			/*
			 * The above replaces all of this below:
			if(characters[i] == '\u0000') {
				//text = text + "_ ";
				sb1.append("_").append(" ");
			} else {
				//text = text + characters[i] + " ";
				sb1.append(characters[i]).append(" ");
			}
			*/
		}
		String text = sb1.toString();
		return text;
	}
	
	/*char is another primitive datatype.  holds a single unicode character
	initialize a char with single quotes
	default for char is \u0000
	cant use null because primitive char is data, not an object
	char c1 = '\uu2614';
	char c2 = 'A';
	boolean equalityCheck = (c1 == c2);
	
	* charAt(index) is used to pick out the character in a string
	 * at the index value given
	 * String text = "George";
	 * char c4 = text.charAt(4);
	 * outputs 'g'
	 */

	//StringBuilder is a Java class used to concatenate strings
	// The string class is final - it can't be changed
	
	/* the ternary operator takes 3 operands
	 * (boolean ? outputForTrue: outputForFalse)
	 */
	
	public void addGuess(char c) {
		//fill in c wherever its found in the character array
		for(int i = 0; i < chosenWord.length(); i++) {
			if(c == chosenWord.charAt(i)) {
				characters[i] = c;
				freeTry -= 1;
			} 
		}
		freeTry += 1;
	}
	
	public boolean checkGuess() {
		for(char c: characters) {
			if(c == '\u0000') {
				return false;
			}
		} 
		return true;
		/* refactor
		int counter = 0;
		for(int i = 0; i < characters.length; i++) {
			if(characters[i] == '\u0095' || characters[i] == '\u0000') {
				counter = counter + 0;
			} else {
				counter += 1;
			}
		}
		boolean hasWon = counter == characters.length ? true: false;
		return hasWon;
		*/
	}
	
}
