package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch(){		
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getpieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumns()];
		for(int i=0; i<board.getRow();i++) {
			for(int j=0;j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	private void initialSetup() {
		board.pleacePiece(new Rook(board, Color.WHITE), new Position(0,0));
		board.pleacePiece(new King(board, Color.WHITE), new Position(0,4));
		board.pleacePiece(new King(board, Color.BLACK), new Position(7,4));
		board.pleacePiece(new Rook(board, Color.BLACK), new Position(7,0));
	}	
}