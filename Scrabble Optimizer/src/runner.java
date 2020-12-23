import java.io.FileNotFoundException;
import java.util.ArrayList;

public class runner {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		dictionary dictionary = new dictionary();
		dictionary.printWords();
		ArrayList<Character> test = new ArrayList<Character>();
		test.add('A');
		test.add('B');
		test.add('C');
		test.add('D');
		test.add('0');
		test.add('0');
		ArrayList<String> testwords = dictionary.getWords(test);
		System.out.println(testwords);
		
		board board = new board();
		board.printBoardCellTypes();
	}

}
