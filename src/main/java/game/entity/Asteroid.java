package game.entity ;

import game.PathPosition ;

/**
 * This class creates a single comet enemy
 */
public class Asteroid extends Enemy
{
	/**
	 * Constructor
	 */
	public Asteroid(PathPosition position) {
		super("asteroid.png", position, -20, -20, 2) ;
	}
}