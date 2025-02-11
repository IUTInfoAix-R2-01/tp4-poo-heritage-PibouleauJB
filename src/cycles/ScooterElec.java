package cycles;

import java.util.Random;

public class ScooterElec extends Velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public ScooterElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public ScooterElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public ScooterElec() {
		super();
	}

	public double getDEFAUT_COUPLE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double dEFAUT_COUPLE_MOTEUR) {
		this.DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_COUPLE_MOTEUR;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	@Override
	public String toString() {
		return "ScooterElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale)*facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		ScooterElec s1 = new ScooterElec(10.0, 10.0);
		System.out.println("Couple is=" + s1.getDEFAUT_COUPLE_MOTEUR());
		System.out.println("Facteur is=" + s1.getFacteurPuissanceMoteur());
		System.out.println("Puissance is=" + s1.getPuissance(9.5));
		s1.setDEFAUT_COUPLE_MOTEUR(5.0);
		s1.setFacteurPuissanceMoteur(1.6);
		System.out.println(s1);
	}
	
	
}
