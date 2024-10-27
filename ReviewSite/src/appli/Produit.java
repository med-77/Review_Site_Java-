package appli;

import java.util.Scanner;

public class Produit {
	
	private String nom;
    private String categorie;
    private String marque;
    public Produit() {
    	this.nom="";
    	this.categorie="";
    	this.marque="";
    }
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public void saisirProduit() {
        Scanner S = new Scanner(System.in);

        System.out.print("Entrez la catégorie du produit : ");
        categorie = S.nextLine();

        System.out.print("Entrez le nom du produit : ");
        nom = S.nextLine();

        System.out.print("Entrez la marque du produit : ");
        marque = S.nextLine();

    }
	public void AfficherProduit() {
        System.out.println("Catégorie : " + categorie);
        System.out.println("Nom : " + nom);
        System.out.println("Marque : " + marque);
    }
	


    
}