package Revisions.Chapter14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIIntro extends JFrame implements ActionListener {
    Container contentPane;
    JButton button1 = new JButton("button1");
    JButton button2 = new JButton("button2");
    JButton button3 = new JButton("button3");
    JButton button4 = new JButton("button4");
    GUIIntro () {
        this.setTitle("First GUI");
        this.setSize(500, 300);
        this.setLocation(100,100);
        this.setVisible(true);
        contentPane = getContentPane();
        contentPane.setBackground(Color.blue);
        contentPane.setLayout(new GridLayout(2,2));
        contentPane.add(button1);button1.addActionListener(this);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
    }

    public static void main(String[] args) {
        GUIIntro guiIntro = new GUIIntro();

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button1)) {
            String str = JOptionPane.showInputDialog("Enter a number : ");
            JOptionPane.showMessageDialog(null, "The length of String is : " +  str.length());
        }
    }
}
