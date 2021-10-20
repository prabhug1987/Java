
public class Panagram {
	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(str));
	}

	private static boolean isPanagram(String str) {
		// TODO Auto-generated method stub
		boolean[] seen = new boolean[26];
		int stillNeed = seen.length;
		
		for(int i = 0; i < str.length();i++) {
			char c = Character.toLowerCase(str.charAt(i));
			if(c >= 'a' && c <= 'z' ) {
				if(!seen[c]) {
					seen[c] = true;
					stillNeed--;
					
					if(stillNeed == 0) {
						return true;
					}
				}
			}
		}
				
		return false;
	}

}
