package edu.umkc.tetrisama.major;

import edu.umkc.tetrisama.Tetris;



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
		Tetris tetris = new Tetris();
		tetris.startGame();
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