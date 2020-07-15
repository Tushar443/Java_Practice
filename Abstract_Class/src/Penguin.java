
public class Penguin extends Bird{

	public Penguin() {
		super("Penguin");
	}

	@Override
	public void fly() {
		System.out.println(getName()+" can swin instead of flying");		
	}

}
