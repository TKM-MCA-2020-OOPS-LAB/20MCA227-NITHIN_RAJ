package javaprograms;
//Implement a simple calculator using AWT components.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CO5Q5 extends Applet implements ActionListener
{
    TextField t1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,button_add,button_sub,button_mul,button_div,button_equal,button_clear,button_dot;
    Label l1;
    @Override
    public void init()
    {
        setLayout(null);
        l1 = new Label("Calculator");
        t1 = new TextField();
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        button_add = new Button("+");
        button_sub = new Button("-");
        button_mul = new Button("x");
        button_div = new Button("/");
        button_equal = new Button("=");
        button_clear = new Button("AC");
        button_dot = new Button(".");
        l1.setBounds(50,0,2000,50);
        Font myFont = new Font("Serif",Font.BOLD,50);
        l1.setFont(myFont);
        t1.setBounds(50, 100, 240, 30);
        button_clear.setBounds(290, 100, 80, 30);
        b1.setBounds(50,130,80,30);
        b2.setBounds(130,130,80,30);
        b3.setBounds(210,130,80,30);
        button_add.setBounds(290,130,80,30);
        b4.setBounds(50,160,80,30);
        b5.setBounds(130,160,80,30);
        b6.setBounds(210,160,80,30);
        button_sub.setBounds(290,160,80,30);
        b7.setBounds(50,190,80,30);
        b8.setBounds(130,190,80,30);
        b9.setBounds(210,190,80,30);
        button_mul.setBounds(290,190,80,30);
        button_dot.setBounds(50,220,80,30);
        b0.setBounds(130,220,80,30);
        button_equal.setBounds(210,220,80,30);
        button_div.setBounds(290,220,80,30);
        button_equal.setForeground(Color.decode("#E1F4F1"));
        button_equal.setBackground(Color.decode("#25BA9F"));
        b0.setBackground(Color.decode("#D6D6D6"));
        b1.setBackground(Color.decode("#D6D6D6"));
        b2.setBackground(Color.decode("#D6D6D6"));
        b3.setBackground(Color.decode("#D6D6D6"));
        b4.setBackground(Color.decode("#D6D6D6"));
        b5.setBackground(Color.decode("#D6D6D6"));
        b6.setBackground(Color.decode("#D6D6D6"));
        b7.setBackground(Color.decode("#D6D6D6"));
        b8.setBackground(Color.decode("#D6D6D6"));
        b9.setBackground(Color.decode("#D6D6D6"));
        button_dot.setBackground(Color.decode("#D6D6D6"));
        button_clear.setBackground(Color.decode("#A63A50"));
        button_add.setBackground(Color.decode("#A63A50"));
        button_sub.setBackground(Color.decode("#A63A50"));
        button_mul.setBackground(Color.decode("#A63A50"));
        button_div.setBackground(Color.decode("#A63A50"));
        button_add.setForeground(Color.decode("#E1F4F1"));
        button_sub.setForeground(Color.decode("#E1F4F1"));
        button_mul.setForeground(Color.decode("#E1F4F1"));
        button_div.setForeground(Color.decode("#E1F4F1"));
        button_clear.setForeground(Color.decode("#E1F4F1"));
        add(l1);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(button_dot);
        add(button_equal);
        add(button_add);
        add(button_clear);
        add(button_sub);
        add(button_mul);
        add(button_div);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        button_add.addActionListener(this);
        button_sub.addActionListener(this);
        button_mul.addActionListener(this);
        button_div.addActionListener(this);
        button_dot.addActionListener(this);
        button_clear.addActionListener(this);
        button_equal.addActionListener(this);
    }
    int op = 5;
    boolean flag=false;
    String str1,str2,str_result;
    float num1=0,num2=0,result;
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==b0)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"0");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"0");
            }
        if(e.getSource()==b1)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"1");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"1");
            }
        if(e.getSource()==b2)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"2");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"2");
            }
        if(e.getSource()==b3)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"3");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"3");
            }
        if(e.getSource()==b4)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"4");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"4");
            }
        if(e.getSource()==b5)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"5");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"5");
            }
        if(e.getSource()==b6)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"6");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"6");
            }
        if(e.getSource()==b7)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"7");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"7");
            }
        if(e.getSource()==b8)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"8");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"8");
            }
        if(e.getSource()==b9)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+"9");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+"9");
            }
        if(e.getSource()==button_dot)
            if(flag!=true)
            {
                str1 = t1.getText();
                t1.setText(str1+".");
            }
            else
            {
                str2 = t1.getText();
                t1.setText(str2+".");
            }
        if(e.getSource()==button_clear)
        {
            t1.setText("");
        }
        if(e.getSource()==button_add)
        {
            flag=true;
            op=1;
            num1=Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if(e.getSource()==button_sub)
        {
            flag=true;
            op=2;
            num1=Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if(e.getSource()==button_mul)
        {
            flag=true;
            op=3;
            num1=Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if(e.getSource()==button_div)
        {
            flag=true;
            op=4;
            num1=Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if(e.getSource()==button_equal)
        {
            num2 = Float.parseFloat(t1.getText());
            switch(op)
            {
                case 1: result = num1 + num2;
                        str_result = String.valueOf(num1);
                        str_result += "+";
                        str_result += String.valueOf(num2);
                        str_result += "=";
                        str_result += String.valueOf(result);
                        t1.setText(str_result);
                        break;
                case 2: result = num1 - num2;
                        t1.setText(String.valueOf(result));
                        str_result = String.valueOf(num1);
                        str_result += "-";
                        str_result += String.valueOf(num2);
                        str_result += "=";
                        str_result += String.valueOf(result);
                        t1.setText(str_result);
                        break;
                case 3: result = num1 * num2;
                        str_result = String.valueOf(num1);
                        str_result += "x";
                        str_result += String.valueOf(num2);
                        str_result += "=";
                        str_result += String.valueOf(result);
                        t1.setText(str_result);
                        break;
                case 4: result = num1 / num2;
                        str_result = String.valueOf(num1);
                        str_result += "/";
                        str_result += String.valueOf(num2);
                        str_result += "=";
                        str_result += String.valueOf(result);
                        t1.setText(str_result);
                        break;
                default:t1.setText("Error");
            }
        }
    }   
}
