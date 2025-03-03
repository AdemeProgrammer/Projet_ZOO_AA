package Zoo.animaux;

public class Lion extends Animal {
    private boolean criniere;
    public Lion(int id_animal, String nomAnimal,String sexeAnimal, int ageAnimal, boolean animalFaible, boolean criniere) {
        super(id_animal, nomAnimal, sexeAnimal, ageAnimal, animalFaible);
        this.criniere = criniere;
    }
    @Override
    public String faireDuBruit() {
        return "Rooaaaarrr ! 🦁";
    }

    @Override
    public String seDeplacer() {
        return "Marche majestueusement";
    }
}

