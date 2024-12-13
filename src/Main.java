import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe(1,"Rouissi","Nadhmi","Infini",2);
        Employe e2 = new Employe(2,"Mechergui","Ibtihen","Cloud",5);
        Employe e3 = new Employe(3,"Mallekh","Hiba","Cloud",23);
        Departement d1 = new Departement(1,"Infini",50);
        Departement d2 = new Departement(2,"Cloud",23);
        AffectationHashMap Societe = new AffectationHashMap();
        Societe.ajouterEmployeDepartement(e1,d1);
        Societe.ajouterEmployeDepartement(e2,d2);
        Societe.ajouterEmployeDepartement(e3,d2);
        Societe.afficherEmployesEtDepartements();
        Societe.afficherEmployes();
        Societe.afficherDepartements();
        Societe.supprimerEmployeEtDepartement(e3,d1);
        Societe.afficherEmployes();
        TreeMap<Employe,Departement> treeMap = Societe.trierMap();
        System.out.println(treeMap);
    }
}
