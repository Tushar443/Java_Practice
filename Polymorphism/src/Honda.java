
public class Honda extends Car {
	
	public Honda(int cylinders) {
		super("Honda",cylinders);
	}
	public void startEngines() {
		System.out.println("Honda->start engine");
	}
	public void accelrate() {
		System.out.println("Honda->accelrate");
	}
	public void carBreak() {
		System.out.println("Honda->breaks");
	}
}
