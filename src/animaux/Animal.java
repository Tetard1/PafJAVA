package animaux;

import java.util.Random;

public abstract class Animal {
    protected String nom;
    private boolean estMalade;
    private static final Random aleatoire = new Random();

    public Animal(String nom) {
        this.nom = nom;
        resetMaladie();
    }

    public void resetMaladie() {
        this.estMalade = aleatoire.nextInt(5) == 0;
        if (estMalade) {
            System.out.println(nom + " est malade aujourd'hui.");
        } else {
            System.out.println(nom + " est en bonne santé.");
        }
    }

    public boolean estMalade() {
        return estMalade;
    }

    public void soigner() {
        estMalade = false;
        System.out.println(nom + " est guéri.");
    }

    public abstract void faireDuBruit();

    // Ajout de la méthode getNom() pour éviter les erreurs
    public String getNom() {
        return nom;
    }
}
