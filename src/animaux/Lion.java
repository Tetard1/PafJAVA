package animaux;

public class Lion extends Animal {
    public Lion(String nom) {
        super(nom);
    }

    public void faireDuBruit() {
        System.out.println(nom + " rugit ");
    }
}