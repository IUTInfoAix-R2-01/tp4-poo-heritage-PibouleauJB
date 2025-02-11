package yaip4;

public class Dog extends Mammal {

	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}
	
	@Override
	public String toString() {
		return "Dog [Mammal [Animal [name=" + name + "]]";
	}

	public static void main(String [] args) {
		Dog d1 = new Dog("r");
		Dog d2 = new Dog("d");
		d1.greets();
		d2.greets(d2);
		System.out.println(d1);
	}

}
