package Revisions.ExamRevision.RevisionPart1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Revision1_No6_GUI extends JFrame implements ActionListener {
    Container contentPane;

    // Name
    JLabel name = new JLabel("Name");
    JTextField nameField = new JTextField(20);

    // Age
    JLabel age = new JLabel("Age");
    JTextField ageField = new JTextField(20);

    // Gender
    JLabel gender = new JLabel("Gender");
    String[] genderText = {"Male", "Female"};
    JRadioButton[] genderRadio;

    // Intership Area
    JLabel intership = new JLabel("Intership Area");
    JLabel detail = new JLabel();

    // List
    String[] interestArray = {"Programming", "Networking", "Database", "Accounting"};
    JList interest = new JList(interestArray);

    // Buttons
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("CANCEL");

    Revision1_No6_GUI() {
        this.setTitle("GUI Example");
        this.setSize(500, 400);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel first = new JPanel(new GridLayout(0, 2));

        first.add(name);
        first.add(nameField);

        first.add(age);
        first.add(ageField);

        JPanel genderPanel = new JPanel(new GridLayout(1, 3));
        genderPanel.add(gender);
        ButtonGroup buttonGroup = new ButtonGroup();
        genderRadio = new JRadioButton[genderText.length];
        for (int i = 0; i < genderText.length; i++) {
            genderRadio[i] = new JRadioButton(genderText[i]);
            buttonGroup.add(genderRadio[i]);
            genderPanel.add(genderRadio[i]);
        }
        first.add(genderPanel);
        first.add(intership);

        interest.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        first.add(interest);
        first.add(detail);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(ok);
        ok.addActionListener(this);
        buttonPanel.add(cancel);
        cancel.addActionListener(this);

        contentPane.add(first, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);


    }

    public static void main(String[] args) {
        Revision1_No6_GUI fobj = new Revision1_No6_GUI();
        fobj.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(cancel)) System.exit(0);
        else if (e.getSource().equals(ok)) {
            String genderSelect = "";
            for (int i = 0; i < genderText.length; i++) {
                genderSelect = genderRadio[i].getText();
            }

            Object[] list = interest.getSelectedValues();
            String arrayInterest = "";
            for (int i = 0; i < list.length; i++) {
                arrayInterest += (String) list[i] + ", ";
            }
            detail.setText("Detail inforamtion : " + nameField.getText() + " " + ageField.getText() + " " + genderSelect + ": Interested in " + arrayInterest);
        }
    }
}