

public class Marrazzo extends Car {
	public Marrazzo(int cylinders) {
		super("Marrazo", cylinders);
	}
	public void startEngines() {
		System.out.println("Marrazzo->start engine");
	}
	public void accelrate() {
		System.out.println("Marrazzo->accelrate");
	}
	public void carBreak() {
		System.out.println("Marrazzo->breaks");
	}
}