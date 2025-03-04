package personnel;

import animaux.Animal;
import zoo.Enclos;

public class Soigneur {
    private String nom;

    public Soigneur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void diagnostiquerAnimal(Animal animal) {
        System.out.println(nom + " examine " + animal.getNom() + "...");
        if (animal.estMalade()) {
            System.out.println(animal.getNom() + " est malade !");
        } else {
            System.out.println(animal.getNom() + " est en bonne santé !");
        }
    }

    public void nourrirAnimal(Animal animal) {
        System.out.println(nom + " nourrit " + animal.getNom() + "...");
        if (animal.estMalade()) {
            System.out.println( animal.getNom() + " n'a pas beaucoup mangé car il est malade ...");
        } else {
            System.out.println( animal.getNom() + " s'est régalé");
        }
    }

    public void animerSpectacle(Animal animal) {
        System.out.println(nom + " anime un spectacle avec " + animal.getNom() + ".");
        animal.faireDuBruit();
    }

    public void nettoyerEnclos() {
        System.out.println(nom + " nettoie l'enclos.");
    }

    public void reparerEnclos(Enclos enclos) {
        if (enclos.estEndommage()) {
            System.out.println(nom + " répare l'enclos !");
            enclos.reparer();
        } else {
            System.out.println(" L'enclos est déjà en bon état.");
        }
    }

    public void preparerZoo() {
    }
}
