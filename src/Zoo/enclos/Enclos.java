package Zoo.enclos;
import Zoo.animaux.Animal;
import java.util.ArrayList;
import java.util.List;


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

    public Enclos(int numeroEnclos, String typeEnclos, String placeEnclos) {
        this.numeroEnclos = numeroEnclos;
        this.typeEnclos = typeEnclos;
        this.placeEnclos = placeEnclos;
    }
    private List<Animal> animaux = new ArrayList<>();
    private int proprete = 100;

    public int getProprete() { return this.proprete; }
    public void setProprete(int p) { this.proprete = p; }
    public List<Animal> getAnimaux() { return this.animaux; }
}
