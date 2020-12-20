
public class board {
	
	final int BOARD_LENGTH = 15;
	boardcell[][] currBoard;
	
	public board() {
		
		currBoard = new boardcell[BOARD_LENGTH][BOARD_LENGTH];
		generateBoard();
		
	}
	
	public void printBoardCellTypes() {
		for(int i = 0; i < BOARD_LENGTH; i++) {
			for(int j = 0; j < BOARD_LENGTH; j++) {
				boardcell temp = currBoard[i][j];
				if(temp.getType() == celltype.DOUBLE_LETTER) {
					System.out.print("d ");
				} else if(temp.getType() == celltype.TRIPLE_LETTER) {
					System.out.print("t ");
				} else if(temp.getType() == celltype.DOUBLE_WORD) {
					System.out.print("D ");
				} else if(temp.getType() == celltype.TRIPLE_WORD) {
					System.out.print("T ");
				} else if(temp.getType() == celltype.STARTING_CELL) {
					System.out.print("S ");
				} else if(temp.getType() == celltype.NORMAL){
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	private void generateBoard() {
		for(int i = 0; i < BOARD_LENGTH; i++) {
			for(int j = 0; j < BOARD_LENGTH; j++) {
				
				// starting cell
				if(i == 7 && j == 7)
					currBoard[i][j] = new boardcell(true, celltype.STARTING_CELL);
				
				// double letter
				else if((i == 3 && j == 0) || (i == 3 && j == 14) || (i == 11 && j == 0) || (i == 11 && j == 14) ||
				   (i == 0 && j == 3) || (i == 14 && j == 3) || (i == 0 && j == 11) || (i == 14 && j == 11))
					currBoard[i][j] = new boardcell(true, celltype.DOUBLE_LETTER);
				else if((i == 2 && j == 6) || (i == 2 && j == 8) || (i == 12 && j == 6) || (i == 12 && j == 8) ||
				   (i == 6 && j == 2) || (i == 6 && j == 6) || (i == 6 && j == 8) || (i == 6 && j == 12) ||
				   (i == 8 && j == 2) || (i == 8 && j == 6) || (i == 8 && j == 8) || (i == 8 && j == 12))
					currBoard[i][j] = new boardcell(true, celltype.DOUBLE_LETTER);
				else if((i == 3 && j == 7) || (i == 7 && j == 3) || (i == 11 && j == 7) || (i == 7 && j == 11))
					currBoard[i][j] = new boardcell(true, celltype.DOUBLE_LETTER);
				
				// triple letter
				else if((i == 1 && j == 5) || (i == 1 && j == 9) || (i == 13 && j == 5) || (i == 13 && j == 9) ||
				   (i == 5 && j == 1) || (i == 5 && j == 5) || (i == 5 && j == 9) || (i == 5 && j == 13) ||
				   (i == 9 && j == 1) || (i == 9 && j == 5) || (i == 9 && j == 9) || (i == 9 && j == 13))
					currBoard[i][j] = new boardcell(true, celltype.TRIPLE_LETTER);
				
				// double word
				else if(i == j && ((i > 0 && i < 5) || (i > 9 && i < 14)))
					currBoard[i][j] = new boardcell(true, celltype.DOUBLE_WORD);
				else if( ((i + j) == 14) && ((j > 0 && j < 5) || (j > 9 && j < 14)) )
					currBoard[i][j] = new boardcell(true, celltype.DOUBLE_WORD);
				
				// triple word
				else if((i == 0 && j == 0) || (i == 14 && j == 14) || (i == 0 && j == 14) || (i == 14 && j == 0) ||
				   (i == 7 && j == 0) || (i == 0 && j == 7) || (i == 7 && j == 14) || (i == 14 && j == 7))
					currBoard[i][j] = new boardcell(true, celltype.TRIPLE_WORD);
				
				// normal
				else
					currBoard[i][j] = new boardcell(true, celltype.NORMAL);
			}
		}
	}
	
}
