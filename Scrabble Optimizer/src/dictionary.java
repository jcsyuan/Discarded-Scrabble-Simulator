import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner; 

public class dictionary {
	
	final static int LOWER_TO_UPPER = 32;
	private HashMap<Character, Integer> letterToPoint = new HashMap<Character, Integer>();
	private ArrayList<String> words = new ArrayList<>();
	
	// constructor method
	public dictionary() throws FileNotFoundException {
	    scanFile();
	    assignLetterPoints();
	}
	
	// return specific word based on index
	public String getWord(int index) {
		if(0 <= index && index < words.size())
			return words.get(index);
		return "";
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
		for(int word = 0; word < words.size(); word++) {
			int points = 0;
			for(int i = 0; i < words.get(word).length(); i++) {
				points += letterToPoint.get((char)(words.get(word).charAt(i) - LOWER_TO_UPPER));
			}
			System.out.print(words.get(word));
			System.out.println(" " + points);
		}
	}
	
	// helper method to scan words in text file
	private void scanFile() throws FileNotFoundException {
		File file = new File("small_dictionary.txt"); 
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
	
}
