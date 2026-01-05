package game.entity;

import java.awt.Graphics ;
import java.awt.Image ;

import game.Coordinate ;
import game.Game ;

/**
 * This is an abstract superclass for a tower in the game
 */
abstract public class Tower extends Entity
{
	/* instance variables */
	protected Coordinate position ;				// holds position of tower
	protected Image tower ; 							// holds tower image
	protected double timeSinceLastFire ;	// time since last effect was fired
	
	public Tower(Coordinate position, int anchorX, int anchorY) {
		super(anchorX, anchorY) ;
		this.position = position ;
	}

	/**
	 * 
	 * @param c
	 */
	public void setPosition(Coordinate c) {
		position = c ;
	}

	public void draw(Graphics g) {
		// Draws tower object to location specified by user
		g.drawImage(tower, position.getX() + anchorX, position.getY() + anchorY, null);
		
		// Draws dot on Enemy's (x, y) coordinates
		//g.setColor(Color.WHITE);
		//g.fillOval(position.getX(), position.getY(), 5, 5);	
	}
	
	public abstract void interact(Game game, double deltaTime);
}