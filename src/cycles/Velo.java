package cycles;

import java.util.Random;

public class Velo {
	public static double DEFAUT_BRAQUET = 13.0;
	public double braquet;
	public double diamRoue;
	private Random genAlea = new Random();
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}

	public Velo(double braquet) {
		this.braquet = braquet;
	}

	public Velo() {
	}

	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}

	public double getBraquet() {
		return braquet;
	}

	public double getDiamRoue() {
		return diamRoue;
	}

	

	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}

	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}

	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
		System.out.println(this.genAlea.nextDouble());
	}
	
	public Random getGenAlea() {
		return genAlea;
	}

	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale*braquet*diamRoue*genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Random rdn = new Random();
		Velo v1 = new Velo(10.0, 10.0);
		System.out.println(v1);
		System.out.println(rdn.nextDouble());
		v1.setGenAlea(rdn);
		System.out.println(v1.getPuissance(5.0));
		System.out.println("alea is=" + v1.getGenAlea().nextDouble());
	}
	
}