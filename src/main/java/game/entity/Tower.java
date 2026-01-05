package game.entity;

import java.awt.Graphics ;

import game.Coordinate ;
import game.Game ;

/**
 * This is an abstract superclass for a tower in the game
 */
abstract public class Tower extends AbstractEntity
{
	/* instance variables */
	protected Coordinate position ;				// holds position of tower
	protected double timeSinceLastFire ;	// time since last effect was fired
	
	public Tower(String imageName, Coordinate position, int anchorX, int anchorY) {
		super(imageName, anchorX, anchorY) ;
		this.position = position ;
	}

	/**
	 * 
	 * @param c
	 */
	public void setPosition(Coordinate c) {
		position = c ;
	}

	@Override
	public void draw(Graphics g) {
		// Draws tower object to location specified by user
		g.drawImage(this.image, position.getX() + anchorX, position.getY() + anchorY, null);
		
		// Draws dot on Enemy's (x, y) coordinates
		//g.setColor(Color.WHITE);
		//g.fillOval(position.getX(), position.getY(), 5, 5);	
	}
	
	public abstract void interact(Game game, double deltaTime);
}