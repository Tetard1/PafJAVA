package animaux;

public class Oiseau extends Animal {
    public Oiseau(String nom) {
        super(nom);
    }

    public void faireDuBruit() {
        System.out.println(nom + " chante ");
    }
}