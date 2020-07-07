
public class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println(getName()+" is eating");
		
	}@Override
	public void walk() {
		System.out.println(getName()+" is walking");
	}
	
	public Dog(String name) {
		super(name);
	}
}
