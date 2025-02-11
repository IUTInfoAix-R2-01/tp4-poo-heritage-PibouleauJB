package yaip4;

public class Cat extends Mammal {
	public Cat(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Meow");
	}
	
	@Override
	public String toString() {
		return "Cat [Mammal [Animal [name=" + name + "]]]";
	}
	
	public static void main(String [] args) {
		Cat c1 = new Cat("r");
		c1.greets();
		System.out.println(c1);
	}
}
