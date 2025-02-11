package Visiteur;

public class Visiteur {

    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private int cp;
    private String ville;
    private String mail;


    public Visiteur(String nom, String mail, String prenom, int age, String adresse, int cp, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.mail = mail;
    }
}