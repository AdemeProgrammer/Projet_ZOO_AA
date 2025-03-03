package Zoo.animaux;

public class Animal {
    private int id_animal;
    private String nomAnimal;
    private String sexeAnimal;
    private int ageAnimal;
    private boolean animalFaible;

    public Animal(int id_animal, String nomAnimal, String sexeAnimal, int ageAnimal, boolean animalFaible) {
        this.id_animal = id_animal;
        this.nomAnimal = nomAnimal;
        this.sexeAnimal = sexeAnimal;
        this.ageAnimal = ageAnimal;
        this.animalFaible = animalFaible;
    }

    public String faireDuBruit() {
        return "Bruit par défaut !";
    }

    public String seDeplacer() {
        return "Se déplace normalement";
    }

    public String getSexeAnimal() { return sexeAnimal; }
    public String getNomAnimal() { return nomAnimal; }
    public int getId_animal() { return id_animal; }
    public int getAgeAnimal() { return ageAnimal; }
    public boolean isAnimalFaible() { return animalFaible; }

    public void setAnimalFaible(boolean etat) {
        this.animalFaible = etat;
    }
}