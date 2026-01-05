package game.entity ;

public abstract class Entity
{
  protected int anchorX ;
	protected int anchorY ;

  public Entity(int anchorX, int anchorY) {
    this.anchorX = anchorX ;
    this.anchorY = anchorY ;
  }
}