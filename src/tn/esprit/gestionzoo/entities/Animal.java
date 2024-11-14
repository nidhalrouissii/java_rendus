package tn.esprit.gestionzoo.entities;

public sealed abstract class Animal permits Aquatic, Terrestrial {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(){}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
            this.age = age;
        this.isMammal = isMammal;
    }

    public void afficherAnimal() {
        System.out.println("Nom de l'animal : " + name);
        System.out.println("Famille : " + family);
        System.out.println("Age : " + age);
        System.out.println("Mamifere : " + isMammal);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Family: " + family;
    }

    public void setAge(int age) throws InvalidAgeException{
        if(age<0)
        {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
        }
        else {
            this.age = age;
        }
    }
    int getAge(){return this.age;}
    String getname(){return this.name;}
}
