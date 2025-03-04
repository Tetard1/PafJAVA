package animaux;

public class Elephant extends Animal {
    public Elephant(String nom) {
        super(nom);
    }

    public void faireDuBruit() {
        System.out.println(nom + " gronde bruyamment ");
    }

    public void arroser() {
        System.out.println(nom + " arrose les visiteurs avec de l'eau");
    }
}
