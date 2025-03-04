package zoo;

import java.util.ArrayList;
import java.util.List;
import personnel.Soigneur;
import animaux.Animal;
import personnel.Veterinaire;

public class Zoo {
    private List<Enclos> enclos;
    private List<Soigneur> soigneurs;
    private List<Animal> animaux;

    public Zoo() {
        this.enclos = new ArrayList<>();
        this.soigneurs = new ArrayList<>();
        this.animaux = new ArrayList<>();
    }

    public void ajouterSoigneur(Soigneur soigneur) {
        soigneurs.add(soigneur);
        System.out.println("Soigneur ajouté : " + soigneur.getNom());
    }

    public void ajouterVeterinaire(Veterinaire veterinaire) {
        veterinaire.add(veterinaire);
        System.out.println("️ Veterinaire ajouté : " + veterinaire.getNom());
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
        System.out.println(" Animal ajouté : " + animal.getNom());
    }

    public void commencerJournee() {
        System.out.println("Le zoo ouvre, préparation en cours...");
        for (Soigneur s : soigneurs) {
            s.preparerZoo();
        }
    }

    public void accueillirVisiteurs() {
        System.out.println("Les visiteurs entrent dans le zoo !");
    }

    public void animationsJour() {
        System.out.println("Animations et spectacles en cours...");
    }

    public void fermerZoo() {
        System.out.println("Le zoo ferme, nettoyage en cours...");
        for (Soigneur s : soigneurs) {
            s.nettoyerEnclos();
        }
    }
}
