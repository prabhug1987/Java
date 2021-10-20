
public class FindMaxDiff {

	public static int maxDiff(int arr[], int size) {
		int maxDiff = arr[1] - arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] -arr[i] >  maxDiff) {
					maxDiff = arr[j] -arr[i];
				}
			}
		}
		return maxDiff;
	}
	public static void main(String[] args) {
		int[] arr = {1,5,2,13,23,45,12};
		System.out.println(maxDiff(arr,arr.length - 1));
		System.out.println(maxDiff2(arr,arr.length - 1));
	}
	
	
	public static int maxDiff2(int arr[], int size) {
		int maxDiff = arr[1] - arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] - min > maxDiff) 
				maxDiff = arr[i] - min;
			if(arr[i] < min)
				min = arr[i];
		}
		
		
		return maxDiff;
	}
	
}
