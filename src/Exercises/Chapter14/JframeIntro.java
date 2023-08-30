package Exercises.Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeIntro extends JFrame implements ActionListener {
    Container contentPane;
    JButton button1 = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JButton button3 = new JButton("Button3");
    JButton button4 = new JButton("Button4");
    JButton button5 = new JButton("Button5");
    JframeIntro() {
        this.setTitle("My First GUI");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.blue);
        contentPane = getContentPane();
        contentPane.setBackground(Color.cyan);
        contentPane.setLayout(new GridLayout(2,3)); // FLowLayout, BorderLayout, GridLayout
        contentPane.add(button1);button1.addActionListener(this);
        contentPane.add(button2);button2.addActionListener(this);
        contentPane.add(button3);button3.addActionListener(this);
        contentPane.add(button4);button4.addActionListener(this);
        contentPane.add(button5);button5.addActionListener(this);

//        BorderLayout
//        contentPane.add(button1,BorderLayout.NORTH);
//        contentPane.add(button2,BorderLayout.SOUTH);
//        contentPane.add(button3,BorderLayout.WEST);
//        contentPane.add(button4,BorderLayout.CENTER);
//        contentPane.add(button5,BorderLayout.EAST);
    }

    public static void main(String[] args) {
        JframeIntro myGUI = new JframeIntro();
        myGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button1)) JOptionPane.showMessageDialog(null, "I'm button 1");
        else if (e.getSource().equals(button2)) JOptionPane.showMessageDialog(null, "I'm button 2");
        else if (e.getSource().equals(button3)) {
            String name = JOptionPane.showInputDialog("Enter your name.");
            button4.setText(name);
        }
        else if (e.getSource().equals(button4)) {
//            JOptionPane.
//            JOptionPane.showInputDialog("Please enter your name.");
        }
        else JOptionPane.showMessageDialog(null, "I'm button 5");

        JOptionPane.showInputDialog("Enter a name.");

    }
}
