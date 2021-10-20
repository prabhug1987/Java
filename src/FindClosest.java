
public class FindClosest {

	public static void main(String[] args) {
		
		int n = 129, m = 6;

		System.out.println(closestNumber(n, m));
		
		
	}
	
	static int closestNumber(int n , int m) {
		//find the quotient
		int q = n/m;
		
		System.out.println(q);
		//1st possible closest number
		int n1 = m * q;
				
		//2nd possible closest number
		int n2 = (n * m)  > 0 ? (m * (q+1)) : (m * (q-1));
				
		System.out.println(n2);
		 
		if(Math.abs(n - n1) < Math.abs(n-n2)) {
			return n1;
		}
				
		return n2;
	}
}
