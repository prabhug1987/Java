
public class PrintMax {

	public static void main(String[] args) {

		int[] nums = { 3, 34, 23, 37, 5, 6 };
		
		printTwoMaxNumbers(nums);
	}

	static void printTwoMaxNumbers(int[] nums) {
		int max1 = 0;
		int max2 = 0;
		for (int i : nums) {
			if (max1 < i) {
				max2 = max1;
				max1 = i;
			} else if (max2 < i) {
				max2 = i;
			}
		}
		
		System.out.println("First Max Number : " + max1);
		System.out.println("Second Max Number : " + max2);
	}
}
