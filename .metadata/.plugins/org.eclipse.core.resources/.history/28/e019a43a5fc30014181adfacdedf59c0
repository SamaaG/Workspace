package edu.umkc.smt.tetrisplugin.tetris;


import edu.umkc.smt.tetrisplugin.tetris.TetrisArch;

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
  
    
    public void Clock (float cyclesPerSecond)  ;        
    public void setCyclesPerSecond (float cyclesPerSecond)  ;        
    public void reset ()  ;        
    public void update ()  ;        
    public void setPaused (boolean paused)  ;        
    public boolean hasElapsedCycle ()  ;        
}