
public class boardcell {
	
	char val = '0';
	boolean empty;
	celltype type;
	
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
	
}
