
public class Encapsulate {
	public static void main(String[] args) {
		Printer p=new Printer(50,true);
	//	Printer p=new Printer(50,false);
		System.out.println("intial page count "  + p.getpagesPrinted());
		int pagesPrinted=p.printPages(5);
		System.out.println("pages printed was "+ pagesPrinted +" new total print count for printer "+ p.getpagesPrinted());
		pagesPrinted=p.printPages(9);
		System.out.println("pages printed was "+ pagesPrinted +" new total print count for printer "+ p.getpagesPrinted());
	}
	
}
