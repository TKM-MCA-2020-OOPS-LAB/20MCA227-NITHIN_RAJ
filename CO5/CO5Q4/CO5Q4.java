//Using 2D graphics commands in an Applet, construct a house. On mouse click event,
//change the color of the door from blue to red. 
package javaprograms;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CO5Q4 extends Applet implements MouseListener
{
    int a, b;
	public void init() {
		addMouseListener(this);
		}
	public void paint (Graphics g) {
		
		int x[]= {200,300,400};
		int y[]= {200,20,200};
		
		g.setColor(Color.decode("#4361EE"));
		g.fillPolygon(x,y,3);
		g.setColor(Color.decode("#4CC9F0"));
		g.fillRect(200, 200, 200, 275);
		g.setColor(Color.decode("#7209B7"));
		g.fillRect(275, 275, 50, 200);
		
		if(a>269 && a<321 && b>275 && b<470) {
            g.setColor(Color.decode("#F72585"));
            g.fillRect(275, 275, 50, 200);
        }
		
	}

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        a=e.getX();
        b=e.getY();
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
