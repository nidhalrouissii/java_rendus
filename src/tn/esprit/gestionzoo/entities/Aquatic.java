package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public non-sealed abstract class Aquatic extends Animal implements Carnivore<Food>{
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super(family, name, age, isMammal);
        this.habitat=habitat;
    }

    @Override
    public String toString() {
        return super.toString()  + ", habitat : " + habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (obj instanceof Aquatic aquatic){
            return super.getAge() == aquatic.getAge() && getname().equals(aquatic.getname()) && habitat.equals(aquatic.habitat);
        }
        return false;
    }
}
