package edu.umkc.smt.tetrisplugin.clock;



public class ClockImp implements IClockImp
{
	private ClockArch _arch;

    public ClockImp (){
    }

	public void setArch(ClockArch arch){
		_arch = arch;
	}
	public ClockArch getArch(){
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

	@Override
	public void Clock(float cyclesPerSecond) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCyclesPerSecond(float cyclesPerSecond) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPaused(boolean paused) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasElapsedCycle() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
  	  Implementation primitives required by the architecture
	*/
}