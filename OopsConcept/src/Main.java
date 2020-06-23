
public class Main {
	public static void main(String[] args) {
//		Hamburgers h=new Hamburgers("basic","sausage",30,"white");
//		double price =h.itemizeHamburger();
//		System.out.println(price);
//		h.additonHamburger1("tomato", 20);
//		h.additonHamburger2("lettuce", 10);
//		h.additonHamburger3("cheese", 10.002);
//		price =h.itemizeHamburger();
//		System.out.println("Total price is "+ price);
		
		
//		HealthyBurger healty =new HealthyBurger("bacon",300);
//		healty.itemizeHamburger();
//		healty.additonHamburger1("lentis", 100);
//		healty.additonHealthy1("egg", 3);
//		healty.additonHealthy2("omlet", 10);
//		System.out.println("Total is "+ healty.itemizeHamburger());

		
		DeluxeBurger delux=new DeluxeBurger();
		System.out.println("Total is "+delux.itemizeHamburger());
		delux.additonHamburger1("egg", 2);
		//System.out.println("Total is "+delux.itemizeHamburger());
		
		
	}
}
