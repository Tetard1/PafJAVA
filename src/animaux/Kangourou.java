package animaux;

public class Kangourou extends Animal {
    public Kangourou(String nom) {
        super(nom);
    }

    public void faireDuBruit() {
        System.out.println(nom + " grogne doucement ");
    }

    public void sauter() {
        System.out.println(nom + " fait un saut énorme pour impressionner le public ");
    }
}
