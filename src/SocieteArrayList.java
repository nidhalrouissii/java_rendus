import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> Societe = new ArrayList<>();

    public void ajouterEmploye(Employe t) {
        Societe.add(t);
    }

    public boolean rechercherEmploye(String nom) {
        for (Employe employe : Societe) {
            if (employe.getNom().equals(nom))
                return true;
        }
        return false;
    }

    public boolean rechercherEmploye(Employe t) {
        return Societe.contains(t);
    }

    public void supprimerEmploye(Employe t) {
        Societe.remove(t);
    }

    public void displayEmploye() {
        System.out.println(Societe);
    }

    public void trierEmployeParId() {
        Collections.sort(Societe);
    }
    public void trierEmployeParNomDépartementEtGrade()
    {
        Comparator<Employe> DepartementComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getDepartement().compareTo(o2.getDepartement());
            }
        };
        Comparator<Employe> gradeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade()-o2.getGrade();
            }
        };
        Societe.sort(DepartementComparator.thenComparing(gradeComparator));
    }
}