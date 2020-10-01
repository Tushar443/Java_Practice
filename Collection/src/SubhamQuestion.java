import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class SubhamQuestion {
	public static ArrayList a =new ArrayList();
	public static ListIterator i =a.listIterator();
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		a.add(123);
		a.add(23);
		a.add(45);
		a.add(234.45);
		System.out.println("1 for next \n"+"2 for previous");
		int ch = sc.nextInt();
		if(ch == 1) {
			SubhamQuestion.nextElemnt();
		}else{
			SubhamQuestion.previousElemnt();
		}	
		
	}
	public static void nextElemnt() {
		if(i.hasNext()) {
			System.out.println(i.next());
		}else {
			System.out.println("Invalid");
		}
	}
	public static void previousElemnt() {
		if(i.hasPrevious()) {
			System.out.println(i.previous());
		}else {
			System.out.println("Invalid");
		}
	}
}
