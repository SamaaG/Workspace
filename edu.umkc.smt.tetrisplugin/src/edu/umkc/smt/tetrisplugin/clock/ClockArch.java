package edu.umkc.smt.tetrisplugin.clock;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import edu.umkc.smt.tetrisplugin.IClock;

public class ClockArch extends AbstractMyxSimpleBrick
{
    public static final IMyxName msg_IClock = MyxUtils.createName("edu.umkc.smt.tetrisplugin.IClock");

    public IClock OUT_IClock;

	private IClockImp _imp;

    public ClockArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IClockImp getImplementation(){
        try{
			return new ClockImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IClock = (IClock) MyxUtils.getFirstRequiredServiceObject(this,msg_IClock);
        if (OUT_IClock == null){
 			System.err.println("Error: Interface edu.umkc.smt.tetrisplugin.IClock returned null");
			return;       
        }
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
}