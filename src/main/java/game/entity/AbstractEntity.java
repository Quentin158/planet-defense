package game.entity ;

import java.awt.Graphics ;
import java.awt.Image ;

import game.ImageLoader ;

public abstract class AbstractEntity implements Entity
{
  protected Image image ;
  protected int anchorX ;
	protected int anchorY ;

  public AbstractEntity(String imageName, int anchorX, int anchorY) {
    this.image = ImageLoader.getLoader().getImage(imageName) ;
    this.anchorX = anchorX ;
    this.anchorY = anchorY ;
  }

  @Override
  public abstract void draw(Graphics g) ;
}