package yaip4;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String adress, String program, int year, double fee) {
		super(name, adress);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public int getYear() {
		return year;
	}

	public double getFee() {
		return fee;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [Person [name=" + name + ", adress=" + adress + "], program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	
	public static void main(String [] args) {
		Student s1 = new Student("r", "o", "a", 1, 2.0);
		System.out.println("program is=" + s1.getProgram());
		System.out.println("year is=" + s1.getYear());
		System.out.println("fee is=" + s1.getFee());
		s1.setProgram("d");
		s1.setYear(5);
		s1.setFee(6.0);
		System.out.println(s1);
	}	
	
}
