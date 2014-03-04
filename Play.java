package ref;

/*
 Play class for Hangman.java
 Created by Joan Wu
 May 15th, 2013
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Play {
	public Play() {

	}

	public void Start() {
		String[] words = new String[15];
		FileInputStream f;
		int c = 0;
		try {
			f = new FileInputStream("dictionary.txt");
			DataInputStream d = new DataInputStream(f);
			String str = "";
			try {
				while ((str = d.readLine()) != null) {
					words[c] = str;
					c++;
				}
			} catch (IOException e) {
				System.out.println("Error while reading");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not exist");
			e.printStackTrace();
		}

		// Create blanks
		String word1;
		Random rand = new Random();
		int w1 = rand.nextInt(15);
		word1 = words[w1];

		String guess = "";
		int wl = word1.length() + 1;
		for (int i = 1; i < wl; i++) {
			guess += "_";
		}
		// Start the guessing!
		String lu1 = "";
		int tt = 0;
		boolean canPlay = true;
		Main(guess, tt, canPlay, lu1, word1);
	}

	public void Main(String guess, int tt, boolean canPlay, String lu1,
			String word1) {
		if (tt == 6) {
			canPlay = false;
			Lose();
		} else {
			/*
			 * Put man here -- o | /|\| / \| _____
			 */

			char g1[] = guess.toCharArray();
			char w2[] = word1.toCharArray();
			System.out.print("Word: ");
			for (int x = 0; x < g1.length; x++) {
				System.out.print(g1[x] + " ");
			}
			System.out.println();
			int count = -1;
			Guess(guess, tt, canPlay, lu1, word1, g1, w2, count);
		}
	}

	public void Guess(String guess, int tt, boolean canPlay, String lu1,
			String word1, char g1[], char w2[], int count) {
		String tg1 = new String(g1);
		String tg2 = new String(w2);
		count++;
		if (tg1.equals(tg2)) {
			System.out
					.println("Congratulations, you win! You have guessed the word: "
							+ word1 + " in " + count + " guesses.");
			Win();
		} else {
			if (tt == 6) {
				System.out
						.println("\n\nYou have run out of guesses. The word was: "
								+ word1);
				Lose();
			} else {
				System.out.println("Misses: " + lu1);
				System.out.print("Enter Guess: ");
				Scanner input = new Scanner(System.in);
				String letter1 = input.next();
				if (Character.isLetter(letter1.charAt(0)) == false) {
					System.out
							.println("Words only contain letters, no number or other characters.");
				}
				String letter = letter1.toLowerCase();
				String word = word1.toLowerCase();
				String lu = lu1.toLowerCase();
				String miss = letter1;

				if (word.contains(letter)) {
					if (lu.contains(letter)) {
						tt += 1;
						System.out.println("You've entered this before.");
					} else {
						int wl = word.length();
						for (int i = 0; i < wl; i++) {
							char aChar = letter.charAt(0);
							char bChar = w2[i];
							if (bChar == aChar) {
								g1[i] = aChar;
							}
						}
					}
				} else {
					tt += 1;

					lu += letter;
				}

				System.out.println();

				System.out.print("Word: ");
				for (int x = 0; x < g1.length; x++) {
					System.out.print(g1[x] + " ");
				}
				System.out.println("");

				Guess(guess, tt, canPlay, lu, word, g1, w2, count);
			}
		}
	}

	public void Lose() {
		Scanner input1 = new Scanner(System.in);
		System.out.print("\nPlay Again?(Y/N): ");
		String pa1 = input1.next();
		if (pa1.contains("y") || pa1.contains("Y")) {

			Start();
		} else {
		}
	}

	public void Win() {
		System.out.println("\n\n\\o/\n | \n/ \\");
		System.out.println("You Won!\n");
		Scanner input2 = new Scanner(System.in);
		System.out.print("\nPlay Again?(Y/N): ");
		String pa = input2.next();
		if (pa.contains("y") || pa.contains("Y")) {

			Start();
		} else {
		}
	}
}