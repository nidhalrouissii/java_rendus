package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal implements Omnivore<Food>{
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal,int nbrLegs)
    {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString()  + ", nbrLegs :" + nbrLegs;
    }


    @Override
    public void eatMeat(Food f) {
        System.out.println(f);
    }

    @Override
    public void eatPlant(Food f) {
        System.out.println(f);
    }

    @Override
    public void eatPlantAndMeat(Food f) {
        System.out.println(f);
    }
}
