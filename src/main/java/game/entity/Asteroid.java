package game.entity ;

import game.ImageLoader ;
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
		super(position, -20, -20, 2) ;
		this.enemy = ImageLoader.getLoader().getImage("asteroid.png") ;
	}
}