package tn.esprit.gestionzoo.entities;

public interface Omnivore <T> extends Herbivore<T>,Carnivore<T>{
    public void eatPlantAndMeat(T f);
}
