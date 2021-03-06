package edu.umkc.tetrisama.major;


import edu.umkc.tetrisama.TileType;
import edu.umkc.tetrisama.major.TetrisArch;

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

	/*
  	  Implementation primitives required by the architecture
	*/
  
    
    public boolean isPaused ()  ;        
    public boolean isNewGame ()  ;        
    public boolean isGameOver ()  ;        
    public TileType getPieceType ()  ;        
    public int getPieceCol ()  ;        
    public int getPieceRow ()  ;        
    public int getPieceRotation ()  ;        
}