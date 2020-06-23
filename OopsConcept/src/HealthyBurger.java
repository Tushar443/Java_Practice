
public class HealthyBurger extends Hamburgers {
	private String healthyExtra1name;
	private double healthyExtra1price;
	private String healthyExtra2name;
	private double healthyExtra2price;
	
	public HealthyBurger(String meat,double price) {
		super ("Healthy",meat,price,"Brown rya");
	}
	public void additonHealthy1(String name,double price) {
		this.healthyExtra1name=name;
		this.healthyExtra1price=price;
	}
	public void additonHealthy2(String name,double price) {
		this.healthyExtra2name=name;
		this.healthyExtra2price=price;
	}
	
	public double itemizeHamburger() {
		double hamburger=super.itemizeHamburger();
		
		if(healthyExtra1name !=null) {
			hamburger+=healthyExtra1price;
			System.out.println("Added "+this.healthyExtra1name +" for an extra "
								+ this.healthyExtra1price);
		}
		if(healthyExtra2name !=null) {
			hamburger+=healthyExtra2price;
			System.out.println("Added "+this.healthyExtra2name +" for an extra "
								+ this.healthyExtra2price);
		}
		return hamburger;
	}
	
}
