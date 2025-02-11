package yaip4;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String adress, String school, double pay) {
		super(name, adress);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [Person [name=" + name + ", adress=" + adress + "], school=" + school + ", pay=" + pay + "]";
	}
	
	public static void main(String [] args) {
		Staff s1 = new Staff("r", "o", "t", 9.5);
		System.out.println("school is=" + s1.getSchool());
		System.out.println("pay is=" + s1.getPay());
		s1.setSchool("d");
		s1.setPay(4.6);
		System.out.println(s1);
	}
	
}
