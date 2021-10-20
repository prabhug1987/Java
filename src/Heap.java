
// Java program to illustrate
// Heap error
import java.util.*;

public class Heap {
	static List<String> list = new ArrayList<String>();

	public static void main(String args[]) throws Exception {
		// Integer[] array = new Integer[10000 * 10000];

		Map m = new HashMap();

		m = System.getProperties();
		Random r = new Random();

		while (true) {
			m.put(r.nextInt(), "random value");
		}

	}
}