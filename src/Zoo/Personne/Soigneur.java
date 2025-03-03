package Zoo.Personne;

import Zoo.animaux.Animal;

public class Soigneur {
    private String nom;
    private String prenom;
    private String specialite;

    public boolean isEstOccupe() {
        return estOccupe;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private boolean estOccupe;

    public Soigneur(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.estOccupe = false;
    }

    public boolean peutSoigner(Animal animal) {
        return animal.getClass().getSimpleName().equalsIgnoreCase(this.specialite)
                && !estOccupe;
    }

    public boolean diagnostiquer(){
        if (estOccupe){
            System.out.println("Le soigneur est occupé il ne va donc pouvoir se charger de ça !");
            return false;
        }
        return Math.random() < 0.5;
    }

    public void soigner(Animal animal) {
        if (peutSoigner(animal) && diagnostiquer()) {
            animal.setAnimalFaible(false);
            System.out.println(animal.getNomAnimal() + " a été soigné !");
        } else {
            System.out.println("Soin impossible !");
        }
    }

    public void setEstOccupe(boolean etat) {
        this.estOccupe = etat;
        if (etat) System.out.println(nom + " est maintenant en entretien");
    }
}