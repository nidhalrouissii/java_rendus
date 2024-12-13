import java.util.Comparator;

public class Employe implements Comparable<Employe>, Comparator<Employe> {
    private int identifiant;
    private String nom;
    private String prenom;
    private String departement;
    private int grade;

    public Employe(){

    }

    public Employe(int identifiant, String nom, String prenom, String departement, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){return false;}
        if (obj instanceof Employe emp)
        {
            return this.identifiant==emp.identifiant && this.nom.equals(emp.nom);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Identifiant : " + identifiant + ",Nom : " + nom + ",Prenom : " + prenom + ",Departement : " + departement + ",Grade : " + grade;
    }

    public String getNom(){return this.nom;}
    public String getDepartement(){return this.departement;}
    public int getGrade(){return this.grade;}

    public int compareTo(Employe emp){
        return this.identifiant - emp.identifiant;
    }

    public int compare(Employe o1, Employe o2) {
        return o1.identifiant - o2.identifiant;
    }

    Comparator<Employe> departementComparator = new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return o1.getDepartement().compareTo(o2.getDepartement());
        }
    };

    Comparator<Employe> gradeComparator = new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return o1.getGrade() - o2.getGrade();
        }
    };
}
