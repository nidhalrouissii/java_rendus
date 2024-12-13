import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;
public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> HashSet ;
     public DepartementHashSet()
     {
         HashSet = new HashSet<>();
     }
    @Override
    public void ajouterDepartement(Departement departement) {
        HashSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d : HashSet){
            if(d.getNom_departement().equals(nom)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherDepartement(Departement departement) {
        return HashSet.contains(departement);
    }
    @Override
    public void supprimerDepartement(Departement departement) {
        HashSet.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for(Departement d : HashSet){
            System.out.println(d);
        }
    }
    @Override
    public TreeSet<Departement> trierDepartementById() {

        Comparator<Departement> comparator = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getId() - o2.getId();
            }
        };
        TreeSet<Departement> mytree = new TreeSet<>(comparator);
        mytree.addAll(HashSet);
        return mytree;

    }
}
