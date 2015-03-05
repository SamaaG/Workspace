package edu.umkc.smt.tetrisplugin.tetris;



public class TetrisImp implements ITetrisImp
{
	private TetrisArch _arch;

    public TetrisImp (){
    }

	public void setArch(TetrisArch arch){
		_arch = arch;
	}
	public TetrisArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
	}
	public void begin(){
		//TODO Auto-generated method stub
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
    
    public void Clock (float cyclesPerSecond)   {
		//TODO Auto-generated method stub
		
    }
    public void setCyclesPerSecond (float cyclesPerSecond)   {
		//TODO Auto-generated method stub
		
    }
    public void reset ()   {
		//TODO Auto-generated method stub
		
    }
    public void update ()   {
		//TODO Auto-generated method stub
		
    }
    public void setPaused (boolean paused)   {
		//TODO Auto-generated method stub
		
    }
    public boolean hasElapsedCycle ()   {
		//TODO Auto-generated method stub
		return false;
    }
}