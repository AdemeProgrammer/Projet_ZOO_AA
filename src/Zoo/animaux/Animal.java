package Zoo.animaux;

public class Animal {
    // ---------- ATTRIBUTS (données) ----------
    private int id_animal;
    private String nomAnimal;
    private String sexeAnimal;
    private int ageAnimal;
    private boolean animalFaible;

    // ---------- CONSTRUCTEUR (méthode pour créer un animal) ----------
    public Animal(int id_animal, String nomAnimal, String sexeAnimal, int ageAnimal, boolean animalFaible) {
        this.id_animal = id_animal;
        this.nomAnimal = nomAnimal;
        this.sexeAnimal = sexeAnimal;
        this.ageAnimal = ageAnimal;
        this.animalFaible = animalFaible;
    }

    // ---------- METHODES SIMPLES (comportements de base) ----------
    public String faireDuBruit() {
        return "Bruit par défaut !"; // Tous les animaux auront ce bruit sauf si on le change
    }

    public String seDeplacer() {
        return "Se déplace normalement"; // Déplacement de base
    }

    // ---------- GETTERS/SETTERS (accès aux données) ----------
    public String getSexeAnimal() { return sexeAnimal; }
    public String getNomAnimal() { return nomAnimal; }
    public int getId_animal() { return id_animal; }
    public int getAgeAnimal() { return ageAnimal; }
    public boolean isAnimalFaible() { return animalFaible; }

    public void setAnimalFaible(boolean etat) {
        this.animalFaible = etat;
    }
}