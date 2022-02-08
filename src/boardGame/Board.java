package boardGame;

public class Board {
	
	private int row;
	private int columns;
	private Peace[][] piece;
	
	
	
	public Board(int row, int columns) {
		this.row = row;
		this.columns = columns;
		piece = new Peace[row][columns];
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
		
	public Peace piece(int row, int column) {
		return piece[row][column];
	}

	public Peace piece(Position position) {
		return piece[position.getRow()][position.getColumns()];
	}
}
