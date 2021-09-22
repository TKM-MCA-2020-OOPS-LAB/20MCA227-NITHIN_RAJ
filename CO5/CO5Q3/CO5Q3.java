//Find the percentage of marks obtained by a student in 5 subjects. Display a happy face if
//he secures above 50% or a sad face if otherwise.
package javaprograms;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CO5Q3 extends Applet implements ActionListener
{
    TextField t1,t2,t3,t4,t5;
    Button submit;
    Label l1,l2,l3,l4,l5;
    float num1,num2,num3,num4,num5,sum,percentage;
    String str;
    @Override
    public void init()
    {
        setLayout(null);
        setSize(700, 500);
        setBackground(Color.decode("#A4BAB7"));
        setForeground(Color.decode("#080F0F"));
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField();
        l1 = new Label("Mark 1");
        l2 = new Label("Mark 2");
        l3 = new Label("Mark 3");
        l4 = new Label("Mark 4");
        l5 = new Label("Mark 5");
        submit = new Button("Submit");
        l1.setBounds(30,30,100,20);
        t1.setBounds(85,30,100,20);
        l2.setBounds(30,60,100,20);
        t2.setBounds(85,60,100,20);
        l3.setBounds(30,90,100,20);
        t3.setBounds(85,90,100,20);
        l4.setBounds(30,120,100,20);
        t4.setBounds(85,120,100,20);
        l5.setBounds(30,150,100,20);
        t5.setBounds(85,150,100,20);
        submit.setBounds(70, 200, 80, 30);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(submit);
        submit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        str = t1.getText();
        num1 = Float.parseFloat(str);
        str = t2.getText();
        num2 = Float.parseFloat(str);
        str = t3.getText();
        num3 = Float.parseFloat(str);
        str = t4.getText();
        num4 = Float.parseFloat(str);
        str = t5.getText();
        num5 = Float.parseFloat(str);
        sum = num1+num2+num3+num4+num5;
        percentage = (sum*100)/500;
        System.out.println(sum+" "+percentage);
        repaint();
    }
    @Override
    public void paint(Graphics g)
    {
        if(percentage > 50.0){
                g.setColor(Color.decode("#FFE933"));
        	g.fillOval(345,0,300,300);
        	g.setColor(Color.decode("#FF5933"));
        	g.fillOval(425,75,30,30);
        	g.fillOval(535,75,30,30);
        	g.setColor(Color.black);
        	g.fillArc (420,100,150,150,0,-180);
        }
        else {
            g.setColor(Color.decode("#FFE933"));
            g.fillOval(345,0,300,300);
            g.setColor(Color.decode("#FF5933") );
            g.fillOval(395,75,30,30);
            g.fillOval(535,75,30,30);
            g.setColor(Color.black);
            g.drawArc(420,150,150,150,0,180);
        }
    }

}
