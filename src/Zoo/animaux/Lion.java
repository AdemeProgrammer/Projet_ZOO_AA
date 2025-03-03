package Zoo.animaux;

public class Lion extends Animal {
    private boolean criniere;
    public Lion(int id_animal, String nomAnimal,String sexeAnimal, int ageAnimal, boolean animalFaible, boolean criniere) {
        super(Animal);
        this.criniere = criniere;
    }
}
