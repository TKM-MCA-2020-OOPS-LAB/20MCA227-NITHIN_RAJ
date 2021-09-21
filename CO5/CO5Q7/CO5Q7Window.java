//Develop a program to handle all mouse events and window events
package javaprograms;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class CO5Q7Window extends Frame implements WindowListener
{
    public CO5Q7Window()
    {
        addWindowListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing....");
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window not Minimized");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window is active");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window is deactive");
    }
    public static void main(String[] args) {
        CO5Q7Window obj = new CO5Q7Window();
    }
}
