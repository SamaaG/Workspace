package edu.umkc.smt.tetris1.tetris;

public interface IClock {

	void setCyclesPerSecond(float f);

	void setPaused(boolean isPaused);

	void reset();

	void update();

}
