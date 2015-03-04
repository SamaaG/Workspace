package edu.umkc.tetrisama;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;

/**
 * The {@code Tetris} class is responsible for handling much of the game logic and
 * reading user input.
 * @author Brendan Jones
 *
 */
public class Tetris extends JFrame {

	
		
	/**
	 * Creates a new Tetris instance. Sets up the window's properties,
	 * and adds a controller listener.
	 */
	public Tetris() {
		/*
		 * Set the basic properties of the window.
		 */
		super("Tetris");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		/*
		 * Initialize the BoardPanel and SidePanel instances.
		 */
		this.board = new BoardPanel(this);
		this.side = new SidePanel(this);
		
		/*
		 * Add the BoardPanel and SidePanel instances to the window.
		 */
		add(board, BorderLayout.CENTER);
		add(side, BorderLayout.EAST);
		
		/*
		 * Adds a custom anonymous KeyListener to the frame.
		 */
		
			
			
	
	/**
	 * Starts the game running. Initializes everything and enters the game loop.
	 */
	
	
	/**
	 * Updates the game and handles the bulk of it's logic.
	 */
	
	
	/**
	 * Forces the BoardPanel and SidePanel to repaint.
	 */
	
	
	/**
	 * Resets the game variables to their default values at the start
	 * of a new game.
	 */
	
		
	/**
	 * Spawns a new piece and resets our piece's variables to their default
	 * values.
	 */
	

	/**
	 * Attempts to set the rotation of the current piece to newRotation.
	 * @param newRotation The rotation of the new peice.
	 */
	
	
	/**
	 * Checks to see whether or not the game is paused.
	 * @return Whether or not the game is paused.
	 */
	
	
	/**
	 * Checks to see whether or not the game is over.
	 * @return Whether or not the game is over.
	 */
	
	
	/**
	 * Checks to see whether or not we're on a new game.
	 * @return Whether or not this is a new game.
	 */
	
	
	/**
	 * Gets the current score.
	 * @return The score.
	 */
	
	
	/**
	 * Gets the column of the current piece.
	 * @return The column.
	 */
	
	
	/**
	 * Gets the row of the current piece.
	 * @return The row.
	 */
	
	
	/**
	 * Gets the rotation of the current piece.
	 * @return The rotation.
	 */
	


}
