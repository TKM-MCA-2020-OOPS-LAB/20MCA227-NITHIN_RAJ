//Develop a program to handle all mouse events and window events 
package javaprograms;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CO5Q7 extends Applet implements MouseListener,MouseMotionListener
{
    String s = "";
    int x=0,y=0;
    @Override
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        s = "Mouse Clicked";
        repaint();
    }
    @Override
    public void mousePressed(MouseEvent e) {
        s = "Mouse Pressed";
        repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        s = "Mouse Released";
        repaint();
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        s = "Mouse Entered";
        repaint();
    }
    @Override
    public void mouseExited(MouseEvent e) {
        s = "Mouse Exited";
        repaint();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        s = "Mouse Dragged";
        x = e.getX();
        y = e.getY();
        showStatus("Mouse Position: X="+x+" Y="+y);
        repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        s = "Mouse Moved";
        x = e.getX();
        y = e.getY();
        showStatus("Mouse Position: X="+x+" Y="+y);
        repaint();
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawString("Handling Mouse Events",30,20);
        g.drawString(s,60,40);
    }
    

}
