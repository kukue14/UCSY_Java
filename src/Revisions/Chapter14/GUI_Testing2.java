package Revisions.Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class GUI_Testing2 extends JFrame implements ActionListener {
    Container contentPane;
    JLabel fileName = new JLabel("File name : ");
    JLabel content = new JLabel("Content : ");

    JTextField fileBox = new JTextField(20);
    JTextArea contentArea = new JTextArea(30,20);

    JButton submit = new JButton("Submit");
    JButton clear = new JButton("Clear");
    JButton exit = new JButton("Exit");
    public GUI_Testing2() {
        this.setTitle("File Record");
        this.setSize(500,200);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2,1));
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(2,2));
        jPanel1.add(fileName);
        jPanel1.add(fileBox);
        jPanel1.add(content);
        jPanel1.add(contentArea);

        JPanel jPanel2 = new JPanel();
        jPanel2.add(submit); submit.addActionListener(this);
        jPanel2.add(clear); clear.addActionListener(this);
        jPanel2.add(exit); exit.addActionListener(this);

        contentPane.add(jPanel1, BorderLayout.CENTER);
        contentPane.add(jPanel2, BorderLayout.SOUTH);



    }

    public static void main(String[] args) {
        GUI_Testing2 obj = new GUI_Testing2();
        obj.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            try {
                File fobj = new File(fileBox.getText() + ".txt");
                if (contentArea.getText().equalsIgnoreCase("RANDOM")) {
                    String stringSize = JOptionPane.showInputDialog("Enter size of byte array.");
                    FileOutputStream fileOutputStream = new FileOutputStream(fobj);
                    int intSize = Integer.parseInt(stringSize);
                    byte[] byteArray = new byte[intSize];
                    for (int i = 0; i < intSize; i++) {
                        byteArray[i] = (byte) ((Math.random()*100) + 1);
                    }
                    fileOutputStream.write(byteArray);
                    fileOutputStream.close();
                } else {
                    FileWriter fw = new FileWriter(fobj);
                    PrintWriter pw = new PrintWriter(fw);

                    pw.write(contentArea.getText());
                    pw.close();
                    JOptionPane.showMessageDialog(null, "File Submitted!");
                }

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }

        if (e.getSource() == clear) {
            fileBox.setText("");
            contentArea.setText("");
        }

        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

}
