package edu.umkc.smt.tetrisplugin.tetris;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import edu.umkc.smt.tetrisplugin.IClock;

public class TetrisArch extends AbstractMyxSimpleBrick implements IClock
{
    public static final IMyxName msg_IClock = MyxUtils.createName("edu.umkc.smt.tetrisplugin.IClock");


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
		if (arg0.equals(msg_IClock)){
			return this;
		}        
		return null;
	}
  
    
    public void Clock (float cyclesPerSecond)   {
		_imp.Clock(cyclesPerSecond);
    }    
    public void setCyclesPerSecond (float cyclesPerSecond)   {
		_imp.setCyclesPerSecond(cyclesPerSecond);
    }    
    public void reset ()   {
		_imp.reset();
    }    
    public void update ()   {
		_imp.update();
    }    
    public void setPaused (boolean paused)   {
		_imp.setPaused(paused);
    }    
    public boolean hasElapsedCycle ()   {
		return _imp.hasElapsedCycle();
    }    
}