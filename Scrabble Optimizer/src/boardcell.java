
public class boardcell {
	
	// INITIALIZATION
	
	char curr = '0';
	boolean empty;
	celltype type;
	
	public boardcell(boolean empty, celltype type) {
		this.empty = empty;
		this.type = type;
	}
	
	
	// SET METHODS
	
	public boolean setCurr(char curr) {
		if(empty) {
			this.curr = curr;
			this.empty = false;
			return true;
		}
		return false;
	}
	
	
	// GET METHODS
	
	public char getCurr() {
		return curr;
	}
	
	public boolean getEmpty() {
		return empty;
	}
	
	public celltype getType() {
		return type;
	}
	
}
