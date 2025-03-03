package Zoo.animaux;

public class Serpent extends Animal {
    public Serpent(int id_animal, String nomAnimal, String sexeAnimal, int ageAnimal, boolean animalFaible) {
        super(id_animal, nomAnimal, sexeAnimal, ageAnimal, animalFaible);
    }

    @Override
    public String faireDuBruit() {
        return "Ssssss ! 🐍";
    }

    @Override
    public String seDeplacer() {
        return "Rampe silencieusement";
    }
}