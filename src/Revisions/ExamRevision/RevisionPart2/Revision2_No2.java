package Revisions.ExamRevision.RevisionPart2;

import java.util.*;
import java.io.*;
		
public class Revision2_No2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			File fobj = new File("Revision2_No2.txt");
			FileWriter fw = new FileWriter(fobj);
			PrintWriter pw = new PrintWriter(fw);	
			while (true) {		
				System.out.print("Enter a word : ");
				String word = input.next();
				if (word.equalsIgnoreCase("STOP")) break;
				pw.println(word);
			}
			pw.close();

			FileReader fr = new FileReader(fobj);
			BufferedReader br = new BufferedReader(fr);
			String readStr;
			String longestWord, shortestWord;
			longestWord = shortestWord = "";
			int longChar, shortChar, avg;
			longChar = shortChar = avg = 0;
			int index = 0;
			while((readStr = br.readLine()) != null) {
				if (index == 0) shortChar = readStr.length();
				if (shortChar >= readStr.length()) {
					shortestWord = readStr;
					shortChar = readStr.length();
				}

				if (longChar <= readStr.length()) {
					longestWord = readStr;
					longChar = readStr.length();
				}
					
				avg += readStr.length();	
				index++;
			}
			br.close();
			System.out.println("The longest word is " + longestWord + " with the length of " + longChar);
			System.out.println("The shortest word is " + shortestWord + " with the length of " + shortChar);
			System.out.println("The average length of words is " + avg/index);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}