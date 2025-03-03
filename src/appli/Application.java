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
            scanner.nextLine(); // Nettoie l'entrée

            switch (choix) {
                case 1: creerEnclos(); break;
                case 2: ajouterAnimal(); break;
                case 3: ajouterSoigneur(); break;
                case 4: simulerJournee(); break;
                case 5: vendreBillet(); break;
                case 6: afficherStatistiques(); break;
                case 7: running = false; break;
                default: System.out.println("Option invalide !");
            }
        }
        System.out.println("Au revoir ! 🦁");
    }

    // ================= AFFICHAGE DU MENU =================
    private static void afficherMenuPrincipal() {
        System.out.println("\n=== MENU ZOO ===");
        System.out.println("1. Créer un enclos");
        System.out.println("2. Ajouter un animal");
        System.out.println("3. Engager un soigneur");
        System.out.println("4. Simuler une journée");
        System.out.println("5. Vendre un billet");
        System.out.println("6. Statistiques");
        System.out.println("7. Quitter");
        System.out.print("Votre choix : ");
    }

    // ================= CRÉER UN ENCLOS =================
    private static void creerEnclos() {
        System.out.print("Numéro de l'enclos : ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        Enclos nouvelEnclos = new Enclos(numero, "Général", "Zone Principale");
        enclosList.add(nouvelEnclos);
        System.out.println("Enclos #" + numero + " créé ! 🏟️");
    }

    // ================= AJOUTER UN ANIMAL =================
    private static void ajouterAnimal() {
        if (enclosList.isEmpty()) {
            System.out.println("Créez d'abord un enclos !");
            return;
        }

        System.out.print("Type (Lion/Oiseau/Serpent) : ");
        String type = scanner.nextLine();

        // Création avec des valeurs par défaut
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

    // ================= AJOUTER UN SOIGNEUR =================
    private static void ajouterSoigneur() {
        System.out.print("Nom du soigneur : ");
        String nom = scanner.nextLine();

        Soigneur s = new Soigneur(nom, "", "Lion"); // Spécialiste lions par défaut
        soigneurs.add(s);
        System.out.println(nom + " est prêt à travailler ! 🩺");
    }

    // ================= SIMULATION =================
    private static void simulerJournee() {
        System.out.println("\n=== NOUVELLE JOURNÉE ===");

        // Dégradation des enclos
        for (Enclos e : enclosList) {
            e.setProprete(e.getProprete() - 20);
            System.out.println("Propreté enclos #" + e.getNumeroEnclos() + " : " + e.getProprete() + "%");
        }

        // Soigneurs nettoient
        if (!soigneurs.isEmpty()) {
            soigneurs.get(0).setEstOccupe(true);
            System.out.println(soigneurs.get(0).getNom() + " nettoie les enclos ! 🧼");
        }
    }

    // ================= VENTE DE BILLETS =================
    private static void vendreBillet() {
        System.out.print("Âge du visiteur : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Client visiteur = new Client();
        visiteur.setAge(age);
        double prix = (age < 16) ? 10.0 : 20.0;

        recettes += prix;
        visiteurs.add(visiteur);
        System.out.println("Billet vendu : " + prix + " € 💰");
    }

    // ================= STATISTIQUES =================
    private static void afficherStatistiques() {
        System.out.println("\n=== STATISTIQUES ===");
        System.out.println("Enclos : " + enclosList.size());
        System.out.println("Animaux : " + enclosList.get(0).getAnimaux().size());
        System.out.println("Soigneurs : " + soigneurs.size());
        System.out.println("Visiteurs aujourd'hui : " + visiteurs.size());
        System.out.println("Recettes totales : " + recettes + " €");
    }
}