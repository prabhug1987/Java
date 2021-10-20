import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class ConvertToCipher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int key = sc.nextInt();

		convertString(str, key);
	}

	private static void convertString(String str, int key) {
		// TODO Auto-generated method stub
		char chars[] = new char[1000];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isLetter(c)) {

				if (Character.isUpperCase(c)) {
					char upperc = (char) ((((c - 65) + key) % 26) + 65);
					System.out.print(upperc);
				} else {
					char lowerc = (char) ((((c - 97) + key) % 26) + 97);
					System.out.print(lowerc);
				}
			} else if (Character.isDigit(c)) {
				char intc = (char) ((((c - 48) + key) % 10) + 48);
				System.out.print(intc);
			} else {
				System.out.print(c);
			}
		}

	}

}
