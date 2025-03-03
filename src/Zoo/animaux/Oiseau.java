package Zoo.animaux;

public class Oiseau extends Animal {
    public Oiseau(int id_animal, String nomAnimal, String sexeAnimal, int ageAnimal, boolean animalFaible) {
        super(id_animal, nomAnimal, sexeAnimal, ageAnimal, animalFaible);
    }

    @Override
    public String faireDuBruit() {
        return "Cui-cui ! ";
    }

    @Override
    public String seDeplacer() {
        return "Vole dans les airs";
    }
}