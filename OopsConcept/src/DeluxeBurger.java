
public class DeluxeBurger extends Hamburgers {

	public DeluxeBurger() {
		super("Delux", "sausage & becon",14.54, "white");
		super.additonHamburger1("chips", 3.03);
		super.additonHamburger2("Drinks", 11);
	}
	public void additonHamburger1(String name,double price) {
		System.out.println("Can not add Additional items to a delux burger");
	}
	public void additonHamburger2(String name,double price) {
		System.out.println("Can not add Additional items to a delux burger");
	}
	public void additonHamburger3(String name,double price) {
		System.out.println("Can not add Additional items to a delux burger");
	}
	public void additonHamburger4(String name,double price) {
		System.out.println("Can not add Additional items to a delux burger");
	}
}
