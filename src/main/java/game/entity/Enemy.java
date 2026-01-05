package game.entity ;

import java.awt.Graphics ;
import java.awt.Image ;

import game.Coordinate ;
import game.PathPosition ;

/**
 * This is an abstract superclass for an enemy in the game
 */
public abstract class Enemy 
{
	/* instance variables */
	protected PathPosition position ;	// holds current position of enemy
	protected Image enemy ;						// holds image of enemy
	protected int anchorX ;						// shifts position on x axis
	protected int anchorY ;						// shifts position on y axis
	protected double velocity ; 			// increases or decreases advance speed

	/**
	 * Advances the position of the enemy.
	 */
	public void advance() {
		position.advance(10 + velocity) ;	// advances position 10 units plus velocity
	}
	
	/**
	 * Draws the enemy to the screen.
	 * @param g Graphics
	 */
	public void draw(Graphics g) {
		// Draws Enemy object
		Coordinate c = position.getCoordinate() ;
		g.drawImage(enemy, c.x + anchorX, c.y + anchorY, null) ;
		
		// Draws dot on Enemy's (x, y) coordinates
		//g.setColor(Color.WHITE);
		//g.fillOval(c.x, c.y, 5, 5);
	}
	
	/**
	 * Gives the position of the entity.
	 * @return a {@code PathPosition} object
	 */
	public PathPosition getPosition() {
		return position ;
	}	
}