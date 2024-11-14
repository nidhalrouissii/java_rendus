package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;
public class ZooManagment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo myZoo = new Zoo("Friguia", "Sousse");
        myZoo.afficherZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        Animal myAnimal = new Terrestrial("Lion", "Boubi", 23, true,4);
        myAnimal.afficherAnimal();
        System.out.println(myAnimal);
        System.out.println(myAnimal.toString());

        Animal lion = new Terrestrial("Lion","Manoo",20,true,4);
        Animal Tigre = new Terrestrial("tiger","Tiger",25,true,4);
        Animal Pig = new Terrestrial("pig","pig",22,true,4);
        Animal Zebra = new Terrestrial("zebra","Zebra",20,true,4);

        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            myZoo.addAnimal(Tigre);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            myZoo.addAnimal(Pig);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            myZoo.addAnimal(Zebra);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            Zebra.setAge(-2);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        
        myZoo.removeAnimal(Tigre);
        myZoo.displayAnimals();

        Terrestrial T = new Terrestrial("Girafe","Yassou",4,true,4);
        Dolphin D = new Dolphin("poisson","Nadhmi",5,false,"Ocean",40);
        Penguin P = new Penguin("Oiseau","Islem",3,true,"Neige",20);
        Penguin P1 = new Penguin("Oiseau","Anas",1,true,"Neige",25);
        System.out.println(T);
        System.out.println(D);
        System.out.println(P);

        myZoo.addAquaticAnimal(D);
        myZoo.addAquaticAnimal(P);
        myZoo.addAquaticAnimal(P1);

        myZoo.AquaticAnimals[0].swim();
        myZoo.AquaticAnimals[1].swim();
        myZoo.AquaticAnimals[2].swim();

        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();

        T.eatPlant(Food.PLANT);
        T.eatMeat(Food.MEAT);
        T.eatPlantAndMeat(Food.BOTH);
        P.eatMeat(Food.MEAT);
        D.eatMeat(Food.MEAT);

        scanner.close();
    }
}
