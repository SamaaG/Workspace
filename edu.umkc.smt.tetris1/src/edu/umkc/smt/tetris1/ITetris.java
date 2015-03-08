package edu.umkc.smt.tetris1;

public interface ITetris {

	boolean isNewGame();

	boolean isGameOver();

	boolean isPaused();

	TileType getPieceType();

	int getPieceCol();

	int getPieceRow();

	int getPieceRotation();


}
