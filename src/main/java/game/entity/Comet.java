package game.entity ;

import game.path.PathPosition;

/**
 * This class creates a single comet enemy
 */
public class Comet extends Enemy
{
	/**
	 * Constructor
	 */
	public Comet(PathPosition position) {
		super("comet.png", position, -25, -25, 8) ;
	}
}