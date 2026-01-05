package game.entity ;

import game.ImageLoader ;
import game.PathPosition ;

/**
 * This class creates a single comet enemy
 */
public class Comet extends Enemy
{
	/**
	 * Constructor
	 */
	public Comet(PathPosition position) {
		super(position, -25, -25, 8) ;
		this.enemy = ImageLoader.getLoader().getImage("comet.png") ;
	}
}