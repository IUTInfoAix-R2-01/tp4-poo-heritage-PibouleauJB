package yaip4;

public class Person {
	public String name;
	public String adress;
	
	public Person(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String toString() {
		return "Person [name=" + name + ", adress=" + adress + "]";
	}
	
	public static void main(String [] args) {
		Person p1 = new Person("r", "o");
		System.out.println("name is=" + p1.getName());
		System.out.println("adress is=" + p1.getAdress());
		p1.setAdress("d");
		System.out.println(p1);
	}
	
}
