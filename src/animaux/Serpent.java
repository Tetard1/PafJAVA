package animaux;

public class Serpent extends Animal {
    public Serpent(String nom) {
        super(nom);
    }

    public void faireDuBruit() {
        System.out.println(nom + " siffle ");
    }
}