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
    JLabel jLabel5 = new JLabel("Type : ");
    JLabel jLabel6 = new JLabel("Content : ");
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
    JButton search = new JButton("Search");
    JButton clear = new JButton("Clear");
    JButton exit = new JButton("Exit");
    public Exercise_1() {
        this.setTitle("Book searching");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(100,100);
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel main = new JPanel();
        main.setLayout(new GridLayout(6,2));
        main.add(jLabel1); main.add(name);
        main.add(jLabel2); main.add(author);
        main.add(jLabel3); main.add(language);

//        JPanel main = new JPanel();
//        main.setLayout(new GridLayout(6,2));
//        main.add(jLabel1); main.add(name);
//        main.add(jLabel2); main.add(author);
//        main.add(jLabel3); main.add(language);
        JPanel jPanel = new JPanel();
        jPanel.add(jRadioButton1); jPanel.add(jRadioButton2);
        buttonGroup.add(jRadioButton1); buttonGroup.add(jRadioButton2);
        main.add(jLabel4); main.add(jPanel);

        JPanel jPanel1 = new JPanel();
        jPanel1.add(jCheckBox1);jPanel1.add(jCheckBox2);jPanel1.add(jCheckBox3);jPanel1.add(jCheckBox4);
        main.add(jLabel5); main.add(jPanel1);
        main.add(jLabel6); main.add(jTextArea);

        JPanel jPanel2 = new JPanel();
        jPanel2.add(search); search.addActionListener(this);
        jPanel2.add(clear); clear.addActionListener(this);
        jPanel2.add(exit); exit.addActionListener(this);
        contentPane.add(jPanel2);

        contentPane.add(main, BorderLayout.CENTER);
        contentPane.add(jPanel2, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Exercise_1 exercise1 = new Exercise_1();
        exercise1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        Radio Function
        String radioButtonName, checkBoxName = "";
        if (jRadioButton1.isSelected()) radioButtonName = jRadioButton1.getText();
        else radioButtonName = jRadioButton2.getText();

//        Checkbox Function
        if (jCheckBox1.isSelected()) checkBoxName += ", " + jCheckBox1.getText();
        if (jCheckBox2.isSelected()) checkBoxName += ", " + jCheckBox2.getText();
        if (jCheckBox3.isSelected()) checkBoxName += ", " + jCheckBox3.getText();
        if (jCheckBox4.isSelected()) checkBoxName += ", " + jCheckBox4.getText();

//        Exit Function
        if (e.getSource() == exit) {
            JOptionPane.showMessageDialog(null, "Are you sure?");
            System.exit(0);
        }

//        Clear Function
        else if (e.getSource() == clear) {
            name.setText("");
            author.setText("");
            jTextArea.setText("");

//            Search Function
        } else if (e.getSource() == search) {
            JOptionPane.showMessageDialog(null,
                    "Name : " + name.getText() +
                            "\nAuthor : " + author.getText() +
                            "\nLanguage : " + language.getSelectedItem() +
                            "\nGenre : " + radioButtonName +
                            "\nType : " + checkBoxName +
                            "\nContent : " + jTextArea.getText());
        }
    }
}
