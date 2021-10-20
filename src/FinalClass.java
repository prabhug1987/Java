import java.util.HashMap;
import java.util.Iterator;

public final class FinalClass {

	private final int id;
	private final String name;
	private final HashMap<String, String> testMap;

	public FinalClass(int id, String name, HashMap<String, String> testMap) {
		super();
		this.id = id;
		this.name = name;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> it = testMap.keySet().iterator();
		while (it.hasNext()) {
			key = it.next();
			tempMap.put(key, testMap.get(key));
		}
		this.testMap = tempMap;
	}

	/**
	 * Constructor performing Shallow Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */
	/**
	 * public FinalClassExample(int i, String n, HashMap<String,String> hm){
	 * System.out.println("Performing Shallow Copy for Object initialization");
	 * this.id=i; this.name=n; this.testMap=hm; }
	 */

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}