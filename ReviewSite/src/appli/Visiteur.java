package appli;
import java.util.Scanner;
public class Visiteur {

	private String nom;
	
	public Visiteur() {
		nom="";
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void SaisirNom(){
		System.out.println("Pseudonyme :");
		Scanner S =new Scanner(System.in);
		this.nom=S.nextLine();
	}
	
}
