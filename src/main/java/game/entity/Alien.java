package game.entity ;

import game.ImageLoader ;
import game.PathPosition ;

/**
 * This class creates a single alien enemy
 */
public class Alien extends Enemy 
{
	/**
	 * Constructor
	 */
	public Alien(PathPosition p) {
		super(p, -20, -20, 6) ;
		this.enemy = ImageLoader.getLoader().getImage("Alien-Ship.png") ;
	}
}