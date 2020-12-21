import java.io.FileNotFoundException;

public class runner {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		dictionary dictionary = new dictionary();
		dictionary.printWords();
		
		board board = new board();
		board.printBoardCellTypes();
	}

}
