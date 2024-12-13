import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> dep= new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        dep.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : dep) {
            if (departement.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return dep.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        dep.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(dep);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        Comparator<Departement> IDcomparator = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getId() - o2.getId();
            }};
        TreeSet <Departement> depTree= new TreeSet<>(IDcomparator);
        depTree.addAll(dep);
        return depTree;
    }


}
