package appli;

import java.util.Scanner;

public class Avis {
	private Produit P;
	private SiteDeLoisir SiteL;
	private Visiteur Vis;
	private String note;
	private String commentaire;
	
	Scanner S =new Scanner(System.in);
	
	
	public Avis() {
		P =null;
		SiteL=null;
		Vis=new Visiteur();
		this.note="";
		this.commentaire="";
	}
	public Produit getP() {
		return P;
	}

	public void setP(Produit p) {
		P = p;
	}

	public SiteDeLoisir getSiteL() {
		return SiteL;
	}

	public void setSiteL(SiteDeLoisir siteL) {
		SiteL = siteL;
	}

	public Visiteur getVis() {
		return Vis;
	}

	public void setVis(Visiteur vis) {
		Vis = vis;
	}

	public Scanner getS() {
		return S;
	}

	public void setS(Scanner s) {
		S = s;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public void ajouterAvis(){
		this.Vis.SaisirNom();
		int c;
		do {
			System.out.println("Taper 1 pour evaluer un produit : ");
			System.out.println("Taper 2 pour evaluer un site de loisir : ");
			c=S.nextInt();
		}while(c!=1 && c!=2);
		if(c==1) {
			this.P=new Produit();
			this.P.saisirProduit();
		}
		else {
			this.SiteL =new SiteDeLoisir();
			this.SiteL.saisirSiteLoisir();
		}
		int nb;
		do {
            System.out.println("Entrez votre note (entre * et *****) : ");
            this.note = S.nextLine();
            nb=NbEtoile(note);
        } while (nb < 0 || nb > 5);
		System.out.println("Entrez votre commentaire : ");
        this.commentaire = S.nextLine();

	}
	private int NbEtoile(String note) {
        switch (note) {
            case "*":
                return 1;
            case "**":
                return 2;
            case "***":
                return 3;
            case "****":
                return 4;
            case "*****":
                return 5;
            default:
                System.out.println("Saisie invalide. Veuillez entrer une notation valide.");
                return -1;
        }
	}

	public void afficherAvis() {
		if (SiteL != null) {
        	SiteL.afficherSiteL();
        }
		if (P != null) {
        	P.AfficherProduit();
        }
		System.out.println("Nom de l'utilisateur : " + Vis.getNom());
        System.out.println("Note : " + note);
        System.out.println("Commentaire : " + commentaire);
	} 
        
}
