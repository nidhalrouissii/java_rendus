package levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.*;
import java.util.stream.Collectors;

public class Level3 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();


        /* TO DO 1: Retourner une chaine de caractère qui contient tous les noms des enseignants en majuscule separés par # */
        String names = teachers.stream().map(t -> t.getName().toUpperCase()).reduce("names",(a,b)->a+"#"+b);/* TO DO 1  hint(reduce)*/;

        /* TO DO 2: Retourner une set d'enseignants Java dont le salaire > 80000 */
        Set<Teacher> teachers1 = teachers.stream().filter(t -> t.getSalary()>80000).collect(Collectors.toSet())/* TO DO 3 */;

        /* TO DO 3: Retourner une TreeSet d'enseignants (tri par nom et en cas d'égalité tri par salaire) */
        TreeSet<Teacher> teachers2 = teachers.stream().collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Teacher::getName).thenComparing(Teacher::getSalary))));/* TO DO 4 */;

        /* TO DO 4: Retourner une Map qui regroupe les enseignants par module */
        Map<Subject, List<Teacher>> map = teachers.stream().collect(Collectors.groupingBy(Teacher::getSubject));/* TO DO 5 */;

        /* TO DO 5: Retourner une Map qui regroupe les nom des enseignants par salaire */
        Map<Integer, String> map1 = teachers.stream().collect(Collectors.toMap(Teacher::getSalary,Teacher::getName,(t1,t2)->t1+"#"+t2));/*TO DO 6*/;

        /* TO DO 6: Afficher les nom des enseignants de chaque module */
        map.entrySet().stream().collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue().stream().map(Teacher::getName).reduce((t1,t2)->t1+" "+t2).get(),(o,o1)->o+o1)).
                entrySet().stream().forEach(entry->{System.out.println(entry.getKey());System.out.println(entry.getValue());});

    }
}
