package personnel;

import animaux.Animal;

public class Veterinaire {
    private String nom;

    public Veterinaire(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void soignerAnimal(Animal animal) {
        if (animal.estMalade()) {
            System.out.println(nom + " soigne " + animal.getNom() + " !");
            animal.soigner();
        } else {
            System.out.println(animal.getNom() + " n'est pas malade.");
        }
    }

    public void add(Veterinaire veterinaire) {

    }
}
