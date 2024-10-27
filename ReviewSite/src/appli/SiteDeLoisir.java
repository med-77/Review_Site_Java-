package appli;

import java.util.Scanner;

public class SiteDeLoisir {
	
    private String nom;
    private String ville;
    private String pays;
    private String type;
    
    public SiteDeLoisir(){
    	this.nom="";
    	this.ville="";
    	this.pays="";
    	this.type="";
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void saisirSiteLoisir() {
        Scanner S = new Scanner (System.in);

        System.out.print("Entrez le nom du site de loisir : ");
        String nom = S.nextLine();

        System.out.print("Entrez la ville du site de loisir : ");
        String ville = S.nextLine();

        System.out.print("Entrez le pays du site de loisir : ");
        String pays = S.nextLine();

        System.out.print("Entrez le type du site de loisir : ");
        String type = S.nextLine();    
    }
	public void afficherSiteL() {
        System.out.println("Nom : " + nom);
        System.out.println("Ville : " + ville);
        System.out.println("Pays : " + pays);
        System.out.println("Type : " + type);
    }
}