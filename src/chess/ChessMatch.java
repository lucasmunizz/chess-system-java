package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;

public class ChessMatch {
	
	private Board board;
	
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
		for (int i = 0; i < board.getColums(); i++) {
			for (int j = 0; j < board.getColums(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	public void initialSetup() {
		board.placePiece(new King(board, Color.WHITE ), new Position(2, 1));
	}
}
