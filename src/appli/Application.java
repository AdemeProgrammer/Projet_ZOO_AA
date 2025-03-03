package appli;
import Zoo.*;

public class Application {
    // Création d'un soigneur
    Soigneur marc = new Soigneur("Dupont", "Marc", "Lion");

    // Interaction avec un animal
    Lion simba = new Lion(...);
if (marc.peutSoigner(simba)) {
        marc.soigner(simba);
    }

// Gestion de l'entretien
marc.setEstOccupe(true); // Empêche toutes les interactions
}
