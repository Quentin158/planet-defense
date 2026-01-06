package game ;

import java.awt.* ;

/**
 * The GamePanel class represents the drawable area on the screen.
 * This class is kept simple, and can be used as-is.
 */
public class GamePanel extends Panel
{
	private static final long serialVersionUID = -266426690684141363L ;
	
	private static final Dimension PANEL_SIZE = new Dimension(800,600) ;

	private Game enclosingGame ;  				// A reference back to the Game object that created 'this' object.
	
	/**
	 * Creates the GamePanel object (which is really just
	 * a JPanel object with a little extra functionality.)
	 * The GamePanel represents a drawable area on the screen.
	 * It has a paint method, and we can listen for events on this
	 * object if we want.
	 * 
	 * @param enclosingGame the Game object that is creating this panel
	 */
	public GamePanel (Game enclosingGame) {
		super() ;
		this.enclosingGame = enclosingGame ;
	}
	
	/**
	 * Redraws the panel.  The panel does not have access to any of the objects
	 * in the game.  (The panel does not have a path object, or a snail object, etc.)
	 * This means the panel cannot directly draw them.  Instead, we'll just have
	 * our panel call back to the Game object, and let the Game object draw
	 * everything.
	 * 
	 * @param g  the Graphics object that corresponds to the panel
	 */
	public void paintComponent (Graphics g) {
		enclosingGame.draw(g) ;
	}
	
	@Override
	public Dimension getMinimumSize () {
		return PANEL_SIZE ;
	}

	@Override
	public Dimension getMaximumSize () {
		return PANEL_SIZE ;
	}

	@Override
	public Dimension getPreferredSize () {
		return PANEL_SIZE ;
	}
}