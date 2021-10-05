package flappyBird;

import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * own JPanel to cause double buffer
*/
public class Renderer extends JPanel 
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g)
	{
		//calls parent JPanel components 
		super.paintComponent(g);
	
		FlappyBird.flappyBird.repaint(g);
		
	}
	
}
