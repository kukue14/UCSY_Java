package Revisions.Chapter14.ExamRevisions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI_BookSearch extends JFrame implements ActionListener {
	Container container;
	
	// Book Name
	JLabel bookName = new JLabel("Book Name : ");
	JTextField bookNameField = new JTextField(20);
	
	// Author 
	JLabel authorName = new JLabel("Author : ");
	JTextField authorField = new JTextField(20);

	// Language 
	JLabel language = new JLabel("Language : ");
	String[] arrayLang = {"English", "Japanese", "Chinese", "Korean"};
	JComboBox comboLang = new JComboBox(arrayLang);

	// Interest
	JLabel interest = new JLabel("Interest : ");
	String[] arrayInterest = {"Art", "Science"};
	JRadioButton[] radioInterest;
	ButtonGroup groupButton;

	// Type
	JLabel type = new JLabel("Type : ");
	String[] arrayType = {"Journal", "Book"};
	JCheckBox[] checkType;

	// Result 
	JLabel result = new JLabel("Result : ");
	JTextArea detail = new JTextArea(10,20);
	
	// Buttons
	JButton search = new JButton("Search");
	JButton clear = new JButton("Clear");
	JButton exit = new JButton("Exit");
	
	public GUI_BookSearch () {
		this.setTitle("Book Searching");
		this.setSize(500, 300);
		this.setLocation(100,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		container = getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel firstSection = new JPanel(new GridLayout(0,2));

		firstSection.add(bookName);
		firstSection.add(bookNameField);
		
		firstSection.add(authorName);
		firstSection.add(authorField);
		
		firstSection.add(language);
		firstSection.add(comboLang);
		
		JPanel interestPanel = new JPanel(new GridLayout(0,2));
		radioInterest = new JRadioButton[arrayInterest.length];
		groupButton = new ButtonGroup();
		for (int i = 0; i < arrayInterest.length; i++) {
			radioInterest[i] = new JRadioButton(arrayInterest[i]);	
			groupButton.add(radioInterest[i]);
			interestPanel.add(radioInterest[i]);
		}
		firstSection.add(interest);
		firstSection.add(interestPanel);

		JPanel typePanel = new JPanel(new GridLayout(0,2));
		checkType = new JCheckBox[arrayType.length];
		for (int i = 0; i < arrayType.length; i++) {
			checkType[i] = new JCheckBox(arrayType[i]);
			typePanel.add(checkType[i]);
		}
		firstSection.add(type);
		firstSection.add(typePanel);
		
		firstSection.add(result);
		JScrollPane jScrollPane = new JScrollPane(detail);
		JScrollBar jScrollBar = new JScrollBar();
		jScrollPane.add(jScrollBar);
		firstSection.add(jScrollPane);
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(search); search.addActionListener(this);
		buttonPanel.add(clear); clear.addActionListener(this);
		buttonPanel.add(exit); exit.addActionListener(this);
		
		container.add(firstSection, BorderLayout.CENTER);
		container.add(buttonPanel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		GUI_BookSearch fobj = new GUI_BookSearch();
		fobj.setVisible(true);	
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(search)) {
			String interestSelect = "";
			for (int i = 0; i < arrayInterest.length; i++) {
				if (radioInterest[i].isSelected()) interestSelect = radioInterest[i].getText();
				break;
			}
			String typeSelect = "";
			int comer = 0;
			for (int i = 0; i < arrayType.length; i++) {	
				if (checkType[i].isSelected()) {
						typeSelect += checkType[i].getText() + ", ";
				}
			}

			detail.setText("Do you want to search : \nName : " + bookNameField.getText() + 
										"\nAuthor : " + authorField.getText() + 
										"\nLanguage : " + comboLang.getSelectedItem() + 
										"\nInterest : " + interestSelect +
										"\nType : " + typeSelect);

			JOptionPane.showMessageDialog(null, "Do you want to search : \nName : " + bookNameField.getText() +
										"\nAuthor : " + authorField.getText() + 
										"\nLanguage : " + comboLang.getSelectedItem() + 
										"\nInterest : " + interestSelect + 
										"\nType : " + typeSelect);
		}

		if (e.getSource().equals(clear)) {	
			bookNameField.setText("");
			authorField.setText("");
			for (JRadioButton aRadio : radioInterest) aRadio.setSelected(false);
			for (JCheckBox aCheck : checkType) aCheck.setSelected(false);
			detail.setText("");
		}
		
		if (e.getSource().equals(exit)) {
			System.exit(0);
		}
	}
}