
public class Main {
	public static void main(String[] args) {
		Animal dog =new Dog("Sheru");
		dog.breathe();
		dog.eat();
//		Bird bird =new Bird("Parrot");
//		bird.breathe();
//		bird.eat();
		
		Parrot parrot =new Parrot();
		
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		Penguin pen=new Penguin();
		pen.breathe();
		pen.eat();
		pen.fly();
	}
	
}

