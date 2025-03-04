package animaux;

public class Zebre extends Animal {
    public Zebre(String nom) {
        super(nom);
    }

    public void faireDuBruit() {
        System.out.println(nom + " hennit fort ");
    }

    public void courir() {
        System.out.println(nom + " court à toute vitesse dans l’enclos ️");
    }
}
