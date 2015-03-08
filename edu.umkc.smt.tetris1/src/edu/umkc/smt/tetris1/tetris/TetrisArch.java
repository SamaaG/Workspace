package edu.umkc.smt.tetris1.tetris;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.umkc.smt.tetris1.TileType;

public class TetrisArch extends AbstractMyxSimpleBrick
{


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
		return null;
	}

	public int getLevel() {
		// TODO Auto-generated method stub
		return _imp.getLevel();
	}

	public int getScore() {
		// TODO Auto-generated method stub
		return _imp.getScore();
	}

	public boolean isGameOver() {
		// TODO Auto-generated method stub
		return _imp.isGameOver();
	}

	public TileType getNextPieceType() {
		// TODO Auto-generated method stub
		return _imp.getNextPieceType();
		}

	public boolean isPaused() {
		// TODO Auto-generated method stub
		return _imp.isPaused();
	}

	public boolean isNewGame() {
		// TODO Auto-generated method stub
		return _imp.isNewGame();
	}

	public TileType getPieceType() {
		// TODO Auto-generated method stub
		return _imp.getPieceType();
	}

	public int getPieceCol() {
		// TODO Auto-generated method stub
		return _imp.getPieceCol();
	}

	public int getPieceRow() {
		// TODO Auto-generated method stub
		return _imp.getPieceRow();
	}

	public int getPieceRotation() {
		// TODO Auto-generated method stub
		return _imp.getPieceRotation();
	}
}