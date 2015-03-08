package edu.umkc.smt.tetris1.tetris;


import edu.umkc.smt.tetris1.TileType;
import edu.umkc.smt.tetris1.tetris.TetrisArch;

public interface ITetrisImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (TetrisArch arch);
	public TetrisArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();
	public int getLevel();
	public int getScore();
	public boolean isGameOver();
	public TileType getNextPieceType();
	public boolean isPaused();
	public boolean isNewGame();
	public TileType getPieceType();
	public int getPieceCol();
	public int getPieceRow();
	public int getPieceRotation();

	/*
  	  Implementation primitives required by the architecture
	*/
}