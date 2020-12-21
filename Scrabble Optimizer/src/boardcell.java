
public class boardcell {
	
	private char val = '0';
	private boolean empty;
	private celltype type;
	
	// constructor method
	public boardcell(boolean empty, celltype type) {
		this.empty = empty;
		this.type = type;
	}
	
	// set cell's value
	public boolean setVal(char val) {
		if(empty) {
			this.val = val;
			this.empty = false;
			return true;
		}
		return false;
	}
	
	// return value in cell
	public char getVal() {
		return val;
	}
	
	// return whether cell is empty
	public boolean getEmpty() {
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
