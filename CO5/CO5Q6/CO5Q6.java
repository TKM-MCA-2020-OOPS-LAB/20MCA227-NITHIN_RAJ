//Develop a program that has a Choice component which contains the names of shapes such
//as rectangle, triangle, square and circle. Draw the corresponding shapes for given
//parameters as per user’s choice.
package javaprograms;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;


public class CO5Q6 extends Applet implements ActionListener
{
    Choice ch = new Choice();
    Label l,shape_label;
    Button b;
    Button draw = new Button("Draw");
    String shape;
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    int flag=0,val1,val2;
//    Graphics g;
    @Override
    public void init()
    {
        setLayout(null);
        l = new Label("Select a shape");
        Button b =new Button("Choose");
        b.setBounds(120, 150, 80, 25);
        l.setBounds(10, 95, 100, 30);
        ch.setBounds(120, 100, 100, 75);
        ch.add("Rectangle");
        ch.add("Triangle");
        ch.add("Circle");
        ch.add("Square");
        add(l);
        add(ch);
        add(b);
        b.addActionListener(this);
    }
    public void rectDraw()
    {
        Label shape_label = new Label("Enter the Length and Breadth");
        shape_label.setBounds(10, 200, 170, 30);
        t1.setBounds(200, 200, 100, 25);
        t2.setBounds(310, 200, 100, 25);
        draw.setBounds(150, 250, 80, 25);
        add(t1);
        add(t2);
        add(shape_label);
        add(draw);
        flag=1;
        draw.addActionListener(this);
    }
    public void triangleDraw()
    {
        Label shape_label = new Label("Enter the Length and Breadth");
        shape_label.setBounds(10, 200, 170, 30);
        t1.setBounds(200, 200, 100, 25);
        t2.setBounds(310, 200, 100, 25);
        draw.setBounds(150, 250, 80, 25);
        add(t1);
        add(t2);
        add(shape_label);
        add(draw);
        flag=2;
        draw.addActionListener(this);
    }
    public void circleDraw()
    {
        Label shape_label = new Label("Enter the size");
        shape_label.setBounds(10, 200, 170, 30);
        t1.setBounds(200, 200, 100, 25);
        draw.setBounds(150, 250, 80, 25);
        add(t1);
        add(shape_label);
        add(draw);
        flag=3;
        draw.addActionListener(this);
    }
    public void squareDraw()
    {
        Label shape_label = new Label("Enter the Length");
        shape_label.setBounds(10, 200, 170, 30);
        t1.setBounds(200, 200, 100, 25);
        draw.setBounds(150, 250, 80, 25);
        add(t1);
        add(shape_label);
        add(draw);
        flag=4;
        draw.addActionListener(this);
    }
    public void rect()
    {
        val1 = Integer.parseInt(t1.getText());
        val2 = Integer.parseInt(t2.getText());
        Graphics g = getGraphics();
        g.setColor(Color.decode("#33D0FF"));
        g.fillRect(200,300,50,val2);
    }
    public void triangle()
    {
        val1 = Integer.parseInt(t1.getText());
        val2 = Integer.parseInt(t2.getText());
        Graphics g = getGraphics();
        g.setColor(Color.decode("#33D0FF"));
        g.fillRect(200,300,val1,val2);
    }
    public void circle()
    {
        val1 = Integer.parseInt(t1.getText());
        Graphics g = getGraphics();
        g.setColor(Color.decode("#FFB033"));
        g.fillOval(200,300,val1,val1);
    }
    public void square()
    {
        val1 = Integer.parseInt(t1.getText());
        Graphics g = getGraphics();
        g.setColor(Color.decode("#FF3333"));
        g.fillRect(200,300,val1,val1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(flag!=0)
        switch(flag)
        {
            case 1: rect();
                    flag=0;
                    break;
            case 2: triangle();
                    flag=0;
                    break;
            case 3: circle();
                    flag=0;
                    break;
            case 4: square();
                    flag=0;
                    break;
            default:System.out.println("Invalid");
        }
        else
        {
            if(ch.getSelectedItem().equals("Rectangle"))
            {
                rectDraw();
            }
            if(ch.getSelectedItem().equals("Triangle"))
            {
                triangleDraw();
            }
            if(ch.getSelectedItem().equals("Circle"))
            {
                circleDraw();
            }
            if(ch.getSelectedItem().equals("Square"))
            {
                squareDraw();
            }
        }
    }
    
}
