package Lab_Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab_Test2 extends JFrame implements ActionListener {
    Container contentPane;

//    Book Name
    JLabel bookName = new JLabel("Book Name : ");
    JTextField bookNameBox = new JTextField(20);

//    Author Name
    JLabel author = new JLabel("Author : ");
    JTextField authorBox = new JTextField(20);

//    Language
    JLabel language = new JLabel("Language : ");
    String[] arrayLang = {"English", "Myanmar", "Japanese", "Chinese"};
    JComboBox langCombo = new JComboBox(arrayLang);

//    Interest
    JLabel interest = new JLabel("Interest");
    JRadioButton art = new JRadioButton("Art");
    JRadioButton science = new JRadioButton("Science");

//    Type
    JLabel type = new JLabel("Type");
    JCheckBox journal = new JCheckBox("Journal");
    JCheckBox book = new JCheckBox("Book");

//    Result
    JLabel result = new JLabel("Result");
    JTextArea resultBox = new JTextArea(10,20);

//    Buttons
    JButton search = new JButton("Search");
    JButton clear = new JButton("Clear");
    JButton exit = new JButton("Exit");

    Lab_Test2() {
        this.setTitle("Book Searching");
        this.setSize(500,600);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel mainJpanel = new JPanel();
        mainJpanel.setLayout(new GridLayout(7,2));

//        Book Name
        mainJpanel.add(bookName);
        mainJpanel.add(bookNameBox);

//        Author Name
        mainJpanel.add(author);
        mainJpanel.add(authorBox);

//        Language
        mainJpanel.add(language);
        mainJpanel.add(langCombo);

//        Interest
        mainJpanel.add(interest);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(art);
        buttonGroup.add(science);
        JPanel interestJpanel = new JPanel();
        interestJpanel.setLayout(new GridLayout(1,2));
        interestJpanel.add(art);
        interestJpanel.add(science);
        mainJpanel.add(interestJpanel, BorderLayout.CENTER);

//        Type
        mainJpanel.add(type);
        JPanel checkBocJpanel = new JPanel();
        checkBocJpanel.setLayout(new GridLayout(1,2));
        checkBocJpanel.add(journal);
        checkBocJpanel.add(book);
        mainJpanel.add(checkBocJpanel);

//        Result
        mainJpanel.add(result);
        JScrollPane scroller = new JScrollPane(resultBox);
        JScrollBar scrollBar = new JScrollBar();
        scroller.add(scrollBar);
        mainJpanel.add(scroller);


//        Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(search); search.addActionListener(this);
        buttonPanel.add(clear); clear.addActionListener(this);
        buttonPanel.add(exit); exit.addActionListener(this);

        contentPane.add(mainJpanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

    }


    public static void main(String[] args) {
        Lab_Test2 labTest2 = new Lab_Test2();
        labTest2.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {

//            For interest (Radio Button)
            String interestStr = "";
            if (art.isSelected()) interestStr = art.getText();
            if (science.isSelected()) interestStr = science.getText();

//            For type (Check Box)
            String typeStr = "";
            if (journal.isSelected()) typeStr +=  journal.getText();
            if (book.isSelected()) typeStr += ", " + book.getText();

            resultBox.setText("Do you wnat to search : " +
                    "\nName : " + bookNameBox.getText() +
                    "\nAuthor : " + authorBox.getText() +
                    "\nLanguage : " + langCombo.getSelectedItem() +
                    "\nInterest : " + interestStr +
                    "\nType : " + typeStr);
//            Output
            JOptionPane.showMessageDialog(null, 
                    "Do you wnat to search : " +
                            "\nName : " + bookNameBox.getText() +
                            "\nAuthor : " + authorBox.getText() + 
                            "\nLanguage : " + langCombo.getSelectedItem() + 
                            "\nInterest : " + interestStr +
                            "\nType : " + typeStr);
        }

//        Clear Function
        if (e.getSource() == clear) {
            bookNameBox.setText("");
            authorBox.setText("");
            art.setSelected(false);
            science.setSelected(false);
            journal.setSelected(false);
            book.setSelected(false);
            resultBox.setText("");
        }

//        Exit Function
        if (e.getSource() == exit) System.exit(0);
    }
}
