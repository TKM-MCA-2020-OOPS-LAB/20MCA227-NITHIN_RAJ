//Develop a program to handle Key events
package javaprograms;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CO5Q8 extends Applet implements KeyListener 
{
    String msg="";
    TextField t1;
    @Override
    public void init()
    {
        setLayout(null);
        addKeyListener(this);
        t1 = new TextField();
        t1.setBounds(50,50,100,20);
        t1.addKeyListener(this);
        add(t1);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        msg+= e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("Key released");
    }
    @Override
    public void paint(Graphics g)
    {
        
    }
    
}
