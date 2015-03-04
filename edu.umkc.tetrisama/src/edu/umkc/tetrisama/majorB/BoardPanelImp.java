package edu.umkc.tetrisama.majorB;

import edu.umkc.tetrisama.ITetris;



public class BoardPanelImp implements IBoaedPanelImp
{
	private BoardPanelArch _arch;

	ITetris tetris;
    public BoardPanelImp (){
    }

	public void setArch(BoardPanelArch arch){
		_arch = arch;
	}
	public BoardPanelArch getArch(){
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
		tetris = _arch.OUT_ITetris;
		
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
}