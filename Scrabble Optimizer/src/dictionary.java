import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner; 

public class dictionary {
	
	private HashMap<Character, Integer> letterToPoint = new HashMap<Character, Integer>();
	private HashSet<String> words = new HashSet<>();
	
	// constructor method
	public dictionary() throws FileNotFoundException {
	    scanFile();
	    assignLetterPoints();
	}
	
	// return corresponding points of given word, -1 if word doesn't exist
	public int getWordPoint(String word) {
		if(words.contains(word)) {
			int points = 0;
			for(int i = 0; i < word.length(); i++) {
				points += letterToPoint.get(word.charAt(i));
			}
			return points;
		}
		return -1;
	}
	
	// prints out all words in dictionary
	public void printWords() {
		Iterator<String> it = words.iterator(); 
		while(it.hasNext()) {
			String word = it.next();
			int points = 0;
			for(int i = 0; i < word.length(); i++) {
				points += letterToPoint.get((char)(word.charAt(i)));
			}
			System.out.print(word);
			System.out.println(" " + points);
		}
	}
	
	// helper method to scan words in text file
	private void scanFile() throws FileNotFoundException {
		File file = new File("small_dictionary_upper.txt"); 
	    Scanner sc = new Scanner(file);
	    while (sc.hasNextLine()) {
	    	words.add(sc.nextLine());
	    }
	    sc.close();
	}
	
	// helper method to assign each letter its corresponding point value
	private void assignLetterPoints() {
		for(char curr = 'A'; curr <= 'Z'; curr++) {
			if(curr == 'A' || curr == 'E' || curr == 'I' || curr == 'L' || curr == 'N' ||
			   curr == 'O' || curr == 'R' || curr == 'S' || curr == 'T' || curr == 'U')
				letterToPoint.put(curr, 1);
			else if(curr == 'D' || curr == 'G')
				letterToPoint.put(curr, 2);
			else if(curr == 'B' || curr == 'C' || curr == 'M' || curr == 'P')
				letterToPoint.put(curr, 3);
			else if(curr == 'F' || curr == 'H' || curr == 'V' || curr == 'W' || curr == 'Y')
				letterToPoint.put(curr, 4);
			else if(curr == 'K')
				letterToPoint.put(curr, 5);
			else if(curr == 'J' || curr == 'X')
				letterToPoint.put(curr, 8);
			else
				letterToPoint.put(curr, 10);
		}
		letterToPoint.put('0', 0);
	}
	
	/*
	
	// return all possible words given a seven letter combination (0 is blank tile)
		public ArrayList<String> getWords(ArrayList<Character> letters) {
			ArrayList<String> possibleWords = new ArrayList<>();
			getWordsHelper(possibleWords, letters, "");
			return possibleWords;
		}
	
	// recursive helper method to get all possible words
	private void getWordsHelper(ArrayList<String> possibleWords, ArrayList<Character> letters, String curr) {
		if(letters.size() != 0) {
			for(int i = 0; i < letters.size(); i++) {
				if(letters.get(i) == '0') {
					for(char tempBlank = 'A'; tempBlank <= 'Z'; tempBlank++) {
						String tempCurr = curr + tempBlank;
						if(words.contains(tempCurr)) {
							possibleWords.add(tempCurr);
						}
						ArrayList<Character> tempLetters = new ArrayList<Character>();
						for(int c = 0; c < letters.size(); c++) {
							if(c != i)
								tempLetters.add(letters.get(c));
						}
						getWordsHelper(possibleWords, tempLetters, tempCurr);
					}
				} else {
					String tempCurr = curr + letters.get(i);
					if(words.contains(tempCurr)) {
						possibleWords.add(tempCurr);
					}
					ArrayList<Character> tempLetters = new ArrayList<Character>();
					for(int c = 0; c < letters.size(); c++) {
						if(c != i)
							tempLetters.add(letters.get(c));
					}
					getWordsHelper(possibleWords, tempLetters, tempCurr);
				}
			}
		}
	}
	
	*/
	
}
