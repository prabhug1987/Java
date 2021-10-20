import java.util.HashSet;

public class PringDistinct {

	public static void main(String[] args) {
		
		int arr[] = {1,2,2,4,4,55,6,8,9,9,12};
		HashSet set = new HashSet<>();
		
		for(int i = 0; i < arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				System.out.println(arr[i]);
			}
		}
		
	}
}
