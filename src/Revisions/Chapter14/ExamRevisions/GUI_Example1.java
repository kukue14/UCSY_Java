package Revisions.Chapter14.ExamRevisions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI_Example1 extends JFrame implements ActionListener {
	Container container;

	//Name
	JLabel name = new JLabel("Name");
	JTextField nameField = new JTextField(20);

	//Age
	JLabel age = new JLabel("Age");
	JTextField ageField = new JTextField(20);

	//Semester 
	JLabel semester = new JLabel("Semester");
	String[] arraySemester = {"Semester V", "Semester VI", "Semester VII", "Semester VIII"};
	JComboBox semesterBox = new JComboBox(arraySemester);
	
	//Languages
	JLabel language = new JLabel("Can Program in : ");
	String[] textLang = {"C++", "Java", "C#", "Python"};
	JCheckBox[] checkLang;

	//Text Area 
	JTextArea details = new JTextArea(10,20);

	//Button 
	JButton ok = new JButton("OK");
	JButton cancel = new JButton("Cancel");
	
	public GUI_Example1() {
		this.setTitle("GUI Example");
		this.setSize(500,500);
		this.setLocation(100,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		container = getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel firstSection = new JPanel(new GridLayout(0,2));
		firstSection.add(name);
		firstSection.add(nameField);
		
		firstSection.add(age);
		firstSection.add(ageField);
		
		firstSection.add(semester);
		firstSection.add(semesterBox);

		JPanel langPanel = new JPanel(new FlowLayout());
		checkLang = new JCheckBox[textLang.length];
		langPanel.add(language);
		for (int i = 0; i < arraySemester.length; i++) {
			checkLang[i] = new JCheckBox(textLang[i]);
			langPanel.add(checkLang[i]);
		}
		firstSection.add(langPanel);
		
		firstSection.add(details);

		JPanel secondSection = new JPanel(new FlowLayout());
		secondSection.add(ok); ok.addActionListener(this);
		secondSection.add(cancel); cancel.addActionListener(this);

		container.add(firstSection, BorderLayout.CENTER);
		container.add(secondSection, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		GUI_Example1 fobj = new GUI_Example1();
		fobj.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(cancel)) System.exit(0);
		else if (e.getSource().equals(ok)) {
			String name, age, semester, language = "";
			name = nameField.getText();
			age = ageField.getText();
			semester = (String) semesterBox.getSelectedItem();
			for (int i = 0; i < arraySemester.length; i++) {
				if (checkLang[i].isSelected()) {
					language += checkLang[i].getText() + "\n";
				}
			}
			details.setText("Detail Information : " + "\n");
			details.append(name + "\n" + age + "\n" + semester + "\n" + language);
		}
	}

}