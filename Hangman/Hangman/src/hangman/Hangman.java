package hangman;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		//ord som datorn väljer ut random 
	String[] words = new String[] { "bowl", "dog", "computer", "bacon", "purple"};
	
	String rand = words[(int) (Math.random() * words.length)];
	
	System.out.println("The word has " + rand.length() + " letters.");
	
	char[] letters = new char [rand.length()];
	
	for (int i = 0; i < letters.length; i++) {
		letters[i] = '.';
	}
		
	int lives = 6;

	
	Scanner scanner = new Scanner(System.in);
	
	while (lives > 0) {
		System.out.print("lives:");
		
		for (int i = 0; i < lives; i++) {
			System.out.print("<3");
			
			
		}
		
		System.out.println();

		
		System.out.println("Input: ");
		
		String input = scanner.nextLine();
		
		char letter = input.charAt(0);
		
		boolean isLetterCorrect = false;
		
		for (int i = 0; i < letters.length; i++) {
			char l = rand.charAt(i);
			
			if (l == letter) {
				letters[i] = l;
				isLetterCorrect = true;
			}
		}
		
		
		if (!isLetterCorrect) {
			lives = lives -1;
			isLetterCorrect = true;
			
		}
		
			boolean isGameFinished = true;
		
			System.out.println("Word: ");

			
		
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == '.') {
				isGameFinished = false;
				
			}
			
			System.out.print(letters[i]);
		}
		
		   System.out.println();

		  
		   
		   System.out.println("|-----");
		   System.out.println("|    O");
		   System.out.println("|   -|-");
		   System.out.println("|   //");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");

		if (isGameFinished) {
			System.out.println("You Won");
			break;
		}
	}	

	
	
	if (lives== 0) {
		System.out.println("You lost! The word was: " + rand);
	}
	

	}

}
