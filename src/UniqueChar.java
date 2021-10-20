import java.util.Scanner;

public class UniqueChar {
	
	public static void main(String[] args) {
		
		String str = "welcome";
		printUniqueChars(str);
	}

	private static void printUniqueChars(String str) {
		// TODO Auto-generated method stub
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			System.out.println(str.indexOf(current));
			if(temp.indexOf(current) < 0) {
				temp += current;
			}
			else {
				temp = temp.replace(String.valueOf(current), "");
			}
			System.out.println(temp);	
		}
		
		
	}

}
