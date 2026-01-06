package game.panel ;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test ;

import game.GamePanel ;

public class GamePanelSizeTests
{
  @Test
  public void testingGamePanelMinimumSize() {
    GamePanel panel = new GamePanel(null) ;

    assertEquals(800, panel.getMinimumSize().width) ;
    assertEquals(600, panel.getMinimumSize().height) ;
  }

  @Test
  public void testingGamePanelPreferredSize() {
    GamePanel panel = new GamePanel(null) ;

    assertEquals(800, panel.getPreferredSize().width) ;
    assertEquals(600, panel.getPreferredSize().height) ;
  }

  @Test
  public void testingGamePanelMaximumSize() {
    GamePanel panel = new GamePanel(null) ;

    assertEquals(800, panel.getMaximumSize().width) ;
    assertEquals(600, panel.getMaximumSize().height) ;
  }
}