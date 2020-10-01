import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set a = new HashSet();
		a.add(123);
		a.add("Tushar_Hash");
		a.add(34.567);
		a.add("Tushar");
		a.add("Tushar");//only unique values
//		System.out.println(a);
		
		//LinkedList Hash Set
		
		Set a1 = new LinkedHashSet();
		a1.add(123);
		a1.add("Tushar");
		a1.add(34.567);
	
//		System.out.println(a1);
		
//		for(Object o : a1) {
//			System.out.print(o+" ");
//		}
		Iterator i1 = a.iterator();
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");
		}
	}
}
