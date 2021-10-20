
public class TestChars {

	static final  int ASCII_SIZE = 256;
	public static void main(String[] args) {
		String str = "example";
		System.out.println("maximum occuring char is "+ getMaxOccuringChars(str));
	}
	private static char getMaxOccuringChars(String str) {
		// TODO Auto-generated method stub
		
		int[] count = new int[ASCII_SIZE];
		
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		int max = -1;
		char result = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			if(max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
				System.out.println(result);
			}
		}
		
		System.out.println(result);
		
		return result;
	}
}
