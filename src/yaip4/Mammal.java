package yaip4;

public class Mammal extends Animal {
	public Mammal(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Mammal [Animal [name=" + name + "]]";
	}
	
	public static void main(String [] args) {
		Mammal m1 = new Mammal("r");
		System.out.println(m1);
	}

}
