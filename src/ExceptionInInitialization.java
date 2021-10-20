import java.util.Enumeration;
import java.util.Hashtable;

public class ExceptionInInitialization {
	public static void main(String[] args) {
	   System.out.println("test");	
	   
	   Hashtable hashMap = new Hashtable();
	   Enumeration enumeration = hashMap.elements();
	   enumeration.nextElement();
	   
	}
}
