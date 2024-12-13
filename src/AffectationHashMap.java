import java.util.*;

public class AffectationHashMap {
    Map<Employe ,Departement> MapSociete = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        MapSociete.put(e, d);
    }

    public void afficherEmployesEtDepartements(){
        System.out.println(MapSociete);
    }

    public void supprimerEmploye (Employe e){
        MapSociete.remove(e);
    }

    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        if(MapSociete.get(e)==d)
        {
            MapSociete.remove(e);
        }
        else{
            System.out.println("l'employe n'appartient pas a ce departement");
        }
    }

    public void afficherEmployes(){
        Set<Map.Entry<Employe,Departement>> Societe = MapSociete.entrySet();
        for (Map.Entry<Employe,Departement> e : Societe)
        {
            System.out.println(e.getKey());
        }
    }

    public void afficherDepartements(){
        Set<Map.Entry<Employe,Departement>> Societe = MapSociete.entrySet();
        for (Map.Entry<Employe,Departement> d : Societe)
        {
            System.out.println(d.getValue());
        }
    }

    public boolean rechercherEmploye (Employe e){
        if(MapSociete.containsKey(e)){
            return true;
        }
        return false;
    }
    public boolean rechercherDepartement (Departement d){
        if(MapSociete.containsValue(d)){
            return true;
        }
        return false;
    }
    public TreeMap<Employe, Departement> trierMap(){
        return new TreeMap<>(MapSociete);
    }
}
