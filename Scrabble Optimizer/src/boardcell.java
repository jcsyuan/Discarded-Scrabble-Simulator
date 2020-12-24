
public class boardcell {
	
	private char val = ' ';
	private int point = 0;
	private boolean empty;
	private celltype type;
	
	// constructor method
	public boardcell(boolean empty, celltype type) {
		this.empty = empty;
		this.type = type;
	}
	
	// set cell's value
	public boolean setVal(char val, int point) {
		if(empty) {
			this.val = val;
			this.point = point;
			this.empty = false;
			return true;
		}
		return false;
	}
	
	// return value in cell
	public char getVal() {
		return val;
	}
	
	// return point value of cell
	public int getPoint() {
		return point;
	}
	
	// return whether cell is empty
	public boolean isEmpty() {
		return empty;
	}
	
	// return cell type
	public celltype getType() {
		return type;
	}
	
	// print contents of cell
	public void printCell() {
		System.out.println("Value: " + val);
		System.out.println("Empty: " + empty);
		System.out.println("Type" + type);
	}
}
