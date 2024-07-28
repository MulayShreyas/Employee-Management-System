package Employee_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Front_page extends JFrame implements ActionListener{
    Front_page(){
        getContentPane().setBackground(Color.white);
        setSize(1300, 800);
        setLocation(300,100);
        setVisible(true);
        setLayout(null);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(80, 30,1200,75);
        heading.setFont(new Font("calibri",Font.PLAIN,70));
        heading.setForeground(Color.RED);
        add(heading);

        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        image.setBounds(50, 100, 1200, 500);
        add(image);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);


        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);

        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){

            }

            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){

            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String args[]){
        new Front_page();
    }
}
