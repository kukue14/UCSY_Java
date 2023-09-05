package Exercises.Chapter14.Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstApp extends JFrame implements ActionListener {
    Container contentPane;
    JButton button1 = new JButton("OK");
    JButton button2 = new JButton("Clear");
//    JLabel jLabelImage = new JLabel(new ImageIcon("R.png"));

    JLabel jLabel = new JLabel("Enter name");
    JTextField jTextField = new JTextField(10);

    MyFirstApp() {
        this.setTitle("My First App");
        this.setSize(180,300);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
//        contentPane.add(jLabelImage);
        contentPane.add(jLabel);
        contentPane.add(jTextField);
        contentPane.add(button1);button1.addActionListener(this);
        contentPane.add(button2);button2.addActionListener(this);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyFirstApp myFirstApp = new MyFirstApp();
//        myFirstApp.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String str = jTextField.getText();
            JOptionPane.showMessageDialog(null, "Your name is\n" + str);
        } else if (e.getSource() == button2){
            jTextField.setText("");
        }
    }
}
