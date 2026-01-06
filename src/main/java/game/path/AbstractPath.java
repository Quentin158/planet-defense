package game.path ;

import java.util.List ;

import game.Coordinate ;

public abstract class AbstractPath
{
  protected List<Coordinate> path ;

  public AbstractPath(List<Coordinate> path) {
    this.path = path ;
  }
}