//Program to draw Circle, Rectangle, Line in Applet. 
package javaprograms;

import java.applet.*;
import java.awt.*;


public class CO5Q1 extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Line",10,20);
        g.setColor(Color.decode("#FF3333"));
        g.drawLine(20, 40, 200, 40);
        g.setColor(Color.black);
        g.drawString("Circle", 10, 70);
        g.setColor(Color.decode("#FFB033"));
        g.drawOval(20, 90, 70, 70);
        g.fillOval(100, 90, 70, 70);
        g.setColor(Color.black);
        g.drawString("Rectangle", 10, 210);
        g.setColor(Color.decode("#33D0FF"));
        g.drawRect(20, 240, 100, 100);
        g.fillRect(130, 240, 100, 100);
    }
}
