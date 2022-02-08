package application;

import chess.ChessMatch;

public class Main {

	public static void main(String[] args) {
		
		ChessMatch cmatch = new ChessMatch();
		UI.printBoard(cmatch.getpieces());
	}

}
