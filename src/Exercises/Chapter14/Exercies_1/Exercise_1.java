package Exercises.Chapter14.Exercies_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_1 extends JFrame implements ActionListener {
    Container contentPane;
    JLabel jLabel1 = new JLabel("Book Name : ");
    JLabel jLabel2 = new JLabel("Author Name : ");
    JLabel jLabel3 = new JLabel("Language : ");
    JLabel jLabel4 = new JLabel("Genre : ");
    JLabel jLabel5 = new JLabel("Content : ");
    JLabel jLabel6 = new JLabel("Type : ");
    JTextField name = new JTextField(20);
    JTextField author = new JTextField(20);
    String[] lang = {"English (US)", "English (UK)", "Myanmar", "Japanese", "Chinese"};
    JComboBox language = new JComboBox(lang);
    JRadioButton jRadioButton1 = new JRadioButton("Art");
    JRadioButton jRadioButton2 = new JRadioButton("Science");
    ButtonGroup buttonGroup = new ButtonGroup();
    JCheckBox jCheckBox1 = new JCheckBox("Novel");
    JCheckBox jCheckBox2 = new JCheckBox("Journal");
    JCheckBox jCheckBox3 = new JCheckBox("Magazine");
    JCheckBox jCheckBox4 = new JCheckBox("Book");
    JTextArea jTextArea = new JTextArea(10,20);
    JButton jButton1 = new JButton("Search");
    JButton jButton2 = new JButton("Clear");
    JButton jButton3 = new JButton("Exit");
    public Exercise_1() {
        this.setTitle("Book searching");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(100,100);
        contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(7,2));
        contentPane.add(jLabel1); contentPane.add(name);
        contentPane.add(jLabel2); contentPane.add(author);
        contentPane.add(jLabel3); contentPane.add(language);

        JPanel jPanel = new JPanel();
        jPanel.add(jRadioButton1); jPanel.add(jRadioButton2);
        buttonGroup.add(jRadioButton1); buttonGroup.add(jRadioButton2);
        contentPane.add(jLabel4); contentPane.add(jPanel);

        JPanel jPanel1 = new JPanel();
        jPanel1.add(jCheckBox1);jPanel1.add(jCheckBox2);jPanel1.add(jCheckBox3);jPanel1.add(jCheckBox4);
        contentPane.add(jLabel5); contentPane.add(jPanel1);
        contentPane.add(jLabel6); contentPane.add(jTextArea);

        JPanel jPanel2 = new JPanel();
        jPanel2.add(jButton1); jPanel2.add(jButton2); jPanel2.add(jButton3);
        contentPane.add(jPanel2);
    }

    public static void main(String[] args) {
        Exercise_1 exercise1 = new Exercise_1();
        exercise1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
