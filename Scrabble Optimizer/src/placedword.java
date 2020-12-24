
public class placedword {
	
	private int startR;
	private int startC;
	private String word;
	private boolean horizontal;
	private int[] blanks;
	
	public placedword(int startR, int startC, String word, boolean horizontal) {
		this.startR = startR;
		this.startC = startC;
		this.word = word;
		this.horizontal = horizontal;
	}
	
	public String getWord() {
		return word;
	}
	
	public int getRow() {
		return startR;
	}
	
	public int getCol() {
		return startC;
	}
	
	public boolean getAlignment() {
		return horizontal;
	}
	
}
