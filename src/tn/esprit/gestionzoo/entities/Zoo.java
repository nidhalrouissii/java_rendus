package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private final int nbrCages=3;
    private int nbrAnimaux;
    private int nbrAnimauxAquatic;
    Animal Animaux[] = new Animal[nbrCages];
    public Aquatic[] AquaticAnimals = new Aquatic[10];

    public Zoo(String name, String city) {
        this.name=name;
        this.city = city;
    }

    public void afficherZoo() {
        System.out.println("Nom du Zoo : " + name);
        System.out.println("Ville du Zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", Nbr Cages: " + nbrCages;
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (isZooFull()) {
            throw new ZooFullException("Le zoo est plein");
        }
        if (searchAnimal(animal) == -1) {
            Animaux[nbrAnimaux] = animal;
            nbrAnimaux++;
            System.out.println("Animal ajouté. Nombre d'animaux dans le zoo : " + nbrAnimaux);
        }
    }

    public void displayAnimals(){
        for(int i=0;i<nbrAnimaux;i++){
            System.out.println(Animaux[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for(int i=0;i<nbrAnimaux;i++){
            if(Animaux[i]==animal){
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimaux; i++) {
            if (Animaux[i] == animal) {
                for (int j = i; j < nbrAnimaux - 1; j++) {
                    Animaux[j] = Animaux[j + 1];
                }
                nbrAnimaux--;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        return nbrAnimaux >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimaux > z2.nbrAnimaux) {
            return z1;
        } else {
            return z2;
        }
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        if(name==null)
        {
            System.out.println("veuillez entrer un nom valide");
        }
        else {
            this.name = name;
        }
    }

    String getname(){return this.name;}

    void setname(String name){
        if(name==null)
        {
            System.out.println("veuillez entrer un nom valide");
        }
        else
        {
            this.name = name;
        }
    }
    public void addAquaticAnimal(Aquatic aquatic){
        if(nbrAnimauxAquatic<10) {
            AquaticAnimals[nbrAnimauxAquatic] = aquatic;
            nbrAnimauxAquatic++;
        }
    }
    public float maxPenguinSwimmingDepth()
    {
        float m=0;
        for(int i=0;i<nbrAnimauxAquatic;i++)
        {
            if(AquaticAnimals[i] instanceof Penguin && m<((Penguin) AquaticAnimals[i]).getSwimmingDepth()){
                m=((Penguin) AquaticAnimals[i]).getSwimmingDepth();
            }
        }
        return m;
    }
    public void displayNumberOfAquaticsByType()
    {
        int p=0;
        int d=0;
        for(int i=0;i<nbrAnimauxAquatic;i++)
        {
            if (AquaticAnimals[i] instanceof Penguin) {
                p++;
            }
            if (AquaticAnimals[i] instanceof Dolphin) {
                d++;
            }
        }
        System.out.println("Nombre dauphins : " + d);
        System.out.println("Nombre pinguins : " + p);
    }
}
