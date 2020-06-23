
public class Car {
	private String name;
	private boolean engine;
	private int wheels;
	private int cylinders;
	
	public Car(String name,int cylinders) {
		this.wheels=4;
		this.cylinders=cylinders;
		this.name=name;
		this.engine=true;
	}
	
	public String getName() {
		return name;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void startEngines() {
		System.out.println("car->start engine");
	}
	public void accelrate() {
		System.out.println("car->accelrate");
	}
	public void carBreak() {
		System.out.println("car->breaks");
	}
}
