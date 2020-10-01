import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(23);
		a.add(2345);
		a.add("Tushar");
		a.add(23.456);
		a.add(null);
		
		//a.remove(3);
		//a.remove("Tushar");
		
		ArrayList b = new ArrayList<>();
		
		b.add(23);
		b.add("Tushar");
		b.add(345.56);
		
//		System.out.println(b);
		
		//a.addAll(b);
		//System.out.println(a);
		//System.out.println(b);
		//a.removeAll(b);
		
//		System.out.println(a);
//		System.out.println(b);
//		a.retainAll(b);
//		Iterator i =a.iterator();
//		while(i.hasNext()) {
//			System.out.print(" "+ i.next());
//		}
//		
		
		// Trversing using For each loop
//		for(Object o : a) {
//			System.out.print(o+ " ");
//		}
//		
		// Traversing using ListIterator
		ListIterator l =a.listIterator(); 
			while(l.hasNext()) {
				System.out.print(l.next()+" ");	
			}
			System.out.println("\n");
			while(l.hasPrevious()) {
				System.out.print(l.previous()+ " ");
			}
		
	}
}
