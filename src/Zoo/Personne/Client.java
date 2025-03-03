package Zoo.Personne;

public class Client {
    private String nom;
    private int age;
    private String adulteMineur;

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public String getAdulteMineur() {
        return adulteMineur;
    }

    public void setAdulteMineur(String adulteMineur) {
        this.adulteMineur = adulteMineur;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private double montantPaye;

    public void acheterBillet(double prix) {
        this.montantPaye = prix;
        System.out.println(nom + " a payé " + prix + " pour l'entrée.");
    }

    public void interagirAvecAnimal(Animal animal) {
        System.out.println(nom + " interagit avec l'animal : " + animal.getNomAnimal());
    }

    public void assisterSpectacle(Spectacle spectacle) {
        System.out.println(nom + " assiste au spectacle " + spectacle.getNom());
    }
}
