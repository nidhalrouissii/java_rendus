import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        List<Etudiant> etudiants = new ArrayList<>();
        Etudiant Et1=new Etudiant(1,"Yasisne",21);
        Etudiant Et2=new Etudiant(2,"Nadhmi",20);
        Etudiant Et3=new Etudiant(3,"Nesrine",22);
        etudiants.add(Et1);
        etudiants.add(Et3);
        etudiants.add(Et2);
        Consumer<Etudiant> con = System.out::println;
        sm.displayStudents(etudiants,con);
        Predicate<Etudiant> pre = t -> t.getNom().startsWith("N");
        sm.displayStudentsByFilter(etudiants,pre,con);
        Function<Etudiant,String> fun = Etudiant::getNom;
        String names= sm.returnStudentsNames(etudiants,fun);
        System.out.println(names);
        Supplier<Etudiant> sup = () -> new Etudiant(4,"Ibtihen",23);
        Etudiant Et4=sup.get();
        Comparator<Etudiant> com = (a,b) -> a.getId()-b.getId();
        List<Etudiant> etudiants1 = sm.sortStudentsById(etudiants,com);
        System.out.println(etudiants1);
    }
}
