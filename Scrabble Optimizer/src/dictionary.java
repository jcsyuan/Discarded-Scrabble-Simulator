import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class dictionary {
	
	List<String> words = new ArrayList<>();
	
	// constructor method
	public dictionary() throws FileNotFoundException {
	    File file = new File("small_dictionary.txt"); 
	    Scanner sc = new Scanner(file);
	    while (sc.hasNextLine()) {
	    	words.add(sc.nextLine());
	    }
	    sc.close();
	}
	
	// return specific word based on index
	public String getWord(int index) {
		return words.get(index);
	}
	
	// prints out all words in dictionary
	public void printWords() {
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
	
}
