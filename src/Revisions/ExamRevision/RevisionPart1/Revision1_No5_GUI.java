package Revisions.ExamRevision.RevisionPart1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Revision1_No5_GUI extends JFrame implements ActionListener {	
	Container contentPane;

	// Book Name
	JLabel bookName = new JLabel("Book Name : ");
	JTextField bookBox = new JTextField(20);
	
	// Author
	JLabel authorName = new JLabel("Author : ");
	JTextField authorBox = new JTextField(20);
		
	// Language
	JLabel language = new JLabel("Language : ");
	String[] lang = {"English", "Chinese", "Japanese"};
	JComboBox langCombo = new JComboBox(lang);

	// Interest
	JLabel interest = new JLabel("Interest : ");
	String[] interestText = {"Art", "Science"};
	JRadioButton[] interestRadio;


	// Type 
	JLabel type = new JLabel("Type : ");
	String[] typeText = {"Journal", "Book"};
	JCheckBox[] typeCheck;

	// Result
	JLabel result = new JLabel("Reult : ");
	JTextArea resultArea = new JTextArea(10,20);

	// Buttons
	JButton search = new JButton("Search");
	JButton clear = new JButton("Clear");
	JButton exit = new JButton("Exit");

	public Revision1_No5_GUI() {
		this.setTitle("Book Searching");
		this.setSize(500,300);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel first = new JPanel(new GridLayout(0,2));
		first.add(bookName);
		first.add(bookBox);
	
		first.add(authorName);
		first.add(authorBox);
		
		first.add(language);
		first.add(langCombo);

		JPanel interestPanel = new JPanel(new GridLayout(1,2));
		first.add(interest);
		interestRadio = new JRadioButton[interestText.length];
		for (int i = 0; i < interestText.length; i++) {
			interestRadio[i] = new JRadioButton(interestText[i]);
			ButtonGroup buttonGroup = new ButtonGroup();
			buttonGroup.add(interestRadio[i]);
			interestPanel.add(interestRadio[i]);
		}
		first.add(interestPanel);

		JPanel typePanel = new JPanel(new GridLayout(1,2));
		first.add(type);
		typeCheck = new JCheckBox[typeText.length];
		for (int i = 0; i < typeText.length; i++) {
			typeCheck[i] = new JCheckBox(typeText[i]);
			typePanel.add(typeCheck[i]);
		}
		first.add(typePanel);

		first.add(result);
		JScrollBar jScrollBar = new JScrollBar();
		JScrollPane jScrollPane = new JScrollPane(resultArea);
		jScrollPane.add(jScrollBar);
		first.add(jScrollPane);

		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(search); search.addActionListener(this);
		buttonPanel.add(clear); clear.addActionListener(this);
		buttonPanel.add(exit); exit.addActionListener(this);
		
		contentPane.add(first, BorderLayout.CENTER);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
	
		
	}
	
	public static void main(String[] args) {
		Revision1_No5_GUI fobj = new Revision1_No5_GUI();
		fobj.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {	
		String interestOne = "";
		String typeOne = "";
		for (int i = 0; i < interestText.length; i++) {
			if (interestRadio[i].isSelected()) interestOne = interestRadio[i].getText();
		}

		for (int i = 0; i < typeText.length; i++) {
			if (typeCheck[i].isSelected()) typeOne += typeCheck[i].getText() + ", ";
		}

		if (e.getSource().equals(search)) {
			resultArea.setText("Do you wnat to search : " +
								"\nName : " + bookBox.getText() +
								"\nAuthor : " + authorBox.getText() +
								"\nLanguage : " + langCombo.getSelectedItem() +
								"\nInterest : " + interestOne +
								"\nType : " + typeOne);

			JOptionPane.showMessageDialog(null, "Do you wnat to search : " +
																		"\nName : " + bookBox.getText() +
																		"\nAuthor : " + authorBox.getText() +
																		"\nLanguage : " + langCombo.getSelectedItem() +
																		"\nInterest : " + interestOne +
																		"\nType : " + typeOne);

		} else if (e.getSource().equals(clear)) {
				bookBox.setText("");
				authorBox.setText("");
				for (int i = 0; i < interestText.length; i++) {
					interestRadio[i].setSelected(false);
				}
				for (int i = 0; i < typeText.length; i++) {
					typeCheck[i].setSelected(false);
				}
				resultArea.setText("");
		} else if (e.getSource().equals(exit)) {
			System.exit(0);
		}
	}
}