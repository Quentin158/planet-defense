package game ;

import java.awt.event.MouseEvent ;
import java.awt.event.MouseListener ;
import java.awt.event.MouseMotionListener ;

import javax.swing.JPanel ;

public class Panel extends JPanel implements MouseListener, MouseMotionListener
{
	public Coordinate mouseCoordinates = new Coordinate(0, 0) ;
	public boolean mouseIsPressed ;

	public Panel() {
		this.addMouseListener(this) ; 				// Listen to our own mouse events.
		this.addMouseMotionListener(this) ;		// Listen to mouse movements
	}

	/* MouseListener methods */

	@Override
	public void mouseClicked(MouseEvent e) {
		updateMousePosition(e) ;
		mouseIsPressed = true ;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		updateMousePosition(e) ;
		mouseIsPressed = false ;
	}

	@Override
	public void mouseExited(MouseEvent e) {
		updateMousePosition(e) ;
		mouseIsPressed = false ;
	}

	@Override
	public void mouseDragged(MouseEvent e) {	
		updateMousePosition(e) ;
		mouseIsPressed = false ;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		updateMousePosition(e) ;
		mouseIsPressed = false ;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseIsPressed = true ;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseIsPressed = true ;
	}

	private void updateMousePosition(MouseEvent e) {
		this.mouseCoordinates.setX(e.getX()) ;
		this.mouseCoordinates.setY(e.getY()) ;
	}
}