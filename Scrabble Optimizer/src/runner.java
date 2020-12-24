import java.io.FileNotFoundException;
import java.util.ArrayList;

public class runner {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		dictionary dictionary = new dictionary();
		dictionary.printWords();
		
		board board = new board();
		board.printBoardCellTypes();
		
	}

}
