package edu.umkc.tetrisama.major;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;
import edu.umkc.tetrisama.ITetris;
import edu.umkc.tetrisama.TileType;

public class TetrisArch extends AbstractMyxSimpleBrick implements ITetris
{
    public static final IMyxName msg_ITetris = MyxUtils.createName("edu.umkc.tetrisama.ITetris");


	private ITetrisImp _imp;

    public TetrisArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected ITetrisImp getImplementation(){
        try{
			return new TetrisImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_ITetris)){
			return this;
		}        
		return null;
	}
  
    
    public boolean isPaused ()   {
		return _imp.isPaused();
    }    
    public boolean isNewGame ()   {
		return _imp.isNewGame();
    }    
    public boolean isGameOver ()   {
		return _imp.isGameOver();
    }    
    public TileType getPieceType ()   {
		return _imp.getPieceType();
    }    
    public int getPieceCol ()   {
		return _imp.getPieceCol();
    }    
    public int getPieceRow ()   {
		return _imp.getPieceRow();
    }    
    public int getPieceRotation ()   {
		return _imp.getPieceRotation();
    }    
}