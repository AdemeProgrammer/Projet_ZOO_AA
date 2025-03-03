package Zoo;

import Zoo.enclos.Enclos;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    // CORRECTION : Initialisation de la liste
    private List<Enclos> enclos = new ArrayList<>();

    // Ajouter cette méthode
    public List<Enclos> getEnclos() {
        return enclos;
    }

}