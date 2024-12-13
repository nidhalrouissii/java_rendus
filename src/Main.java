import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------SET-----------------------");
        DepartementHashSet Deps = new DepartementHashSet();
        Deps.ajouterDepartement(new Departement(1,"Finance",20));
        Deps.ajouterDepartement(new Departement(3,"Gestion",10));
        Deps.ajouterDepartement(new Departement(4,"IT",20));
        Deps.ajouterDepartement(new Departement(2,"RH",20));
        Deps.displayDepartement();

        TreeSet<Departement> MyTree = new TreeSet<>();
        MyTree = Deps.trierDepartementById();
        System.out.println("======================SORTED-Set====================");
        System.out.println(MyTree);

    }
}