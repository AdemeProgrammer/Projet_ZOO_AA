package Zoo.animaux;

public class Animal {
    private int id_animal;
    private String nomAnimal;
    private String sexeAnimal;

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public boolean isAnimalFaible() {
        return animalFaible;
    }

    public String getSexeAnimal() {
        return sexeAnimal;
    }

    public void setSexeAnimal(String sexeAnimal) {
        this.sexeAnimal = sexeAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

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

    public void setAnimalFaible(boolean etat) {
        this.animalFaible = etat;
    }
}