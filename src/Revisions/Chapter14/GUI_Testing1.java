package Revisions.Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class GUI_Testing1 extends JFrame implements ActionListener {
    Container contentPane;

//    JLabels
    JLabel bookName = new JLabel("Book name : ");
    JLabel authorName = new JLabel("Author name : ");
    JLabel language = new JLabel("Language : ");
    JLabel genre = new JLabel("Genre : ");
    JLabel type = new JLabel("Type : ");
    JLabel content = new JLabel("Content : ");

//    JTextField
    JTextField bookBox = new JTextField(20);
    JTextField authorBox = new JTextField(20);

//    JComboBox
    String[] lang = {"English (US)", "English (UK)", "Chinese", "Japanes", "Burmese"};
    JComboBox languageSelect = new JComboBox(lang);

//    JRadioButton
    JRadioButton art = new JRadioButton("Art");
    JRadioButton science = new JRadioButton("Science");

//    JCheckBox
    JCheckBox novel = new JCheckBox("Novel");
    JCheckBox journal = new JCheckBox("Journal");
    JCheckBox magazine = new JCheckBox("Magazine");
    JCheckBox book = new JCheckBox("Book");

//    JTextArea
    JTextArea contentArea = new JTextArea(10,20);

//    JButton
    JButton search = new JButton("Search");
    JButton clear = new JButton("Clear");
    JButton exit = new JButton("Exit");

    ButtonGroup buttonGroup = new ButtonGroup();

    GUI_Testing1() {
        this.setTitle("Book Searching");
        this.setSize(800,600);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2,2));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6,2));
//        Book Name
        mainPanel.add(bookName);
        mainPanel.add(bookBox);

//        Authot Name
        mainPanel.add(authorName);
        mainPanel.add(authorBox);

//        Language
        mainPanel.add(language);
        mainPanel.add(languageSelect);

//        JRadioButton
        mainPanel.add(genre);
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(1,2));
        radioPanel.add(art);
        radioPanel.add(science);
        buttonGroup.add(art);
        buttonGroup.add(science);
        mainPanel.add(radioPanel);

//        JCheckBox
        mainPanel.add(type);
        JPanel checkPanel = new JPanel();
        checkPanel.setLayout(new GridLayout(1,4));
        checkPanel.add(novel);
        checkPanel.add(journal);
        checkPanel.add(magazine);
        checkPanel.add(book);
        mainPanel.add(checkPanel);

//        Content Area
        mainPanel.add(content);
        mainPanel.add(contentArea);

//        JButton
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(search); search.addActionListener(this);
        buttonPanel.add(clear); clear.addActionListener(this);
        buttonPanel.add(exit); exit.addActionListener(this);
        contentPane.add(mainPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String radioStr = "", checkStr = "";

//        Getting info from radio button
        if (art.isSelected()) radioStr = art.getText();
        if (science.isSelected()) radioStr = science.getText();

//        Getting info from check box button
        if (novel.isSelected()) checkStr += ", " + novel.getText();
        if (journal.isSelected()) checkStr += ", " + journal.getText();
        if (magazine.isSelected()) checkStr += ", " + magazine.getText();
        if (book.isSelected()) checkStr += ", " + book.getText();

        if (e.getSource() == search) {
            JOptionPane.showMessageDialog(null,
                    "Book Name : " + bookName.getText() +
                            "\nAuthor Name : " + authorName.getText() +
                            "\nLanguage : " + languageSelect.getSelectedItem() +
                            "\nGenre : " + radioStr +
                            "\nType : " + checkStr +
                            "\nContent : " + contentArea.getText()
            );
        }

        if (e.getSource() == clear) {
            bookBox.setText("");
            authorBox.setText("");
            art.setSelected(false);
            science.setSelected(false);
            novel.setSelected(false);
            journal.setSelected(false);
            magazine.setSelected(false);
            book.setSelected(false);
            contentArea.setText("");
        }

        if (e.getSource() == exit) {
            JOptionPane.showMessageDialog(null, "Are you sure?");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        GUI_Testing1 mainObj = new GUI_Testing1();
        mainObj.setVisible(true);
    }
}

