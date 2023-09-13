package Revisions.Chapter12.SpecialProblems.GUI_Palindrome;

import Revisions.Chapter12.SpecialProblems.String_Palindrome.StringPalindromeRead;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Palindrome extends JFrame implements ActionListener {
    Container contentPane;
    JLabel text = new JLabel("Text : ");
    JTextField textBox = new JTextField(20);
    JLabel output = new JLabel("Output : ");
    JTextField outputBox = new JTextField(20);
    JButton submit = new JButton("Submit");
    JButton clear = new JButton("Clear");
    JButton exit = new JButton("Exit");
    GUI_Palindrome() {
        this.setTitle("Palindrome Checker");
        this.setSize(500, 500);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2,1));
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(2,2));
        jPanel1.add(text);
        jPanel1.add(textBox);
        jPanel1.add(output);
        jPanel1.add(outputBox);

        JPanel jPanel2 = new JPanel();
        jPanel2.add(submit); submit.addActionListener(this);
        jPanel2.add(clear); clear.addActionListener(this);
        jPanel2.add(exit); exit.addActionListener(this);

        contentPane.add(jPanel1, BorderLayout.CENTER);
        contentPane.add(jPanel2, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        GUI_Palindrome gui = new GUI_Palindrome();
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            StringPalindromeRead stringPalindromeRead = new StringPalindromeRead();
            if (stringPalindromeRead.isPalindrome(textBox.getText())) outputBox.setText("This is Palindrome.");
            else outputBox.setText("This is not Palindrome.");
        }

        if (e.getSource() == clear) {
            textBox.setText("");
            outputBox.setText("");
        }

        if (e.getSource() == exit) {
            System.exit(0);
        }
    }
}

