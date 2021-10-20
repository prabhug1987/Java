
class One {

	public One(int x, int y) {
		// TODO Auto-generated constructor stub
	}
}

class Two extends One{
	int x;
	public Two(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
}

public class MyTest{
	public static void main(String[] args) {
		Two two = new Two(0, 0);
		two.x = 100;
		System.out.println(two.x);	}
}