package boardGame;

public class Board {
	
	private int row;
	private int columns;
	private Peace[][] piece;
	
	
	
	public Board(int row, int columns) {
		if(row < 1 || columns < 1) {
			throw new BoardException("Erro a criar tabuleiro, numero de linhas e colunas menor que 1");
		}
		this.row = row;
		this.columns = columns;
		piece = new Peace[row][columns];
	}
	
	public int getRow() {
		return row;
	}
	public int getColumns() {
		return columns;
	}
		
	public Peace piece(int row, int column) {
		if(!positionExists(row,column)) {
			throw new BoardException("Não exite a posição!");
		}
		return piece[row][column];
	}

	public Peace piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Não exite a posição!");
		}
		return piece[position.getRow()][position.getColumns()];
	}
	
	public void pleacePiece(Peace piec, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("Já temos uma peça na posição ("+position+")!");
		}
		piece[position.getRow()][position.getColumns()] = piec;
		piec.position = position;
	}
	
	private boolean positionExists(int rows, int column) {
		return rows >=0 && rows < row && column >= 0 && column < columns;
		
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumns());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Não exite a posição!");
		}
		return piece(position) != null;
	}
	
}
