public class Departement {
    private int id;
    private String nom;
    private int nbrEmp;

    public Departement(){}
    public Departement(int id, String nom, int nbrEmp) {
        this.id = id;
        this.nom = nom;
        this.nbrEmp = nbrEmp;
    }

    public int getId() {return this.id;}
    public String getNom() {return this.nom;}
    public int getNbrEmp() {return this.nbrEmp;}
    public void setId(int id) {this.id = id;}
    public void setNom(String nom) {this.nom = nom;}
    public void setNbrEmp(int nbrEmp) {this.nbrEmp = nbrEmp;}

    @Override
    public boolean equals(Object obj) {
        if (obj == null){return false;}
        if (obj instanceof Departement d)
        {
            return this.id==d.id && this.nom.equals(d.nom);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Id : " + id + ",Nom : " + nom + ",Nombre Employes : " + nbrEmp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + this.nom.hashCode();
        return hash;
    }

}
