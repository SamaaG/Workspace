package edu.umkc.smt.tetrisplugin;

public interface IClock {
	public void Clock(float cyclesPerSecond);
	public void setCyclesPerSecond(float cyclesPerSecond);
	public void reset();
	public void update();
	public void setPaused(boolean paused);
	public boolean hasElapsedCycle();
}
