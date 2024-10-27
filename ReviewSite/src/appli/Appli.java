package appli;
import java.util.Scanner;
public class Appli {

	public static void main(String[] args) {
		
		LesAvis Liste=new LesAvis();
		Visiteur V=new Visiteur();
		
		Scanner S = new Scanner(System.in);
        int choix;

        do {
            afficherMenuPrincipal();
            choix = S.nextInt();
            switch (choix) {
                case 1:
                    menuAdmin(S,Liste);
                    break;
                case 2:
                    menuVisiteur(S,Liste);
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 3.");
            }

        } while (choix != 3);

        S.close();
    }
	
	
	
	
	
	
	
	
	
	
	public static void afficherMenuPrincipal() {
        System.out.println("Menu Principal :");
        System.out.println("1. Admin");
        System.out.println("2. Visiteur");
        System.out.println("3. Quitter");
        System.out.print("Choix : ");
    }

    public static void menuAdmin(Scanner S ,LesAvis Liste) {
        int choixAdmin;

        do {
            System.out.println("Menu Admin :");
            System.out.println("1. Consulter les avis");
            System.out.println("2. Modérer les avis");
            System.out.println("3. Afficher les statistiques");
            System.out.println("4. Retour au menu principal");
            System.out.print("Choix : ");
            choixAdmin = S.nextInt();

            switch (choixAdmin) {
                case 1:
                    // consulter les avis
                	sousMenuConsulter(S, Liste);
                	
                    break;
                case 2:
                    // modérer les avis
                    System.out.println("Modération des avis...");
                    sousMenuSupp(S, Liste);
                    break;
                case 3:
                    // afficher les statistiques
                    System.out.println("Affichage des statistiques...");
                    sousMenuStat(S,Liste);
                    break;
                case 4:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 4.");
            }
        } while (choixAdmin != 4);
    }

    public static void menuVisiteur(Scanner S, LesAvis Liste) {
        int choixVisiteur;

        do {
            System.out.println("Menu Visiteur :");
            System.out.println("1. Publier un avis");
            System.out.println("2. Consulter les avis");
            System.out.println("3. Rechercher un objet");
            System.out.println("4. Retour au menu principal");
            System.out.print("Choix : ");
            choixVisiteur = S.nextInt();

            switch (choixVisiteur) {
                case 1:
                    // publier un avis
                    System.out.println("Publication d'un avis...");
                    Liste.publierAvis();
                    break;
                case 2:
                    // consulter les avis
                	sousMenuConsulter(S,Liste);
                    break;
                case 3:
                    // rechercher un objet
                    System.out.println("Recherche d'un objet...");
                    
                    
                    break;
                case 4:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 4.");
            }
        } while (choixVisiteur != 4);
	}
    public static void sousMenuConsulter(Scanner S, LesAvis Liste) {
        int choixConsulter;

        do {
            System.out.println("Sous-menu Consulter :");
            System.out.println("1. Consulter les avis des produits");
            System.out.println("2. Consulter les avis des Sites de loisirs");
            System.out.println("3. Retour ");
            System.out.print("Choix : ");
            choixConsulter = S.nextInt();

            switch (choixConsulter) {
                case 1:
                    
                    System.out.println("Consultation des avis des produits...");
                    Liste.ConsulterAvisP();
                    break;
                case 2:
                   
                    System.out.println("Consultation des avis des Sites de loisirs...");
                    Liste.ConsulterAvisS();
                    break;
                case 3:
                    System.out.println("Retour au menu Admin");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 3.");
            }
        } while (choixConsulter != 3);
    }
    public static void sousMenuSupp(Scanner S, LesAvis Liste) {
        int choixSupp;

        
            /*System.out.println("Sous-menu Supprimer :");
            for(int i=0;i<Liste.getListeAvis().size();i++) {
            	System.out.println(i+" "+Liste.getListeAvis().get(i));
            	
            }
            int index=0;
            boolean test=true;
            /*do {
            	System.out.println("donnez l'indice de commentaire a supprimer : ");
            	index=S.nextInt();
            	if((index>=0 && index<Liste.getListeAvis().size())) {
            		System.out.println("indice invalide !!");

            	}
            	
            }while(!(index>=0 && index<Liste.getListeAvis().size()));
            Liste.getListeAvis().remove(index);*/
            System.out.println("1. Supprimer un avis d'un produit");
            System.out.println("2. Supprimer un avis d'un Site de loisir");
            System.out.println("3. Retour ");
            System.out.print("Choix : ");
            choixSupp = S.nextInt();

            switch (choixSupp) {
                case 1:
                    
                    System.out.println("Suppression avis d'un produit...");
                    Produit p1=new Produit();
                    Visiteur v1=new Visiteur();
                    p1.saisirProduit();
                    v1.SaisirNom();
                    Liste.supprimerAvis(v1.getNom(), p1);
                    break;
                case 2:
                    
                    System.out.println("Suppression avi d'un Site de loisir...");
                    SiteDeLoisir s1=new SiteDeLoisir();
                    Visiteur v2=new Visiteur();
                    s1.saisirSiteLoisir();
                    v2.SaisirNom();
                    Liste.supprimerAvis(v2.getNom(), s1);
                    break;
                case 3:
                    System.out.println("Retour au menu Admin");
                    break;
                default:
            }
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 3.");
        
    }
    
    public static void sousMenuStat(Scanner S, LesAvis Liste) {
        int choixStat;

        do {
            System.out.println("Sous-menu Statistques :");
            System.out.println("1. Nombre total d’avis postés");
            System.out.println("2. Nombre total d’avis postés par catégorie d’objets");
            System.out.println("3. Nombre et la liste des visiteurs différents utilisant le site ");
            System.out.println("4. Retour au menu precedent ");
            System.out.print("Choix : ");
            choixStat = S.nextInt();

            switch (choixStat) {
                case 1:
                    
                    System.out.println("Nombre total d'avis...");
                    Liste.NbAvis();
                    break;
                case 2:
                    
                    System.out.println("Consultation des avis des Sites de loisirs...");
                    Liste.NbAvisParCat();;
                    break;
                case 3:
                    System.out.println("Nombre des visiteurs ...");
                    Liste.NbVisiteurs();
                    break;
                case 4:
                	System.out.println("Retour au menu Admin ");
                	break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 3.");
            }
        } while (choixStat != 4);
    }
    public static void sousMenuRech(Scanner S, LesAvis Liste) {
        int choix;

        do {
            System.out.println("Sous-menu Consulter :");
            System.out.println("1. Chercher un avis d'un produits");
            System.out.println("2. Chercher un avis d'un Site de loisirs");
            System.out.println("3. Retour ");
            System.out.print("Choix : ");
            choix = S.nextInt();

            switch (choix) {
                case 1:
                    
                    System.out.println("recherche des avis des produits...");
                    Produit p1=new Produit();
                    p1.saisirProduit();
                    Liste.chercherAvisParObjet(p1);
                    break;
                case 2:
                    
                    System.out.println("recherche des avis des Sites de loisirs...");
                    SiteDeLoisir s1=new SiteDeLoisir();
                    s1.saisirSiteLoisir();
                    Liste.chercherAvisParObjet(s1);
                    break;
                case 3:
                    System.out.println("Retour au menu Admin");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 3.");
            }
        } while (choix != 3);
    }
}
