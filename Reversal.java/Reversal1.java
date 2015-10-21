//Diondra A. Whindleton

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Reversal {
	public static void main(String[] args) {
		public static void reverseFile(String input, String output) throws FileNotFoundException {
			try {
				FileReader input = new FileReader ("rats.txt");
				PrinterWriter output = new PrintWriter(writer);
				System.out.print("Guys are rats!");
				System.out.print("Watch out!");
			}
			finally {
		        try {
		            if (output != null) output.close();
		        } catch (Exception e) {
		        }
			}
		}
	}
}
