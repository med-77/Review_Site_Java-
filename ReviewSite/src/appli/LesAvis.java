package appli;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
public class LesAvis {
	private List<Avis> ListeAvis;
	
	public LesAvis() {
        this.ListeAvis = new ArrayList<>();
    }
	public void publierAvis() {
		Avis avis=new Avis();
		avis.ajouterAvis();
        ListeAvis.add(avis);
    }
	public void ConsulterAvisP() {
        System.out.println("Avis sur les Produits :");
        for (int i = 0; i < ListeAvis.size(); i++) {
            Avis avis = ListeAvis.get(i);
            if (avis.getP() != null) {
                avis.afficherAvis();
                System.out.println("------------------------");
            }
        }
    }
	public void ConsulterAvisS() {
        System.out.println("Avis sur les Sites de Loisir :");
        for (int i = 0; i < ListeAvis.size(); i++) {
            Avis avis = ListeAvis.get(i);
            if (avis.getSiteL() != null) {
                avis.afficherAvis();
                System.out.println("------------------------");
            }
        }
    }
	
	public List<Avis> getListeAvis() {
		return ListeAvis;
	}
	public void setListeAvis(List<Avis> listeAvis) {
		ListeAvis = listeAvis;
	}
	
	public void supprimerAvis(String nomV, Object objetEval) {
        Iterator<Avis> iterator = ListeAvis.iterator();
        while (iterator.hasNext()) {
            Avis avis = iterator.next();

            if (avis.getVis().getNom().equals(nomV)) {
                if (avis.getP() != null && objetEval instanceof Produit) {
                    Produit produitEval = (Produit) objetEval;
                    if (avis.getP().equals(produitEval)) {
                        iterator.remove();
                        System.out.println("Avis sur le produit supprimé avec succès.");
                        return;
                    }
                } else if (avis.getSiteL() != null && objetEval instanceof SiteDeLoisir) {
                    SiteDeLoisir siteEval = (SiteDeLoisir) objetEval;
                    if (avis.getSiteL().equals(siteEval)) {
                        iterator.remove();
                        System.out.println("Avis sur le site de loisir supprimé avec succès.");
                        return;
                    }
                }
            }
        }

        System.out.println("Avis non trouve ! ");
    }
	public void chercherAvisParObjet(Object objRecherche) {
        System.out.println("Avis pour l'objet : " + objRecherche.toString());
        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < ListeAvis.size(); i++) {
        	Avis avis = ListeAvis.get(i);
            if (avis.getP() != null && avis.getP().equals(objRecherche)) {
                avis.afficherAvis();
                System.out.println("-------------------------------------------------");
            } else if (avis.getSiteL() != null && avis.getSiteL().equals(objRecherche)) {
                avis.afficherAvis();
                System.out.println("-------------------------------------------------");
            }
        }
    }
	public void NbAvis() {
		System.out.println( ListeAvis.size());
	}
	public void NbAvisParCat() {
        int NbAvisP = 0;
        int NbAvisS = 0;

        for (int i = 0; i < ListeAvis.size(); i++) {
            Avis avis = ListeAvis.get(i);

            if (avis.getP() != null) {
                // L'avis concerne un produit
                NbAvisP++;
            } else if (avis.getSiteL() != null) {
                // L'avis concerne un site de loisir
                NbAvisS++;
            }
        }

        System.out.println("Nombre d'avis sur les produits : " + NbAvisP);
        System.out.println("Nombre d'avis sur les sites de loisirs : " + NbAvisS);
    }
	public void NbVisiteurs() {
        Set<Visiteur> nbreVis = new HashSet<>();

        int tailleListe = ListeAvis.size();

        for (int i = 0; i < tailleListe; i++) {
            Avis avis = ListeAvis.get(i);
            nbreVis.add(avis.getVis());
        }

        System.out.println("Nombre de visiteurs différents : " + nbreVis.size());
    }
	
}
