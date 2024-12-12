public class Etudiant {
    int id;
    String nom;
    int age;

    public Etudiant(){}
    public Etudiant(int id, String nom, int age){
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    int getId(){return id;}
    String getNom(){return nom;}
    int getAge(){return age;}
    void setId(int id){this.id = id;}
    void setNom(String nom){this.nom = nom;}
    void setAge(int age){this.age = age;}

    @Override
    public String toString(){
        return "id : " + id + " nom : " + nom + " age : " + age;
    }
}
