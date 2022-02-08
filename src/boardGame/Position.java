package boardGame;

public class Position {
	
	public int row;
	public int columns;
	
	public Position(int row, int columns) {
		this.row = row;
		this.columns = columns;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public String toString() {
		return row+", "+columns;
	}

}
