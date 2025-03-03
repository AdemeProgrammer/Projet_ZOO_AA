package Zoo.enclos;

public class Enclos {
    public int getNumeroEnclos() {
        return numeroEnclos;
    }

    public void setNumeroEnclos(int numeroEnclos) {
        this.numeroEnclos = numeroEnclos;
    }

    public String getTypeEnclos() {
        return typeEnclos;
    }

    public void setTypeEnclos(String typeEnclos) {
        this.typeEnclos = typeEnclos;
    }

    public String getPlaceEnclos() {
        return placeEnclos;
    }

    public void setPlaceEnclos(String placeEnclos) {
        this.placeEnclos = placeEnclos;
    }

    private int numeroEnclos;
    private String typeEnclos;
    private String placeEnclos;

    public Enclos(int numeroEnclos, String animalEnlos) {
        this.numeroEnclos = numeroEnclos;
        this.typeEnclos = typeEnclos;
        this.placeEnclos = placeEnclos;
    }
}
