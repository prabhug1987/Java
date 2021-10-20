import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToMap {
	
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hello");
		list.add("Welcome");
		list.add("Welcome");
		
		list.forEach(System.out::println);
		
		Set<String> set = new HashSet<>(list);
		
		
	}

}
