package GUI_exe;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class assignment extends JFrame implements ActionListener {


    Container c;

    JTextField nameInput = new JTextField(18);
    JTextArea answerInput = new JTextArea(10,10);
    JButton btnSubmit = new JButton("Submit");
    JLabel label1 = new JLabel("Name : ");
    JLabel label2 = new JLabel("Answer : ");
    assignment(){
        this.setTitle("Assignment");
        this.setSize(400,500);
        this.setLocation(500,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(new GridLayout(2,2));
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(2,2));

        jpanel.add(label1);
        jpanel.add(nameInput);

        jpanel.add(label2);
        jpanel.add(answerInput);

        c.add(jpanel,BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnSubmit.addActionListener(this);
        btnPanel.add(btnSubmit);

        c.add(btnPanel,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        assignment ass = new assignment();
        ass.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        if(e.getSource() == btnSubmit){
            File fobj = new File(nameInput.getText()+".txt");
            try {
                FileWriter fw = new FileWriter(fobj);
                PrintWriter pw = new PrintWriter(fw);

                pw.write(answerInput.getText());
                pw.close();

                System.exit(0);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }


    }
}
