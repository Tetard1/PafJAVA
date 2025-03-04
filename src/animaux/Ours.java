package animaux;

public class Ours extends Animal {
    public Ours(String nom) {
        super(nom);
    }

    public void faireDuBruit() {
        System.out.println(nom + " grogne puissamment ");
    }

    public void seDresser() {
        System.out.println(nom + " se dresse sur ses pattes pour impressionner les visiteurs ");
    }
}
