package game.entity ;

import game.path.PathPosition;

/**
 * This class creates a single alien enemy
 */
public class Alien extends Enemy 
{
	/**
	 * Constructor
	 */
	public Alien(PathPosition p) {
		super("Alien-Ship.png", p, -20, -20, 6) ;
	}
}