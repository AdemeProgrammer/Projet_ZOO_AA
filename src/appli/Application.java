package appli;

import Zoo.*;
import Zoo.animaux.*;
import Zoo.Personne.*;
import Zoo.enclos.Enclos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static Zoo zoo = new Zoo();
    private static Scanner scanner = new Scanner(System.in);
    private static List<Enclos> enclosList = new ArrayList<>();
    private static List<Soigneur> soigneurs = new ArrayList<>();
    private static List<Client> visiteurs = new ArrayList<>();
    private static double recettes = 0.0;

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            afficherMenuPrincipal();
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1: creerEnclos(); break;
                case 2: ajouterAnimal(); break;
                case 3: ajouterClient(); break;
                case 4: ajouterSoigneur(); break;
                case 5: simulerJournee(); break;
                case 6: vendreBillet(); break;
                case 7: afficherStatistiques(); break;
                case 8: running = false; break;
                default: System.out.println("Option invalide !");
            }
        }
        System.out.println("Au revoir ! 🦁");
    }

    private static void afficherMenuPrincipal() {
        System.out.println("\n=== MENU ZOO ===");
        System.out.println("1. Créer un enclos");
        System.out.println("2. Ajouter un animal");
        System.out.println("3. Ajouter un client");
        System.out.println("4. Engager un soigneur");
        System.out.println("5. Simuler une journée");
        System.out.println("6. Vendre un billet");
        System.out.println("7. Statistiques");
        System.out.println("8. Quitter");
        System.out.print("Votre choix : ");
    }

    private static void creerEnclos() {
        System.out.print("Numéro de l'enclos : ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        Enclos nouvelEnclos = new Enclos(numero, "Général", "Zone Principale");
        enclosList.add(nouvelEnclos);
        System.out.println("Enclos #" + numero + " créé ! 🏟️");
    }

    private static void ajouterAnimal() {
        if (enclosList.isEmpty()) {
            System.out.println("Créez d'abord un enclos !");
            return;
        }

        System.out.print("Type (Lion/Oiseau/Serpent) : ");
        String type = scanner.nextLine();

        Animal animal = null;
        int id = enclosList.get(0).getAnimaux().size() + 1;

        switch (type.toLowerCase()) {
            case "lion":
                animal = new Lion(id, "Lion" + id, "Mâle", 5, false, true);
                break;
            case "oiseau":
                animal = new Oiseau(id, "Oiseau" + id, "Femelle", 2, false);
                break;
            case "serpent":
                animal = new Serpent(id, "Serpent" + id, "Mâle", 3, false);
                break;
            default:
                System.out.println("Type inconnu !");
        }

        if (animal != null) {
            enclosList.get(0).getAnimaux().add(animal);
            System.out.println(animal.getNomAnimal() + " ajouté ! 🐾");
        }
    }

    private static void ajouterSoigneur() {
        System.out.print("Entrez le nom du soigneur : ");
        String nom = scanner.nextLine();
        Soigneur s = new Soigneur(nom, "", "Lion");
        soigneurs.add(s);
        System.out.println(nom + " est prêt à travailler !");
    }

    private static void ajouterClient() {
        System.out.println("Entrez le nom et le prénom du client : ");
        String nom = scanner.nextLine();
        System.out.println("Entrez l'âge du client : ");
        int age = scanner.nextInt();
        Client c = new Client(nom, age);
        visiteurs.add(c);
        System.out.println(nom +" ajouté à la liste des clients !");
    }

    private static void simulerJournee() {
        System.out.println("\n=== NOUVELLE JOURNÉE ===");
        for (Enclos e : enclosList) {
            e.setProprete(e.getProprete() - 20);
            System.out.println("Propreté enclos #" + e.getNumeroEnclos() + " : " + e.getProprete() + "%");
        }
        if (!soigneurs.isEmpty()) {
            soigneurs.get(0).setEstOccupe(true);
            System.out.println(soigneurs.get(0).getNom() + " nettoie les enclos ! 🧼");
        }
    }

    private static void vendreBillet() {
        if (visiteurs.isEmpty()) {
            System.out.println("Aucun client enregistré !");
            return;
        }

        System.out.println("\n=== LISTE DES CLIENTS ===");
        for (int i = 0; i < visiteurs.size(); i++) {
            Client c = visiteurs.get(i);
            System.out.println((i + 1) + ". " + c.getNom() + " (" + c.getAge() + " ans)");
        }

        System.out.print("\nChoisissez un client (numéro) : ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        if (choix < 1 || choix > visiteurs.size()) {
            System.out.println("Numéro invalide !");
            return;
        }

        Client clientChoisi = visiteurs.get(choix - 1);
        clientChoisi.acheterBillet();
        recettes += clientChoisi.getMontantPaye();
        System.out.println("Billet vendu à " + clientChoisi.getNom() + " ! 💰");
    }

    private static void afficherStatistiques() {
        System.out.println("\n=== STATISTIQUES ===");
        System.out.println("Enclos : " + enclosList.size());
        System.out.println("Animaux : " + enclosList.get(0).getAnimaux().size());
        System.out.println("Soigneurs : " + soigneurs.size());
        System.out.println("Clients enregistrés : " + visiteurs.size());
        System.out.println("Recettes totales : " + recettes + " €");
    }
}