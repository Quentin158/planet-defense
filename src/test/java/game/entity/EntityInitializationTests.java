package game.entity ;

import static org.junit.jupiter.api.Assertions.assertEquals ;

import java.util.ArrayList ;
import java.util.List ;

import org.junit.jupiter.api.Test ;

import game.Coordinate ;
import game.PathPosition ;

public class EntityInitializationTests
{
  @Test
  public void testingAlienInitialization() {
    List<Coordinate> points = new ArrayList<>() ;
    points.add(new Coordinate(0, 0)) ;
    
    PathPosition pathPosition = new PathPosition(points) ;

    Alien alien = new Alien(pathPosition) ;

    assertEquals(pathPosition, alien.position) ;
    assertEquals(-20, alien.anchorX) ;
    assertEquals(-20, alien.anchorY) ;
    assertEquals(6, alien.velocity) ;
  }

  @Test
  public void testingAsteroidInitialization() {
    List<Coordinate> points = new ArrayList<>() ;
    points.add(new Coordinate(0, 0)) ;
    
    PathPosition pathPosition = new PathPosition(points) ;

    Asteroid asteroid = new Asteroid(pathPosition) ;

    assertEquals(pathPosition, asteroid.position) ;
    assertEquals(-20, asteroid.anchorX) ;
    assertEquals(-20, asteroid.anchorY) ;
    assertEquals(2, asteroid.velocity) ;
  }

  @Test
  public void testingCometInitialization() {
    List<Coordinate> points = new ArrayList<>() ;
    points.add(new Coordinate(0, 0)) ;
    
    PathPosition pathPosition = new PathPosition(points) ;

    Comet comet = new Comet(pathPosition) ;

    assertEquals(pathPosition, comet.position) ;
    assertEquals(-25, comet.anchorX) ;
    assertEquals(-25, comet.anchorY) ;
    assertEquals(8, comet.velocity) ;
  }
}