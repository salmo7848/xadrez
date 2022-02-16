package chess;

import boardGame.Board;
import boardGame.Peace;

public abstract class ChessPiece extends Peace {
	
	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	public Color getColor() {
		return color;
	}
	
	
	
	

}
