package javaprograms;
//Program to find maximum of three numbers using AWT.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CO5Q2 extends Applet implements ActionListener
{
        TextField t1,t2,t3,result;
        Button result_button;
        Label l1,l2,l3,result_label,title;
    public void init()
    {
        setLayout(null);
        setBackground(Color.decode("#A4BAB7"));
        setForeground(Color.decode("#080F0F"));
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        result = new TextField();
        l1 = new Label("Num 1");
        l2 = new Label("Num 2");
        l3 = new Label("Num 3");
        title = new Label("Enter three numbers");
        result_label = new Label("Maximum Number");
        result_button = new Button("SUBMIT");
        title.setBounds(10,0,200,20);
        l1.setBounds(75,30,100,20);
        t1.setBounds(50,50,100,20);
        l2.setBounds(195,30,100,20);
        t2.setBounds(170,50,100,20);
        l3.setBounds(315,30,100,20);
        t3.setBounds(290,50,100,20);
        result_label.setBounds(170,80,110,20);
        result.setBounds(170,100,100,20);
        result_button.setBounds(180,130,80,30);
        add(t1);
        add(t2);
        add(t3);
        add(result_label);
        add(result);
        add(result_button);
        add(l1);
        add(l2);
        add(l3);
        add(title);
        result_button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        float num1,num2,num3;
        String str;
        str = t1.getText();
        num1 = Float.parseFloat(str);
        str = t2.getText();
        num2 = Float.parseFloat(str);
        str = t3.getText();
        num3 = Float.parseFloat(str);
        if(num1>num2 && num1>num3)
            result.setText(num1+"");
        else if(num2>num1 && num2>num3)
            result.setText(num2+"");
        else
            result.setText(num3+"");

    }
}
