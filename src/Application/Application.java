package application;

import zoo.Zoo;
import zoo.Enclos;
import personnel.Soigneur;
import personnel.Veterinaire;
import animaux.*;

import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String fin = "";
        int jour = 0;

        // Création du zoo
        Zoo zoo = new Zoo();
        Enclos enclos = new Enclos();

        // Création des soigneurs
        Soigneur paul = new Soigneur("Paul");
        Soigneur marie = new Soigneur("Marie");
        Soigneur lucas = new Soigneur("Lucas");
        Soigneur emma = new Soigneur("Emma");
        Soigneur sophie = new Soigneur("Sophie");
        List<Soigneur> soigneurs = Arrays.asList(paul, marie, lucas, emma, sophie);

        // Création des vétérinaires
        Veterinaire drHouse = new Veterinaire("Dr. House");
        Veterinaire drDolittle = new Veterinaire("Dr. Dolittle");
        List<Veterinaire> veterinaires = Arrays.asList(drHouse, drDolittle);

        // Création des animaux
        Animal simba = new Lion("Simba");
        Animal rio = new Oiseau("Rio");
        Animal kaa = new Serpent("Kaa");
        Animal dumbo = new Elephant("Dumbo");
        Animal jack = new Kangourou("Jack");
        Animal marty = new Zebre("Marty");
        Animal baloo = new Ours("Baloo");
        List<Animal> animaux = Arrays.asList(simba, rio, kaa, dumbo, jack, marty, baloo);

        zoo.ajouterSoigneur(paul);
        zoo.ajouterSoigneur(marie);
        zoo.ajouterSoigneur(lucas);
        zoo.ajouterSoigneur(emma);
        zoo.ajouterSoigneur(sophie);
        zoo.ajouterVeterinaire(drHouse);
        zoo.ajouterVeterinaire(drDolittle);
        zoo.ajouterAnimal(simba);
        zoo.ajouterAnimal(rio);
        zoo.ajouterAnimal(kaa);
        zoo.ajouterAnimal(dumbo);
        zoo.ajouterAnimal(jack);
        zoo.ajouterAnimal(marty);
        zoo.ajouterAnimal(baloo);
        /*
        //Création des enclos
        Enclos jungle = new enclos("Jungle");
        Animal rio = new Oiseau("Rio");
        */
        System.out.println(" Bienvenue au zoo de Bonneval ! ");

        while (!fin.equals("STOP")) {
            jour++;
            System.out.println("\n Jour " + jour + " au zoo de Bonneval ");

            // Réinitialisation des maladies et dégradation des enclos
            for (Animal animal : animaux) {
                animal.resetMaladie();
            }
            enclos.degrader();

            // Simulation d'une journée avec attribution aléatoire des soigneurs et vétérinaires
            simulerJournee(zoo, enclos, soigneurs, veterinaires, animaux, random);

            // Choix du joueur
            System.out.println("\nQue veux-tu faire ? :\n1 - Passer au jour suivant\n2 - STOP (Quitter le zoo)");
            fin = scan.nextLine().toUpperCase();
            while (!fin.equals("1") && !fin.equals("STOP")) {
                System.out.println("Choix invalide, essaie encore !");
                fin = scan.nextLine().toUpperCase();
            }
        }

        System.out.println("\n Oh non, vous quittez déjà notre zoo Mocheval... À bientôt !");
        scan.close();
    }

    public static void simulerJournee(Zoo zoo, Enclos enclos, List<Soigneur> soigneurs, List<Veterinaire> veterinaires,
                                      List<Animal> animaux, Random aleatoire) {
        System.out.println(" Début d'une nouvelle journée au zoo !");

        System.out.println("\n 6h00 - Arrivée des soigneurs !");
        for (Soigneur soigneur : soigneurs) {
            System.out.println(soigneur.getNom() + " est prêt pour la journée !");
        }

        System.out.println("\n 7h00 - Diagnostic des animaux");
        for (Animal animal : animaux) {
            Soigneur soigneur = soigneurs.get(aleatoire.nextInt(soigneurs.size()));
            soigneur.diagnostiquerAnimal(animal);
        }

        System.out.println("\n 8h00 - Nourrissage des animaux");
        for (Animal animal : animaux) {
            Soigneur soigneur = soigneurs.get(aleatoire.nextInt(soigneurs.size()));
            soigneur.nourrirAnimal(animal);
        }

        System.out.println("\n 9h00 - Le zoo ouvre ses portes !");
        System.out.println("\n 14h00 - Spectacles et animations");
        for (Animal animal : animaux) {
            if (!animal.estMalade()) {
                Soigneur soigneur = soigneurs.get(aleatoire.nextInt(soigneurs.size()));
                soigneur.animerSpectacle(animal);
            }
        }

        System.out.println("\n 19h00 - Soins des animaux malades");
        for (Animal animal : animaux) {
            Veterinaire veterinaire = veterinaires.get(aleatoire.nextInt(veterinaires.size()));
            veterinaire.soignerAnimal(animal);
        }

        System.out.println("\n 20h00 - Nettoyage et réparation des enclos");
        if (aleatoire.nextBoolean()) {
            soigneurs.get(aleatoire.nextInt(soigneurs.size())).nettoyerEnclos();
            enclos.nettoyer();
        }
        if (aleatoire.nextInt(3) == 0) {
            soigneurs.get(aleatoire.nextInt(soigneurs.size())).reparerEnclos(enclos);
        }
    }
}
