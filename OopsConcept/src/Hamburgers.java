
public class Hamburgers {
	private String name;
	private String breadRollType;
	private String meat;
	private double price;
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	public Hamburgers(String name,String meat,double price,String breadRollType) {
		this.breadRollType=breadRollType;
		this.price=price;
		this.meat=meat;
		this.name=name;
	}
	public void additonHamburger1(String name,double price) {
		this.addition1Name=name;
		this.addition1Price=price;
	}
	public void additonHamburger2(String name,double price) {
		this.addition2Name=name;
		this.addition2Price=price;
	}
	public void additonHamburger3(String name,double price) {
		this.addition3Name=name;
		this.addition3Price=price;
	}
	public void additonHamburger4(String name,double price) {
		this.addition4Name=name;
		this.addition4Price=price;
	}
	public double itemizeHamburger() {
		double hamburgurPrice=this.price;
		System.out.println(this.name + " Handburger on a "+ this.breadRollType + " Roll with "
							+ this.meat +" price is "+ this.price);	
		if(addition1Name != null) {
			hamburgurPrice+=this.addition1Price;
			System.out.println("Added " + this.addition1Name+" for an extra "+ this.addition1Price);
		}
		if(addition2Name != null) {
			hamburgurPrice+=this.addition2Price;
			System.out.println("Added " + this.addition2Name+" for an extra "+ this.addition2Price);
		}
		if(addition3Name != null) {
			hamburgurPrice+=this.addition3Price;
			System.out.println("Added " + this.addition3Name+" for an extra "+ this.addition3Price);
		}
		if(addition4Name != null) {
			hamburgurPrice+=this.addition4Price;
			System.out.println("Added " + this.addition4Name+" for an extra "+ this.addition4Price);
		}
		return hamburgurPrice;
	}
}
