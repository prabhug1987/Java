
public class PrintOddNumbers {

	public static void main(String[] args) {

		int i = 0, j = 100;

		int[] a = oddNumbers(i, j);
		
		print(a);

	}

	private static void print(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.println("i is "+ i +" value is "+ a[i]);
		}
	}

	private static int[] oddNumbers(int i, int j) {
		// TODO Auto-generated method stub
		int size = (j - i + 1) / 2 ;
        int[] a = new int[size];
        
		int l = 0;
		while (i <= j) {
			//if (i % 2 != 0) {
			if ((1 & i) == 1) {
				//System.out.println(i);
				a[l] = i;
				l++;
			}
			i++;
		}
		
		return a;

	}
}
