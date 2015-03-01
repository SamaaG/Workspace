/**
 * 
 */
package edu.umkc.tetrisama;

/**
 * @author Samaa
 *
 */
public interface ITetris {
public boolean isPaused();
public boolean isNewGame();
public boolean isGameOver();
public TileType getPieceType();
public int getPieceCol();
public int getPieceRow();
public int getPieceRotation();
}
