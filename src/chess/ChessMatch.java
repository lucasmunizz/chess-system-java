package chess;

import boardgame.Board;
import chess.pieces.Hook;
import chess.pieces.King;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
		for (int i = 0; i < board.getColums(); i++) {
			for (int j = 0; j < board.getColums(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat;
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(row, column).toPosition());
	}

	public void initialSetup() {
		placeNewPiece('c', 2, new Hook(board, Color.WHITE));
		placeNewPiece('d', 2, new Hook(board, Color.WHITE));
		placeNewPiece('e', 2, new Hook(board, Color.WHITE));
		placeNewPiece('e', 1, new Hook(board, Color.WHITE));
		placeNewPiece('d', 1, new King(board, Color.WHITE));

		placeNewPiece('c', 7, new Hook(board, Color.BLACK));
		placeNewPiece('c', 8, new Hook(board, Color.BLACK));
		placeNewPiece('d', 7, new Hook(board, Color.BLACK));
		placeNewPiece('e', 7, new Hook(board, Color.BLACK));
		placeNewPiece('e', 8, new Hook(board, Color.BLACK));
		placeNewPiece('d', 8, new King(board, Color.BLACK));
	}
}
