package yaip4;

public class Animal {
	public String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public static void main(String [] args) {
		Animal a1 = new Animal("r");
		System.out.println(a1);
	}
}
