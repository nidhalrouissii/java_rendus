import java.util.Objects;

public class Departement {
    protected int id;
    protected String nom_departement;
    protected int nb_employe;
    public Departement()
    {}

    public Departement(int id, String nom_departement, int nb_employe) {
        this.id = id;
        this.nom_departement = nom_departement;
        this.nb_employe = nb_employe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getNb_employe() {
        return nb_employe;
    }

    public void setNb_employe(int nb_employe) {
        this.nb_employe = nb_employe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement D = (Departement) o;
        return id == D.id && this.nom_departement.equals(D.nom_departement);
    }

    @Override
    public int hashCode() {
        int res=17;
        res=31*res+id;
        res=res+nom_departement.hashCode();
        return res;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom_departement='" + nom_departement + '\'' +
                ", nb_employe=" + nb_employe +
                '}';
    }
}
